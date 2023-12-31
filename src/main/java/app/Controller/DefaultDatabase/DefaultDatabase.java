package main.java.app.Controller.DefaultDatabase;

import main.java.app.Model.Database;

public class DefaultDatabase {
    public DefaultDatabase() {
        Database.delete();
        new AddUsers();
        new AddMovies();
        new AddVisas();
        Database.currUser = Database.users.get(0);
        Database.currUser.setVisa(Database.visas.get(0));
        new AddCinemas();
        new AddShowtimes();
        new AddRates();
        Database.save();
    }
}
