package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Database implements Serializable{
    // public static ArrayList<User> users = new ArrayList<>();
    // public static ArrayList<Movie> movies = new ArrayList<>();
    private static final long serialVersionUID = 6529685098267757690L;
    public static ArrayList<Integer> intsTest = new ArrayList<>();
    public int publicIntTest;
    public Database(int publicIntTest) {
        this.publicIntTest = publicIntTest;
    }
    @Override
    public String toString() {
        return "The static Array is :" + intsTest.toString() + 
        "\nThe non static int is: "+ publicIntTest;
    }
}
