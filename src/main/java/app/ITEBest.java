package main.java.app;

import java.io.IOException;

import main.java.app.Model.Database;
import main.java.app.View.MainFrame;
import main.java.app.View.Start;

public class ITEBest {
    public static MainFrame mainFrame;
    public static Start startLoading;

    public static void main(String[] args) {
        Start.showLoadingFrame();
        // new DefaultDatabase();
        try {
            mainFrame = new MainFrame();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
        }
        Database.save();
        Start.hideLoadingScreen();
    }
}
