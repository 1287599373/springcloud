package com.zt.sms.mixcloud.controller;

import com.zt.sms.mixcloud.client.SMSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class SMSController {

    @Autowired
    private SMSClient smsClient;

    @RequestMapping("/sendSms")
    public void sendSms2(@RequestParam String content){
        smsClient.sendSMS2(com.zt.sms.mixcloud.provider.grpc.proto.SMS.CustomizeSendSMSRequest.newBuilder()
                .setMobile("13636379856")
                .setContent(content)
//                .setTime("2021-08-07")
                .setExt(1045)
//                .setExtend("code=0101")
                .build());
    }

    @RequestMapping("/report")
    public void report(@RequestParam Integer count){
        smsClient.report(count);
    }

    @RequestMapping("/reply")
    public void reply(@RequestParam Integer count){
        smsClient.reply(count);
    }
}
