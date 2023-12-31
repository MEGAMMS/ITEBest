package main.java.app;

import java.io.IOException;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.DefaultDatabase;
import main.java.app.Controller.Utils;
import main.java.app.Model.Database;
import main.java.app.Model.Themes;
import main.java.app.Model.Visa;
import main.java.app.View.MainFrame;
import main.java.app.View.Start;

public class ITEBest {
    public static MainFrame mainFrame;
    public static Start startLoading;
    public static void main(String[] args) throws InterruptedException, IOException {
        Start.showLoadingFrame();
        new DefaultDatabase();
        System.out.println(Utils.isLogedIn());
        Database.movies.get(0).setPrice(1000);
        try {
            mainFrame = new MainFrame();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Database.save();
        Start.hideLoadingScreen();
    }
}
