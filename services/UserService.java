package services;

import models.User;
import utils.Database;

public class UserService {

    private Database db = new Database();

    public boolean registerUser(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        User user = new User(name);
        return db.save(user);
    }
}
