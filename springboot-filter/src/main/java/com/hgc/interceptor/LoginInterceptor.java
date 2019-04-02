package com.hgc.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: zcs
 * @create: 2019/1/4 16:56
 **/
public class LoginInterceptor implements HandlerInterceptor{
    /**
     * 前置拦截，进入controller方法之前
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor----->preHandle");
//        String token=request.getParameter("access_token");
//        response.getWriter().print("fail");
        return HandlerInterceptor.super.preHandle(request,response,handler);
    }

    /**
     * 调用完controller之后，视图渲染之前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("LoginInterceptor--->postHandle");
        HandlerInterceptor.super.postHandle(request,response,handler,modelAndView);
    }

    /**
     * 后置拦截:整个完成之后，通常用于资源清理
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("LoginInterceptor--->afterCompletion");
        HandlerInterceptor.super.afterCompletion(request,response,handler,ex);
    }
}
