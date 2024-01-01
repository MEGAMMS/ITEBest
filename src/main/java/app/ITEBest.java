package main.java.app;

import java.io.IOException;

import main.java.app.Controller.Utils;
import main.java.app.Controller.DefaultDatabase.DefaultDatabase;
import main.java.app.Model.Database;
import main.java.app.View.MainFrame;
import main.java.app.View.LoadingFrame;

public class ITEBest {
    public static MainFrame mainFrame;
    public static LoadingFrame startLoading;

    public static void main(String[] args) {
        try {
            LoadingFrame.showLoadingFrame();
            mainFrame = new MainFrame();
            Database.save();
            LoadingFrame.hideLoadingScreen();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            System.out.println("Restarting the app");
            new DefaultDatabase();
            Utils.restartApp();
        }
    }
}
