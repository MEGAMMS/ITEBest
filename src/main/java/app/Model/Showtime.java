package main.java.app.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Showtime implements Serializable {
    public LocalDateTime date;
    public int seats;

    public Showtime(LocalDateTime dateShowtimes) {
        this.date = dateShowtimes;
        seats = 64;
    }
    public Showtime(Showtime showtime) {
        this.date = showtime.date;
        seats = 64;
    }
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime dateShowtimes) {
        this.date = dateShowtimes;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "" + date.getYear() + "/" + date.getMonthValue() + "/" + date.getDayOfMonth() + " " +date.getHour() + ":"+ date.getMinute();
    }
}
