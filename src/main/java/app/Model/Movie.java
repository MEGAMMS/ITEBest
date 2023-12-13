package main.java.app.Model;

import java.util.ArrayList;

public class Movie {
    public Movie(int id, String title, String director, String description, int showTimeId, ArrayList<Rate> rates,
            int cinemaId) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.description = description;
        this.showTimeId = showTimeId;
        this.rates = rates;
        this.cinemaId = cinemaId;
    }
    private int id;
    private String title;
    private String director;
    private String description;
    private int showTimeId;
    private ArrayList<Rate> rates;
    private int cinemaId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getShowTimeId() {
        return showTimeId;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }
    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }
    public int getCinemaId() {
        return cinemaId;
    }
    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }
    public void setShowTimeId(int showTimeId) {
        this.showTimeId = showTimeId;
    }
    
    

}
