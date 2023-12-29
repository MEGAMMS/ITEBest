package main.java.app.Controller;

import main.java.app.Model.Visa;

import main.java.app.Model.User;

import main.java.app.Model.Database;

public class VisaController {
    public String addvisacard(String id, String password, User user) {
        for (Visa v : Database.visas) {
            if (v.getID().equals(id) && v.getpass().equals(password)) {
                if (v.getuser().equals(null)) {
                    user.setVisa(v);
                    v.setuser(user);
                    return "succeccfully added your card";
                } else
                    return "card already in use";
            }
        }
        return "no such a card exist";
    }
}
