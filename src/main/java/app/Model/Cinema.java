package main.java.app.Model;

import java.util.ArrayList;

public class Cinema {
    public Cinema(int id, String name, ArrayList<Integer> moviesId) {
        this.id = id;
        this.name = name;
        this.moviesId = moviesId;
    }
    int id;
    String name;
    ArrayList<Integer> moviesId;
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
    public ArrayList<Integer> getMoviesId() {
        return moviesId;
    }
    public void setMoviesId(ArrayList<Integer> moviesId) {
        this.moviesId = moviesId;
    }
    

}
