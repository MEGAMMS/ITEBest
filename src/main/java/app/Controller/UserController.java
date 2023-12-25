package main.java.app.Controller;

import main.java.app.Model.Database;
import main.java.app.Model.User;

public class UserController {
    public String AddUser(String name, String email, String password) {
        if(name.equals(" ")||password.equals(" ")||email.equals(" ")){
            return "one of the textboxes is blank";
        }
        if (name.length() > 50||name.length()<2) {
            return "error name is invaled";
        }
        if (password.length() < 8 || password.length() > 50) {
            return "\\ERROR\\ password is invaled";
        }
        for (User e : Database.users) {
            if (e.getEmail().equals(email)) {
                return "You already have an account";
            }
        }
        if (!email.substring(email.length() - 10).equals("@gmail")) {
            return "that's not an email";
        }
        Database.users.add(new User(Database.users.size(), name, email, password));
        return "Signed up successfully";
    }
    
}
