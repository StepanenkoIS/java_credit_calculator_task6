package ru.credit.calculator.client.dao;

import ru.credit.calculator.client.entity.UserEntity;

import java.util.List;

public interface UserEntityEJBInterface {

    List<UserEntity> getAllUser();
}
