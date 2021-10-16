package com.tfgarage.controller.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Properties;

@WebFilter(filterName = "DispatcherFilter", urlPatterns = {"/*"},
        dispatcherTypes = {DispatcherType.REQUEST,DispatcherType.FORWARD})
public class DispatcherFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String uri = httpRequest.getRequestURI();
        String url = null;
        try {
            //get site map
            ServletContext context = request.getServletContext();
            Properties sitemap = (Properties) context.getAttribute("SITEMAP");

            //get resource name
            int lastIndex = uri.lastIndexOf("/");
            String resource = uri.substring(lastIndex+1);

            //get site mapping
            url = sitemap.getProperty(resource);
            if (url != null) {
                RequestDispatcher rd = request.getRequestDispatcher(url);
                rd.forward(request,response);
            } else {
                chain.doFilter(request, response);
            }
        } catch (Throwable e) {
            e.getMessage();
        }
    }
}
