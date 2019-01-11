package com.example.demo.controller.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by xuwencong on 2018/8/10
 */
@Slf4j
@WebFilter(filterName="producerFilter",urlPatterns={"/*"})
@Order(2)
public class BroducerFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("producer filter 初始化");
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

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        log.info("6666666666666666");

        FilterRegistrationBean registration = new FilterRegistrationBean();

        //当过滤器有注入其他bean类时，可直接通过@bean的方式进行实体类过滤器，这样不可自动注入过滤器使用的其他bean类。

        //当然，若无其他bean需要获取时，可直接new CustomFilter()，也可使用getBean的方式。

        registration.setFilter(customFilter());
        //过滤器名称
        registration.setName("customFilter");

        //拦截路径
        registration.addUrlPatterns("/*");

        //设置顺序
        registration.setOrder(10);
        return registration;

    }


    @Bean
     public Filter customFilter() {
        log.info("777777777777777");
        return new CustomFilter();
    }
}
