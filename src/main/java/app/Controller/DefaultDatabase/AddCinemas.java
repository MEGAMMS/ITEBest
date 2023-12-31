package main.java.app.Controller.DefaultDatabase;

import java.util.ArrayList;

import main.java.app.Model.Cinema;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;

public class AddCinemas {
    AddCinemas() {
        Database.halls.add(new Cinema(Database.halls.size(), "Hall 1",
                new ArrayList<Movie>(Database.movies.subList(0, 5)), 80));
        Database.halls.add(new Cinema(Database.halls.size(), "Hall 2",
                new ArrayList<Movie>(Database.movies.subList(5, 10)), 50));
        Database.halls.add(new Cinema(Database.halls.size(), "Hall 3",
                new ArrayList<Movie>(Database.movies.subList(10, Database.movies.size())), 90));
        for (int i = 0; i < 5; i++)
            Database.movies.get(i).setCinema(Database.halls.get(0));
        for (int i = 5; i < 10; i++)
            Database.movies.get(i).setCinema(Database.halls.get(0));
        for (int i = 10; i < Database.movies.size(); i++)
            Database.movies.get(i).setCinema(Database.halls.get(0));
    }
}
