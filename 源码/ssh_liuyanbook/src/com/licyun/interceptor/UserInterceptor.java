package com.licyun.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin
 * Description:
 * 2020/10/2.
 */
public class UserInterceptor implements HandlerInterceptor {
    //拦截前处理
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception{
        Object sessionobj = request.getSession().getAttribute("user");
        if(sessionobj != null){
            return true;
        }else{
            response.sendRedirect(request.getContextPath() +"/user/login");
            return false;
        }
    }
    //拦截后处理
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView mav) throws  Exception{}
    //全部完成后处理
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws  Exception{}
}
