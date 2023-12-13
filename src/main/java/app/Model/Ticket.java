package main.java.app.Model;

public class Ticket {
    public Ticket(int id, int movieId, int userId, int price, int showTimeId) {
        this.id = id;
        this.movieId = movieId;
        this.userId = userId;
        this.price = price;
        this.showTimeId = showTimeId;
    }
    private int id;
    private int movieId;
    private int userId;
    private int price;
    private int showTimeId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMovieId() {
        return movieId;
    }
    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getShowTimeId() {
        return showTimeId;
    }
    public void setShowTimeId(int showTimeId) {
        this.showTimeId = showTimeId;
    }    
}
