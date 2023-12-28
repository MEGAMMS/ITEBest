package main.java.app;

import java.io.IOException;

import main.java.app.Controller.AddMoviesToDatabase;
import main.java.app.Controller.Utils;
import main.java.app.Model.Database;
import main.java.app.Model.User;
import main.java.app.View.MainFrame;

public class ITEBest {
    public static MainFrame mainFrame;

    public static void main(String[] args) throws InterruptedException, IOException {
        new AddMoviesToDatabase();
        System.out.println(Database.movies.get(0).getCinema().getName());
        System.out.println(Utils.isLogedIn());
        mainFrame = new MainFrame();
        Database.save();
    }
}
