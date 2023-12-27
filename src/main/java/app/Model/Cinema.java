package main.java.app.Model;

import java.util.ArrayList;
import java.util.Collections;

public class Cinema {
    public Cinema(int id, String name, ArrayList<Movie> moviesId,Showtimes showtimes) {
        this.id = id;
        this.name = name;
        this.moviesId = moviesId;
        this.showtimes=showtimes;
    }
    int id;
    String name;
    ArrayList<Movie> moviesId;
    Showtimes showtimes;
    
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
        return moviesId;
    }
    public void setMoviesId(ArrayList<Movie> moviesId) {
        this.moviesId = moviesId;
    }
    

}
