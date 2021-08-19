package com.zt.sms.mixcloud.server;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContext;
import io.grpc.netty.shaded.io.netty.handler.ssl.SslContextBuilder;

import java.io.File;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

public class Server {

    private io.grpc.Server server;

    private void start() throws Exception{
        // 初始化 SSL 上下文
        File keyCertChainFile = new File("C:\\Program Files\\OpenSSL-Win64\\bin\\server.pem");
        File keyFile = new File("C:\\Program Files\\OpenSSL-Win64\\bin\\server.key");
        SslContextBuilder builder = SslContextBuilder.forServer(keyCertChainFile, keyFile);
        SslContext sslContext = GrpcSslContexts.configure(builder).build();


        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1",6000);
        server = NettyServerBuilder.forAddress(socketAddress)
                .keepAliveTime(300, TimeUnit.SECONDS)
                .addService(new SMSServerGrpcImpl())
                .sslContext(sslContext)
                .build();

        server.start();
        System.out.println("service start...");

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                Server.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws Exception {
        final Server application = new Server();
        application.start();
        application.blockUntilShutdown();
    }

}
