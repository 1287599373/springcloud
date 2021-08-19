package com.zt.sms.mixcloud.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.DigestUtils;

public class CustomUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //从redis取账号信息
        return new CustomUserDetails("张三", DigestUtils.md5DigestAsHex("123456".getBytes()),true, true, true, true, null);
    }
}
