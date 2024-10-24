package org.rahul.cms.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

//        System.out.println("Incoming request data:");
//        System.out.println("Method: " + httpRequest.getMethod());
//        System.out.println("Request URI: " + httpRequest.getRequestURI());
//
//
//        // You can also log response information if necessary
//        System.out.println("Outgoing response data:");
//        System.out.println("ContentType: " + response.getContentType());
//        System.out.println("ContentLength: " + response.getBufferSize());
//        System.out.println("Status: " + ((HttpServletResponse) response).getStatus());
//
//        System.out.println("=======================================");

        System.out.println("Logging Filter is called...");
        // Continue with the next filter in the chain or the target resource
        chain.doFilter(request, response);
    }
}
