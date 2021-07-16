package ru.java.credit.calculator.ejb.dao;

import ru.credit.calculator.client.dao.UserEntityEJBInterface;
import ru.credit.calculator.client.entity.UserEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;


@Stateless
public class UserEntityEJB implements UserEntityEJBInterface {

    @PersistenceContext(unitName = "postgresPool")
    private EntityManager entityManager;

    public boolean checkPassword(String login, String password) {
        if (login == null || login.isEmpty() || password == null || password.isEmpty()) {
            return false;
        }

        UserEntity userEntity = entityManager.find(UserEntity.class, login);
        if (userEntity == null) {
            return false;
        }

        return password.equals(userEntity.getPassword());
    }

    public boolean createUser(String login, String password) {
        if (login == null || login.isEmpty() || password == null || password.isEmpty()) {
            return false;
        }

        UserEntity userEntity = entityManager.find(UserEntity.class, login);
        if (userEntity != null) {
            return false;
        }

        userEntity = new UserEntity();
        userEntity.setLogin(login);
        userEntity.setPassword(password);
        entityManager.persist(userEntity);
        return true;
    }

    public List<UserEntity> getAllUser() {
        Query query = entityManager.createQuery("select entity from UserEntity entity");
        return query.getResultList();
    }
}
