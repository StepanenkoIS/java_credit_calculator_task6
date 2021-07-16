package ru.credit.calculator.client.dao;

import ru.credit.calculator.client.entity.UserEntity;

import javax.ejb.Local;
import java.util.List;



public interface UserEntityEJBInterface {
    boolean checkPassword(String login, String password);
    boolean createUser(String login, String password);
    List<UserEntity> getAllUser();
}
