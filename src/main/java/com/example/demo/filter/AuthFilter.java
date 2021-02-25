package com.example.demo.filter;

import com.example.demo.util.RequestUtil;

import javax.servlet.*;
import java.io.IOException;

public class AuthFilter implements Filter {

    RequestUtil util;

    public AuthFilter(RequestUtil util) {
        this.util = util;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Through AuthFilter");
        System.out.println(util.getUrl());

        chain.doFilter(request, response);
    }
}
