package ru.java.credit.calculator.ejb.dao;

import ru.credit.calculator.client.dao.UserEntityEJBInterface;
import ru.credit.calculator.client.entity.UserEntity;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;


@Stateless
public class UserEntityEJB implements UserEntityEJBInterface {

    @PersistenceContext(unitName = "postgresPool")
    private EntityManager entityManager;

    public List<UserEntity> getAllUser() {
        Query query = entityManager.createQuery("select entity from UserEntity entity");
        return query.getResultList();
    }
}
