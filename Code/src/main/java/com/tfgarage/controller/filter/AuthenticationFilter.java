package com.tfgarage.controller.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Properties;

@WebFilter(filterName = "AuthenticationFilter", urlPatterns = {"/*"})
public class AuthenticationFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String uri = httpRequest.getRequestURI();
        try {
            //get resource name
            int lastIndex = uri.lastIndexOf("/");
            String resource = uri.substring(lastIndex+1);

            //get authentication properties
            ServletContext context = request.getServletContext();
            Properties authenticationProperties = (Properties) context.getAttribute("AUTHENTICATION");
            HttpSession session = httpRequest.getSession(false);

            //check resource authentication
            String rule = (String) authenticationProperties.getProperty(resource);
            if (rule != null && rule.equals("restricted")) {
                if (session == null || session.getAttribute("USER") == null) {
                    ((HttpServletResponse) response).sendRedirect("loginPage");
                }
            }
            chain.doFilter(request, response);
        } catch (Throwable e) {
            e.getMessage();
        }
    }
}
