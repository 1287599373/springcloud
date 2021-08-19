package com.zt.sms.mixcloud.config;

import io.grpc.ClientInterceptor;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;
import net.devh.boot.grpc.client.interceptor.GlobalClientInterceptorConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.DigestUtils;

import java.util.Arrays;

@Configuration
public class GrpcClientConfig {

    @Value("${zt.username}")
    private String username;
    @Value("${zt.password}")
    private String password;

    public static final Metadata.Key<String> USERNAME;
    public static final Metadata.Key<String> PASSWORD;
    public static final Metadata.Key<String> T_KEY;

    static {
        USERNAME = Metadata.Key.of("username", Metadata.ASCII_STRING_MARSHALLER);
        PASSWORD = Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER);
        T_KEY = Metadata.Key.of("tkey", Metadata.ASCII_STRING_MARSHALLER);
    }

    @Bean
    public GlobalClientInterceptorConfigurer basicAuthInterceptorConfigurer() {
        return registry -> registry.addClientInterceptors(grpcCallCredentialsInterceptor());
    }

    private static String MD5Encoder(String... objs){
        final StringBuilder sb = new StringBuilder();
        Arrays.stream(objs).forEach(obj -> {
            sb.append(obj);
        });
        return DigestUtils.md5DigestAsHex(sb.toString().getBytes());
    }


    @Bean
    public ClientInterceptor grpcCallCredentialsInterceptor()  {
        Metadata metadata = new Metadata();
        Long tKey = System.currentTimeMillis()/1000;
        metadata.put(USERNAME, username);
        metadata.put(PASSWORD, MD5Encoder(MD5Encoder(password), tKey.toString()));
        metadata.put(T_KEY, tKey.toString());

        return MetadataUtils.newAttachHeadersInterceptor(metadata);
    }

}
