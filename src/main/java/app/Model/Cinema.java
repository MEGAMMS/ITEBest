package main.java.app.Model;

import java.util.ArrayList;
import java.util.Collections;

public class Cinema {
    public Cinema(int id, String name, ArrayList<Movie> moviesId, ArrayList<Showtime> showtimes) {
        this.id = id;
        this.name = name;
        this.movies = moviesId;
        this.showtimes=showtimes;
    }
    int id;
    String name;
    ArrayList<Movie> movies;
    public ArrayList<Showtime> showtimes;
    
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
    public ArrayList<Movie> getMovies() {
        return movies;
    }
    public void setMovies(ArrayList<Movie> moviesId) {
        this.movies = moviesId;
    }
    

}
