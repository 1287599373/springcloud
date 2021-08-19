package com.zt.sms.mixcloud.server;

import com.zt.sms.mixcloud.proto.SMS;
import com.zt.sms.mixcloud.proto.SMSServerGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class SMSServerGrpcImpl extends SMSServerGrpc.SMSServerImplBase {

    @Override
    public void sendSms(SMS.DiySMSRequest request, StreamObserver<SMS.DiySMSResponse> responseObserver) {
        System.out.println("username: "+ request.getUsername());
        System.out.println("password: "+ request.getPassword());
        System.out.println("tKey: "+ request.getTKey());
        System.out.println("mobile: "+ request.getMobile());
        System.out.println("content: "+ request.getContent());
        System.out.println("time: "+ request.getTime());
        System.out.println("ext: "+ request.getExt());
        System.out.println("extend: "+ request.getExtend());
        SMS.DiySMSResponse response = SMS.DiySMSResponse.newBuilder()
                .setCode(0)
                .setMsg("success")
                .setMsgId("12534567890")
                .setContNum(10000)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
