package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import javax.xml.crypto.Data;

public class Showtime implements Serializable{
    public String dateShowtimes;
    public ArrayList<Integer> seats;
    public Showtime(String dateShowtimes) {
        this.dateShowtimes = dateShowtimes;
        seats=new ArrayList<>(Collections.nCopies(64, 1));
    }
    public String getDateShowtimes() {
        return dateShowtimes;
    }
    public void setDateShowtimes(String dateShowtimes) {
        this.dateShowtimes = dateShowtimes;
    }
    public ArrayList<Integer> getSeats() {
        return seats;
    }
    public void setSeats(ArrayList<Integer> seats) {
        this.seats = seats;
    }
    
}
