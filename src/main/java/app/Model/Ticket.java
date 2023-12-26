package main.java.app.Model;

public class Ticket {
    public Ticket(int id, Movie m, int userId, int showTimeId) {
        this.id = id;
        this.userId = userId;
        this.showTimeId = showTimeId;

    }
    private int id;
    private int userId;
    private int showTimeId;
    private Movie movie;
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
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getShowTimeId() {
        return showTimeId;
    }
    public void setShowTimeId(int showTimeId) {
        this.showTimeId = showTimeId;
    }    
}
