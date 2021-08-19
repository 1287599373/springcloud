package com.zt.sms.mixcloud.config;

import io.grpc.*;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;

@GrpcGlobalServerInterceptor
public class IpServerInterceptor implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        System.out.println(metadata);
        System.out.println("remote addr:" + serverCall.getAttributes().get(Grpc.TRANSPORT_ATTR_REMOTE_ADDR).toString());
        System.out.println("local address: " + serverCall.getAttributes().get(Grpc.TRANSPORT_ATTR_LOCAL_ADDR).toString());
        return serverCallHandler.startCall(serverCall,metadata);
    }
}
