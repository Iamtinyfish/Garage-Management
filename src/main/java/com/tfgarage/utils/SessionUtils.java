package com.tfgarage.utils;

import jakarta.faces.context.FacesContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionUtils {
    public static HttpSession getSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    }

    public static HttpServletRequest getHttpRequest() {
        return (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
    }

    public static HttpServletResponse getHttpResponse() {
        return (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
    }

    public static String getUsername() {
        HttpSession httpSession = getSession();
        if (httpSession != null)
            return httpSession.getAttribute("username").toString();
        else
            return null;
    }

    public static String getUserId() {
        HttpSession httpSession = getSession();
        if (httpSession != null)
            return httpSession.getAttribute("userid").toString();
        else
            return null;
    }
}
