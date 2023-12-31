package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Cinema implements Serializable {
    int id;
    String name;
    ArrayList<Movie> movies;
    int seats;

    public Cinema(int id, String name, ArrayList<Movie> movies, int seats) {
        this.id = id;
        this.name = name;
        this.movies = movies;
        this.seats = seats;
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

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

}
