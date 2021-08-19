package com.zt.sms.mixcloud.client;

import com.alibaba.fastjson.JSONObject;
import com.zt.sms.mixcloud.provider.grpc.proto.SMSServiceGrpc;
import io.grpc.Channel;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Component;

@Component
public class SMSClient {

    @GrpcClient("grpc-server")
    private Channel channel;

    public void sendSMS2(com.zt.sms.mixcloud.provider.grpc.proto.SMS.CustomizeSendSMSRequest request){
        SMSServiceGrpc.SMSServiceBlockingStub stub = SMSServiceGrpc.newBlockingStub(this.channel);
        com.zt.sms.mixcloud.provider.grpc.proto.SMS.CustomizeSendSMSResponse response = stub.sendSms(request);
        System.out.println(response.getCode());
        System.out.println(response.getMsg());
        System.out.println(response.getMsgId());
        System.out.println(response.getContNum());
    }

    public void report(Integer count){
        com.zt.sms.mixcloud.provider.grpc.proto.SMS.PullReportRequest request = com.zt.sms.mixcloud.provider.grpc.proto.SMS.PullReportRequest.newBuilder()
                .setCount(count).build();
        SMSServiceGrpc.SMSServiceBlockingStub stub = SMSServiceGrpc.newBlockingStub(this.channel);
        com.zt.sms.mixcloud.provider.grpc.proto.SMS.PullReportResponse response = stub.pullReport(request);
        System.out.println(JSONObject.toJSONString(response.getCode()));
        System.out.println(JSONObject.toJSONString(response.getMsg()));
        response.getRecordsList().forEach(record -> {
            System.out.println(JSONObject.toJSONString(record));
        });
    }

    public void reply(Integer count) {
        com.zt.sms.mixcloud.provider.grpc.proto.SMS.PullReplyRequest request = com.zt.sms.mixcloud.provider.grpc.proto.SMS.PullReplyRequest.newBuilder()
                .setCount(count).build();
        SMSServiceGrpc.SMSServiceBlockingStub stub = SMSServiceGrpc.newBlockingStub(this.channel);
        com.zt.sms.mixcloud.provider.grpc.proto.SMS.PullReplyResponse response = stub.pullReply(request);
        System.out.println(JSONObject.toJSONString(response.getCode()));
        System.out.println(JSONObject.toJSONString(response.getMsg()));
        response.getRecordsList().forEach(record -> {
            System.out.println(JSONObject.toJSONString(record));
        });
    }
}
