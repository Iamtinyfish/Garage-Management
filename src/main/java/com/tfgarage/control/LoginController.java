package com.tfgarage.control;

import com.tfgarage.model.ejb.interfaces.local.AccountEJBLocal;
import com.tfgarage.utils.SessionUtils;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.security.enterprise.AuthenticationStatus;
import jakarta.security.enterprise.SecurityContext;
import jakarta.security.enterprise.authentication.mechanism.http.AuthenticationParameters;
import jakarta.security.enterprise.credential.Password;
import jakarta.security.enterprise.credential.UsernamePasswordCredential;
import jakarta.validation.constraints.Pattern;
import java.io.Serializable;

@Named
@SessionScoped
public class LoginController implements Serializable {
    private static final long serialVersionUID = 5443351151396868724L;

    @EJB
    private AccountEJBLocal accountEJB;

    @Pattern(regexp = "^[a-zA-Z](_|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$",
            message = "* Username can only contain letters, numbers, and underscores.\n" +
                      "* Must be between 5 and 20 characters long.\n" +
                      "* Must start with a letter and end with a letter or number")
    private String username;

    @Pattern(regexp = "[^\\s\\n]{6,}", message = "* Password must be at least 6 characters and contain no spaces")
    private String password;

    private boolean rememberMe;

    @Inject
    private FacesContext facesContext;

    @Inject
    private SecurityContext securityContext;

    private AuthenticationStatus processAuthentication() {
        return securityContext.authenticate(SessionUtils.getHttpRequest(),
                                            SessionUtils.getHttpResponse(),
                                            AuthenticationParameters.withParams()
                                                    .credential(new UsernamePasswordCredential(username,new Password(password))));
    }

    public String execute() {
        String gotoView = null;
        switch (processAuthentication()) {
            case SEND_CONTINUE:
                facesContext.responseComplete();
                break;
            case SEND_FAILURE:
                facesContext.addMessage("loginForm",new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                        "* Incorrect Username and Password\n",null));
                gotoView = "login";
                break;
            case SUCCESS:
                SessionUtils.getSession().setAttribute("username", username);
                gotoView = "account";
                break;
            case NOT_DONE:
                facesContext.addMessage("loginForm",new FacesMessage(FacesMessage.SEVERITY_ERROR,
                                        "* The system is busy, please try later\n",null));
                gotoView = "login";
                break;
        }
        return gotoView;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
