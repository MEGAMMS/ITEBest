package main.java.app.Model;

public class Ticket {
    
    private int id;
    private User user;
    private Showtime showtime;
    private Movie movie;
    public Ticket(int id, Movie movie, User user, Showtime showtime) {
        this.id = id;
        this.user = user;
        this.showtime = showtime;
        this.movie = movie;
    }
    public void setmovie(Movie m){
      this.movie=m;
    }
    public Movie getmovie(){
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
    public  Showtime getShowtime() {
        return showtime;
    }
    public void setShowtime(Showtime showTimeId) {
        this.showtime = showTimeId;
    }    
}
