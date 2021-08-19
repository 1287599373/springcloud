package com.zt.sms.mixcloud.config;

import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import net.devh.boot.grpc.server.security.authentication.*;
import net.devh.boot.grpc.server.security.interceptors.AuthenticatingServerInterceptor;
import net.devh.boot.grpc.server.security.interceptors.DefaultAuthenticatingServerInterceptor;
import net.devh.boot.grpc.server.serverfactory.GrpcServerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Configuration
public class GRPCServerConfig {

    @Bean
    public GrpcAuthenticationReader basicGrpcAuthenticationReader(){
        return new CustomGrpcAuthenticationReader();
    }

    @Bean
    public AuthenticatingServerInterceptor authenticatingServerInterceptor(){
        return new DefaultAuthenticatingServerInterceptor(authenticationManager(), basicGrpcAuthenticationReader());
    }

    @Bean
    public UserDetailsService customUserDetailService(){
        return new CustomUserDetailService();
    }

    @Bean
    public AuthenticationManager authenticationManager() {
        final List<AuthenticationProvider> providers = new ArrayList<>();
        DaoAuthenticationProvider provider = new CustomDaoAuthenticationProvider();
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        provider.setUserDetailsService(customUserDetailService());
        providers.add(provider);
        AuthenticationManager authenticationManager = new ProviderManager(providers);
        return authenticationManager;
    }

//    @Bean
//    public AuthenticationManager authenticationManager() {
//        final List<AuthenticationProvider> providers = new ArrayList<>();
//        providers.add(new X509CertificateAuthenticationProvider(customUserDetailService()));
//        return new ProviderManager(providers);
//    }
//
//    @Bean
//    public GrpcAuthenticationReader authenticationReader() {
//        final List<GrpcAuthenticationReader> readers = new ArrayList<>();
//        readers.add(new SSLContextGrpcAuthenticationReader());
//        return new CompositeGrpcAuthenticationReader(readers);
//    }

    @Bean
    public GrpcServerConfigurer keepAliveServerConfigurer() {
        return serverBuilder -> {
            if (serverBuilder instanceof NettyServerBuilder) {
                ((NettyServerBuilder) serverBuilder)
                        .keepAliveTime(30, TimeUnit.SECONDS)
                        .keepAliveTimeout(5, TimeUnit.SECONDS)
                        .permitKeepAliveWithoutCalls(true);
            }
        };
    }


}
