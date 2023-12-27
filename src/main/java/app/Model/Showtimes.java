package main.java.app.Model;

import java.util.ArrayList;
import java.util.Collections;

import javax.xml.crypto.Data;

public class Showtimes {
    ArrayList<String> dateShowtimes;
    public ArrayList<Integer> seats;
    public Showtimes(ArrayList<String> dateShowtimes) {
        this.dateShowtimes = dateShowtimes;
        seats=new ArrayList<>(Collections.nCopies(64, 1));
    }
    
}
