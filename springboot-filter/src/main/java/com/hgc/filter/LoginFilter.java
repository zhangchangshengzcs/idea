package com.hgc.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: zcs
 * @create: 2019/1/3 13:52
 **/
//@WebFilter(urlPatterns = "/api/*",filterName = "loginFilter")
public class LoginFilter implements Filter {

    /**
     * 容器加载的时候调用
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init loginFilter");
    }

    /**
     * 请求被拦截的时候进行调用
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter loginFilter");
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;
        String username=request.getParameter("username");
//        if("xdClass".equals(username)){
//            filterChain.doFilter(servletRequest,servletResponse);
//        }else{
//            response.sendRedirect("/index.html");
//            return;
//        }
        filterChain.doFilter(servletRequest,servletResponse);
        return;

    }

    @Override
    public void destroy() {
        System.out.println("destroy loginFilter");
    }
}
