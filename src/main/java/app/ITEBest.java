package main.java.app;

import main.java.app.Model.Database;
import main.java.app.View.MainFrame;

public class ITEBest {
    public static MainFrame mainFrame;
    public static String LoginState;
    public static void main(String[] args) throws InterruptedException {
        // new AddMoviesToDatabase();
        LoginState = "none";
        mainFrame = new MainFrame();
        Database.save();
    }
}
