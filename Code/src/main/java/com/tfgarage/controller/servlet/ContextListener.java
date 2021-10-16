package com.tfgarage.controller.servlet;

import com.tfgarage.controller.utils.PropertiesFileLoad;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.util.Properties;

@WebListener
public class ContextListener implements ServletContextListener, HttpSessionListener, HttpSessionAttributeListener {

    public ContextListener() {
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        /* This method is called when the servlet context is initialized(when the Web application is deployed). */
        ServletContext context = sce.getServletContext();

        //================================Load site map properties================================//
        String siteMapLocation = context.getInitParameter("SITEMAP_PROPERTIES_FILE_LOCATION");
        Properties siteMapProperties = PropertiesFileLoad.getProperties(context,siteMapLocation);
        context.setAttribute("SITEMAP",siteMapProperties);
        //========================================================================================//

        //================================Load authentication properties================================//
        String authenticationLocation = context.getInitParameter("AUTHENTICATION_PROPERTIES_FILE_LOCATION");
        Properties authenticationProperties = PropertiesFileLoad.getProperties(context,authenticationLocation);
        context.setAttribute("AUTHENTICATION",authenticationProperties);
        //==============================================================================================//
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        /* This method is called when the servlet Context is undeployed or App Server shuts down. */
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is added to a session. */
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is removed from a session. */
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent sbe) {
        /* This method is called when an attribute is replaced in a session. */
    }
}
