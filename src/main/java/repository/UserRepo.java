package repository;

import model.UsersModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Simple in-memory user repository with web-app USERS_MODELS
 */
public class UserRepo {
    private static final List<UsersModel> USERS_MODELS;

    static {
        USERS_MODELS = Collections.synchronizedList(new ArrayList<>());
        USERS_MODELS.add(new UsersModel(1, "admin@gmail.com", "admin", "admin", "Admin"));
        USERS_MODELS.add(new UsersModel(2, "user1@gmail.com", "User1", "user1", "Vsevolod"));
        USERS_MODELS.add(new UsersModel(3, "user2@gmail.com", "User2", "user2", "Vladislav"));
    }

    public static boolean checkUserCredentials(String login, String password) {
        return USERS_MODELS.stream()
                .anyMatch(usersModel -> usersModel.getLogin().equals(login) &&
                        usersModel.getPassword().equals(password));
    }

    public static List<UsersModel> getAllUsers() {
        return USERS_MODELS;
    }
}
