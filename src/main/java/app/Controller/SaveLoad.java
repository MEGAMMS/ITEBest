package main.java.app.Controller;

import main.java.app.Model.Database;

public class SaveLoad {
    private static Database db = new Database(5);
    private static final String filepath = "obj.dat";
    static {
        db = new Database(8);
        // load();
    }

    public static void save() {
        // Database.intsTest.add(10);
        db = new Database(84);
        // db.publicIntTest = 1234;
        ObjectIO.WriteObjectToFile(db, filepath);
    }

    public static void load() {
        System.err.println("loading");
        System.err.println(db.publicIntTest);
        db = (Database) ObjectIO.LoudObjectFromFile(filepath);
        System.err.println(db.publicIntTest);
    }
}
