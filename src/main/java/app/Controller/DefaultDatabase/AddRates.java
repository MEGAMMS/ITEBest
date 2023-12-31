package main.java.app.Controller.DefaultDatabase;

import java.util.ArrayList;
import java.util.Random;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;

public class AddRates {
    AddRates() {
        Random rand = new Random();
        ArrayList<Double> rates = new ArrayList<>();
        rates.add(rand.nextDouble(1, 5));
        rates.add(rand.nextDouble(1, 5));
        rates.add(rand.nextDouble(1, 5));
        for (Movie m : Database.movies) {
            m.setRates(new ArrayList<>(rates));
            rates.set(0, rand.nextDouble(1, 5));
            rates.set(1, rand.nextDouble(1, 5));
            rates.set(2, rand.nextDouble(1, 5));
        }
    }
}
