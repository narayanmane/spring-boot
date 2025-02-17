package com.example.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public  class Logininterceptor  implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
	//	return HandlerInterceptor.super.preHandle(request, response, handler);
		System.out.println("prehandler called before request send controller-->"+request.getRequestURI());
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		//HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		System.out.println("posthandler called after response send controller-->"+request.getRequestURI());
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		//HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		System.out.println("after completion called ");
	}
			
}
