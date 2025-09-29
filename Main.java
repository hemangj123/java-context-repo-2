package app;

import services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String username = "Alice";

        if (userService.registerUser(username)) {
            System.out.println("User " + username + " registered successfully!");
        } else {
            System.out.println("Failed to register " + username);
        }
    }
}
