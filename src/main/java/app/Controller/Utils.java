package main.java.app.Controller;

import main.java.app.Model.Database;

public class Utils {
    public static boolean isLogedIn(){
        return Database.currUser != null;
    }
}
