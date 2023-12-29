package main.java.app;

import java.io.IOException;

import main.java.app.Controller.DefaultDatabase;
import main.java.app.Model.Database;
import main.java.app.Model.Visa;
import main.java.app.View.MainFrame;

public class ITEBest {
    public static MainFrame mainFrame;

    public static void main(String[] args) throws InterruptedException, IOException {
        new DefaultDatabase();
        Database.visas.add(new Visa("1111-2222-3333-4444", "1234",15000));
        mainFrame = new MainFrame();
        Database.save();
    }
}
