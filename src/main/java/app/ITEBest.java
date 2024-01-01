package main.java.app;

import java.io.IOException;

import main.java.app.Controller.DefaultDatabase.DefaultDatabase;
import main.java.app.Model.Database;
import main.java.app.View.MainFrame;
import main.java.app.View.LoadingFrame;

public class ITEBest {
    public static MainFrame mainFrame;
    public static LoadingFrame startLoading;

    public static void main(String[] args) {
        LoadingFrame.showLoadingFrame();
        // new DefaultDatabase();
        try {
            mainFrame = new MainFrame();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
        Database.save();
        LoadingFrame.hideLoadingScreen();
    }
}
