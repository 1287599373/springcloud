package com.study.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourcesController {

    @GetMapping("/resources")
    @PreAuthorize(value = "hasRole(\"ROLE_ADMIN2\")")
    public Authentication resources(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(authentication.getPrincipal());
        return authentication;
    }

    @GetMapping("/api/get")
    public String get(){
        return "get success";
    }

}
