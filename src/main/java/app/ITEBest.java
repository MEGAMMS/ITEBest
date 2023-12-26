package main.java.app;

import main.java.app.Model.Database;
import main.java.app.Model.User;
import main.java.app.View.MainFrame;

public class ITEBest {
    public static MainFrame mainFrame;
    public static String LoginState;
    
    public static void main(String[] args) throws InterruptedException {
        // new AddMoviesToDatabase();
        //LoginState = "none";
        // Database.currUser = new User(0, "null", "null", "null");
        // Database.save();
        if(Database.currUser.getName().equals("null"))
            LoginState="none";
        else{
            LoginState="Logined";
        }
        System.out.println(LoginState);
        mainFrame = new MainFrame();
        Database.save();
    }
}
