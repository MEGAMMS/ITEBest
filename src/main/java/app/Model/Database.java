package main.java.app.Model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import main.java.app.ITEBest;
import main.java.app.Controller.ObjectIO;

public class Database implements Serializable {
    private static final String path = "saves\\";
    private static final long serialVersionUID = 6529685098267757690L;
    public static ArrayList<User> users = new ArrayList<User>();
    public static ArrayList<Movie> movies = new ArrayList<Movie>();
    public static ArrayList<Cinema> cinema = new ArrayList<Cinema>();
    public static ArrayList<Visa> visas = new ArrayList<Visa>();
    public static User currUser;
    static {
        initDatabase();
        load();
    }

    private static void initDatabase() {
        users = new ArrayList<User>();
        movies = new ArrayList<Movie>();
        currUser = null;
    }

    public static void save() {

        try {
            new File(path).mkdirs();
            ObjectIO.WriteObjectToFile(users, path + "users.dat");
            ObjectIO.WriteObjectToFile(movies, path + "movies.dat");
            ObjectIO.WriteObjectToFile(currUser, path + "currUser.dat");
            //ObjectIO.WriteObjectToFile(cinema, path + "Cinema.dat");
        } catch (IOException ex) {
            System.err.println("Faild to save.");
        }
    }

    @SuppressWarnings("unchecked")
    public static void load() {
        try {
            users = (ArrayList<User>) ObjectIO.LoudObjectFromFile(path + "users.dat");
            movies = (ArrayList<Movie>) ObjectIO.LoudObjectFromFile(path + "movies.dat");
            currUser = (User) ObjectIO.LoudObjectFromFile(path + "currUser.dat");
            //cinema = (ArrayList<Cinema>) ObjectIO.LoudObjectFromFile(path + "Cinema.dat");
            // if(ITEBest.LoginState.equals("Logined"))
            // thisUser=(User)ObjectIO.LoudObjectFromFile(path + "thisUser.dat");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            System.out.println("Failed to load.");
        }
    }

    public static void delete() {
        initDatabase();
        save();
    }
}
