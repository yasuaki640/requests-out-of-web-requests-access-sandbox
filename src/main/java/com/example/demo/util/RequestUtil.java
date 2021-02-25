package com.example.demo.util;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class RequestUtil {

    private final HttpServletRequest request;

    public RequestUtil(HttpServletRequest request) {
        this.request = request;
    }

    public String getUrl() {
        return this.request.getRequestURL().toString();
    }
}
