package ru.credit.calculator.client.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userentity")
public class UserEntity {

    @Id
    @Column(name="login")
    private String login;
    @Column(name="password")
    private String password;
/*    @Column(name="role")
    private String role;
    @Column(name="second_name")
    private String second_name;
    @Column(name="first_name")
    private String first_name;
    @Column(name="middle_name")
    private String middle_name;*/

    public UserEntity() {
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
}
