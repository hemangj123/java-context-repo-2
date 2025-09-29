package utils;

import models.User;

public class Database {
    public boolean save(User user) {
        System.out.println("Saving user: " + user.getName());
        // pretend to save into DB
        return true;
    }
}
