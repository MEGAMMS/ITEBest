package main.java.app.Model;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

import main.java.app.Controller.ObjectIO;

public class Database implements Serializable {
    private static final String path = "saves\\";
    private static final long serialVersionUID = 6529685098267757690L;
    public static ArrayList<User> users = new ArrayList<User>();
    public static ArrayList<Movie> movies = new ArrayList<Movie>();
    public static ArrayList<Cinema> halls = new ArrayList<Cinema>();
    public static ArrayList<Visa> visas = new ArrayList<Visa>();
    public static User currUser;
    public static int currTheme;
    static {
        initDatabase();
        load();
    }

    private static void initDatabase() {
        users = new ArrayList<User>();
        movies = new ArrayList<Movie>();
        currUser = null;
        halls = new ArrayList<Cinema>();
        visas = new ArrayList<Visa>();
        currTheme = 0;
    }

    public static void save() {

        try {
            new File(path).mkdirs();
            ObjectIO.WriteObjectToFile(users, path + "users.dat");
            ObjectIO.WriteObjectToFile(movies, path + "movies.dat");
            ObjectIO.WriteObjectToFile(currUser, path + "currUser.dat");
            ObjectIO.WriteObjectToFile(halls, path + "cinema.dat");
            ObjectIO.WriteObjectToFile(currTheme, path + "themes.dat");
            ObjectIO.WriteObjectToFile(visas, path + "visas.dat");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Faild to save.");
        }
    }

    public static void saveMovies() {

        try {
            new File(path).mkdirs();
            ObjectIO.WriteObjectToFile(movies, path + "movies.dat");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.err.println("Faild to save.");
        }
    }

    @SuppressWarnings("unchecked")
    public static void load() {
        try {
            users = (ArrayList<User>) ObjectIO.LoudObjectFromFile(path + "users.dat");
            movies = (ArrayList<Movie>) ObjectIO.LoudObjectFromFile(path + "movies.dat");
            currUser = (User) ObjectIO.LoudObjectFromFile(path + "currUser.dat");
            halls = (ArrayList<Cinema>) ObjectIO.LoudObjectFromFile(path + "Cinema.dat");
            currTheme = (int) ObjectIO.LoudObjectFromFile(path + "themes.dat");
            visas = (ArrayList<Visa>) ObjectIO.LoudObjectFromFile(path + "visas.dat");
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
