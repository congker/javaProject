package com.example.demo.controller.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by xuwencong on 2018/8/10
 */
@Slf4j
@WebFilter(filterName="customFilter",urlPatterns={"/*"})
@Order(3)
public class CustomFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter 初始化");
    }



    @Override

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // TODO Auto-generated method stub
        log.info("doFilter 请求处理");
        // 比如设置请求编码
        // request.setCharacterEncoding("UTF-8");

        //TODO 进行业务逻辑
        //链路 直接传给下一个过滤器
        chain.doFilter(request, response);

    }


    @Override
    public void destroy() {
        log.info("filter 销毁");

    }
}
