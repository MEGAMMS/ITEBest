package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cinema implements Serializable{
    int id;
    String name;
    ArrayList<Movie> movies;
    
    public Cinema(int id, String name, ArrayList<Movie> movies) {
        this.id = id;
        this.name = name;
        this.movies = movies;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Movie> getMoviesId() {
        return movies;
    }
    

}
