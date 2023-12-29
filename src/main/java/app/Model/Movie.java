package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable {
    public Movie(int id, String title, String poster, String tag, String description) {
        this.id = id;
        this.title = title;
        this.poster = "\\MoviesPosters\\" + poster;
        this.tag = tag;
        this.description = description;
        this.cinema = Database.halls.get(0);
        this.comments=new ArrayList<>();
    }

    public Movie(int id, String title, String poster, String tag, String description, Cinema cinema) {
        this.id = id;
        this.title = title;
        this.poster = "\\MoviesPosters\\" + poster;
        this.tag = tag;
        this.description = description;
        this.cinema = cinema;
        this.comments=new ArrayList<>();
    }

    public Movie(int id, String title, String poster) {
        this.id = id;
        this.title = title;
        this.poster = poster;
        this.tag = "";
        this.description = "";
        this.comments=new ArrayList<>();
    }

    private String tag;
    private String poster;
    private int id;
    private String title;
    private String director;
    private String description;
    private ArrayList<Rate> rates;
    public ArrayList<Showtime> showtimes;
    public ArrayList<Comment>comments;
    public ArrayList<Showtime> getShowtimes() {
        return showtimes;
    }

    public void setShowtimes(ArrayList<Showtime> showtimes) {
        this.showtimes = showtimes;
    }

    private Cinema cinema;

    private int attendancePrice;

    public int getprice() {
        return this.attendancePrice;
    }

    public void setprice(int p) {
        this.attendancePrice = p;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public int getId() {
        return id;
    }

    public String getPoster() {
        return poster;
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

    public ArrayList<Rate> getRates() {
        return rates;
    }

    public void setRates(ArrayList<Rate> rates) {
        this.rates = rates;
    }

    public Cinema getCinema() {
        return this.cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

}
