package com.echarts.filter;

import com.echarts.controller.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LogCostFilter implements Filter {

    private static final Logger logger  = LoggerFactory.getLogger(LogCostFilter.class);
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        HttpServletRequest a = (HttpServletRequest)servletRequest;
//        System.out.println("Execute cost="+(System.currentTimeMillis()-start));
        logger.info(a.getRequestURL()+"Execute cost="+(System.currentTimeMillis()-start));
    }

    @Override
    public void destroy() {

    }
}
