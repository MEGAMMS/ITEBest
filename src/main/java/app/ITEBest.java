package main.java.app;

import main.java.app.Controller.SaveLoad;
import main.java.app.Model.Database;
import main.java.app.View.Start;

public class ITEBest {
    public static void main(String[] args) {
        Start.main();
        SaveLoad.load();
        System.out.println(Database.intsTest);
        Database.intsTest.add(8);
        System.out.println(Database.intsTest);
        SaveLoad.save();
    }
}
