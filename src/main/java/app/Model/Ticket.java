package main.java.app.Model;

import java.io.Serializable;

public class Ticket implements Serializable {
    public Ticket(int id, Movie m, User u, int showTimeId) {
        this.id = id;
        this.user = u;
        this.showTimeId = showTimeId;

    }

    private int id;
    private User user;
    private int showTimeId;
    private Movie movie;

    public void setmovie(Movie m) {
        this.movie = m;
    }

    public Movie getmovie() {
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

    public int getShowTimeId() {
        return showTimeId;
    }

    public void setShowTimeId(int showTimeId) {
        this.showTimeId = showTimeId;
    }

    @Override
    public String toString() {
        return getId() + "\n" + getmovie();
    }
}
