package model;

import java.util.Objects;

/**
 * Model class for web-app users
 */
public class UsersModel {
    private Integer id;
    private String email;
    private String login;
    private String password;
    private String fullName;

    public UsersModel() {
    }

    public UsersModel(Integer id, String email, String login, String password, String fullName) {
        this.id = id;
        this.email = email;
        this.login = login;
        this.password = password;
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersModel usersModel = (UsersModel) o;
        return Objects.equals(id, usersModel.id) && Objects.equals(email, usersModel.email) && Objects.equals(login, usersModel.login) && Objects.equals(password, usersModel.password) && Objects.equals(fullName, usersModel.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, login, password, fullName);
    }

    @Override
    public String toString() {
        return "UsersModel{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
