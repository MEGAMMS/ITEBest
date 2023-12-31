package main.java.app.Controller.DefaultDatabase;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Showtime;

public class AddShowtimes {
    AddShowtimes() {
        ArrayList<Showtime> showtimes = new ArrayList<>();
        showtimes.add(new Showtime(LocalDateTime.of(2024, 1, 15, 10, 0), 0));
        showtimes.add(new Showtime(LocalDateTime.of(2024, 1, 15, 12, 0), 0));
        showtimes.add(new Showtime(LocalDateTime.of(2024, 1, 16, 2, 30), 0));
        Random rand = new Random();
        for (Movie m : Database.movies) {
            showtimes.set(0, new Showtime(showtimes.get(0).date.plusHours(rand.nextInt(12)),
                    m.getCinema().getSeats()));
            showtimes.set(1, new Showtime(showtimes.get(1).date.plusHours(rand.nextInt(12)),
                    m.getCinema().getSeats()));
            showtimes.set(2, new Showtime(showtimes.get(2).date.plusHours(rand.nextInt(12)),
                    m.getCinema().getSeats()));
            m.setShowtimes(new ArrayList<>(showtimes));
        }
    }
}
