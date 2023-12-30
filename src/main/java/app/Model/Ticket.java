package main.java.app.Model;

import java.io.Serializable;

public class Ticket implements Serializable {
    private int id;
    private User user;
    private Showtime showtime;
    private Movie movie;
    private int seatId;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public Ticket(int id, Movie m, User u, Showtime showtime,int seatId) {
        this.id = id;
        this.user = u;
        this.movie = m;
        this.showtime = showtime;
        this.seatId=seatId;
    }

    public void setmovie(Movie m) {
        this.movie = m;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public void setShowtime(Showtime showTimeId) {
        this.showtime = showTimeId;
    }
}
