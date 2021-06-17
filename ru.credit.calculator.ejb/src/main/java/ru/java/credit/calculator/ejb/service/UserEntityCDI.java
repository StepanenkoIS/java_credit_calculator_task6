package ru.java.credit.calculator.ejb.service;

import ru.java.credit.calculator.ejb.dao.UserEntityEJB;
import ru.credit.calculator.client.entity.UserEntity;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;


@Named
@SessionScoped
public class UserEntityCDI implements Serializable  {

    private String login;
    private String password;
    private String role;
    private String second_name;
    private String first_name;
    private String middle_name;

    @EJB
    private UserEntityEJB userEntityEJB;

    public List<UserEntity> getAllUsers() {
        return userEntityEJB.getAllUser();
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public UserEntityEJB getUserEntityEJB() {
        return userEntityEJB;
    }

    public void setUserEntityEJB(UserEntityEJB userEntityEJB) {
        this.userEntityEJB = userEntityEJB;
    }
}
