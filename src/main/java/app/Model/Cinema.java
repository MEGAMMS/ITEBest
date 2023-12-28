package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;

<<<<<<< HEAD
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
=======
public class Cinema implements Serializable{
    int id;
    String name;
    ArrayList<Movie> movies;
>>>>>>> master
    
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
