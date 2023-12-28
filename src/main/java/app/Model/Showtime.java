package main.java.app.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Showtime implements Serializable {
    public LocalDateTime date;
    public ArrayList<Integer> seats;

    public Showtime(LocalDateTime dateShowtimes) {
        this.date = dateShowtimes;
        seats = new ArrayList<>();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime dateShowtimes) {
        this.date = dateShowtimes;
    }

    public ArrayList<Integer> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Integer> seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "" + date.getYear() + "/" + date.getMonthValue() + "/" + date.getDayOfMonth() + " " +date.getHour() + ":"+ date.getMinute();
    }
}
