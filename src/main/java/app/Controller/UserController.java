package main.java.app.Controller;

import main.java.app.Model.Database;
import main.java.app.Model.User;
import main.java.app.View.MainFrame;

public class UserController {
    public static String AddUser(String name, String email, String password) {
        if(name.equals("")||password.equals("")||email.equals("")){
            return "one of the textboxes is blank";
        }
        if (name.length() > 50||name.length()<2) {
            return "error name is invaled";
        }
        if (password.length() < 8 || password.length() > 50) {
            return "password is invaled";
        }
        if (email.length() > 50||email.length()<12) {
            return "error email is invaled";
        }
        for (User e : Database.users) {
            if (e.getEmail().equals(email)) {
                return "You already have an account";
            }
        }
        if (!email.substring(email.length() - 10).equals("@gmail.com")) {
            return "that's not an email";
        }
        Database.users.add(new User(Database.users.size(), name, email, password));
        Database.save();
        return "Signed up successfully";
    }

    public static String  LogIn(String email,String password){
        if(password.equals("")||email.equals("")){
            return "one of the textboxes is blank";
        }
        if (email.length() > 50||email.length()<12) {
            return "error email is invaled";
        }
        if (!email.substring(email.length() - 10).equals("@gmail.com")) {
            return "Wrong email adress";
        }
        for (User e : Database.users) {
            if(e.getEmail().equals(email)){
                if(e.getPassword().equals(password)){
                    Database.thisUser=e;
                    MainFrame.PProfile.updateData(e);
                    return "Welcome";
                    
                }else return"Wrong Password";
            }
        }
    return "User not found";
    }


}
