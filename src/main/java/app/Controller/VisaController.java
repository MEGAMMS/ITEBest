package main.java.app.Controller;

import main.java.app.Model.Visa;

import main.java.app.Model.User;

import main.java.app.Model.Database;

public class VisaController {
    public static String addvisacard(String id, String password, User user) {
        for (Visa v : Database.visas) {
            if (v.getID().equals(id) && v.getpass().equals(password)) {
                if (v.user==null) {
                    user.setVisa(v);
                    v.setuser(user);
                    Database.save();
                    return "succeccfully added your card";
                } else
                    return "card already in use";
            }
        }
        return "no such a card exist";
    }
}
