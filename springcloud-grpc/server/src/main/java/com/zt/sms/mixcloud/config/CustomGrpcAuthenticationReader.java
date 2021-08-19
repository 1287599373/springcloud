package com.zt.sms.mixcloud.config;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import net.devh.boot.grpc.server.security.authentication.GrpcAuthenticationReader;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import javax.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class CustomGrpcAuthenticationReader implements GrpcAuthenticationReader {
    private final Logger log = LoggerFactory.getLogger(CustomGrpcAuthenticationReader.class);
    public static final Metadata.Key<byte[]> USERNAME;
    public static final Metadata.Key<byte[]> PASSWORD;
    public static final Metadata.Key<byte[]> T_KEY;

    static {
        USERNAME = Metadata.Key.of("username-bin", Metadata.BINARY_BYTE_MARSHALLER);
        PASSWORD = Metadata.Key.of("password-bin", Metadata.BINARY_BYTE_MARSHALLER);
        T_KEY = Metadata.Key.of("tKey-bin", Metadata.BINARY_BYTE_MARSHALLER);
    }

    @Nullable
    @Override
    public Authentication readAuthentication(ServerCall<?, ?> call, Metadata headers) throws AuthenticationException {
        String username = new String(headers.get(USERNAME), StandardCharsets.UTF_8);
        String password = new String(headers.get(PASSWORD), StandardCharsets.UTF_8);
        String tKey = new String(headers.get(T_KEY), StandardCharsets.UTF_8);
        if (StringUtils.isAnyBlank(username, password, tKey)) {
            log.debug("No basic auth header found");
            return null;
        }

        Map<Metadata.Key<byte[]>, String> credentialsMap = new HashMap<>();
        credentialsMap.put(PASSWORD,password);
        credentialsMap.put(T_KEY, tKey);
        return new UsernamePasswordAuthenticationToken(username, credentialsMap);
    }
}
