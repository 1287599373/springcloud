package com.zt.sms.mixcloud.config;

import io.grpc.Metadata;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.DigestUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CustomDaoAuthenticationProvider extends DaoAuthenticationProvider {

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        Object credentials;
        if ((credentials = authentication.getCredentials()) == null || !credentials.getClass().isAssignableFrom(HashMap.class)) {
            this.logger.debug("Authentication failed: no credentials provided");
            throw new BadCredentialsException(this.messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
        } else {
            Map<Metadata.Key<byte[]>, String> credentialsMap = (Map<Metadata.Key<byte[]>, String>)credentials;
            String presentedPassword = credentialsMap.get(CustomGrpcAuthenticationReader.PASSWORD); //MD5 + tKey加密之后的密码
            String tKey = credentialsMap.get(CustomGrpcAuthenticationReader.T_KEY);//时间

            if(!NumberUtils.isDigits(tKey) || !checkTime(Long.parseLong(tKey))){
                this.logger.debug("Authentication failed: 加密密码已过期");
                throw new BadCredentialsException(this.messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "加密密码已过期"));
            }

//            smsCodeEnum = utilService.userAuthentication(smsCancelTimingRequest, redisUserInfoSms, ip);
//            if (ToolUtil.isNotEmpty(smsCodeEnum)) {
//                return warnSmsCancelTimingHandler(BusinessIdEnum.REPLY_AUTHENTICATION, smsCodeEnum, smsCancelTimingRequest);
//            }

            String md5_password = MD5Encoder(userDetails.getPassword(), tKey);
            if (!presentedPassword.equals(md5_password)) {
                this.logger.debug("Authentication failed: password does not match stored value");
                throw new BadCredentialsException(this.messages.getMessage("AbstractUserDetailsAuthenticationProvider.badCredentials", "Bad credentials"));
            }
        }
    }

    private boolean checkTime(Long tKey){
        long t = System.currentTimeMillis()/1000 - tKey;
        return  t <= 60 * 60 && t >= 0; //加密密码五分钟内有效
    }

    private String MD5Encoder(String... objs){
        final StringBuilder sb = new StringBuilder();
        Arrays.stream(objs).forEach(obj -> {
            sb.append(obj);
        });
        return DigestUtils.md5DigestAsHex(sb.toString().getBytes());
    }
}
