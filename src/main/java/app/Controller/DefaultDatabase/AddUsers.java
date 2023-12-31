package main.java.app.Controller.DefaultDatabase;

import main.java.app.Controller.UserController;

public class AddUsers {
    AddUsers() {
        UserController.AddUser("admin", "admin@gmail.com", "123456789");
        UserController.AddUser("admin2", "admin2@gmail.com", "123456789");
    }
}
