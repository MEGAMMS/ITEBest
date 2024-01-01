package main.java.app.Controller;

import java.io.IOException;

import main.java.app.ITEBest;
import main.java.app.Controller.DefaultDatabase.DefaultDatabase;
import main.java.app.Model.Database;

public class Utils {
    public static boolean isLogedIn() {
        return Database.currUser != null;
    }

    public static void restartApp() {
        try {
            String javaCmd = System.getProperty("java.home") + "/bin/java";
            String classPath = System.getProperty("java.class.path");
            String mainClass = ITEBest.class.getName();

            ProcessBuilder processBuilder = new ProcessBuilder(javaCmd, "-cp", classPath, mainClass);
            processBuilder.start();

            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
            System.out.println("Restarting the app");
            new DefaultDatabase();
            Utils.restartApp();
        }
    }
}
