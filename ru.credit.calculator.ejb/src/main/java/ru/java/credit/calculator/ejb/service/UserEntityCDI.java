package ru.java.credit.calculator.ejb.service;

import ru.credit.calculator.client.dao.UserEntityEJBInterface;
import ru.java.credit.calculator.ejb.dao.UserEntityEJB;
import ru.credit.calculator.client.entity.UserEntity;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@SessionScoped
public class UserEntityCDI implements Serializable  {

    private String login;
    private String password;

    private boolean loginSuccess;
    private boolean createSuccess;

    @EJB
    private UserEntityEJBInterface userEntityEJB;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
    }

    public boolean isCreateSuccess() {
        return createSuccess;
    }

    public void setCreateSuccess(boolean createSuccess) {
        this.createSuccess = createSuccess;
    }

    public UserEntityEJB getUserEntityEJB() {
        return new UserEntityEJB();
    }

    public void setUserEntityEJB(UserEntityEJB userEntityEJB) {
        this.userEntityEJB = userEntityEJB;
    }

    public void checkPassword() {
        loginSuccess = userEntityEJB.checkPassword(login, password);
    }

    public void createUser() {
        createSuccess = userEntityEJB.createUser(login, password);;
    }

    public List<UserEntity> getAllUsers() {
        return userEntityEJB.getAllUser();
    }
}
