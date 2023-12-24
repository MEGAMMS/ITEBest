package main.java.app;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.View.Lobby;

public class ITEBest {
    public static Lobby lobby;
    public static String LoginState;

    static void test() {
        Database.delete();
        Database.movies.add(new Movie(3, "Les Miserabels", "\\MoviesPosters\\LesMiserabels.jpg"));
        Database.movies.add(new Movie(2, "LADYBUG & CATNOIR", "\\MoviesPosters\\LADYBUG&CATNOIR.png"));
        Database.movies.add(new Movie(1, "XIHOOG ran Turismo", "\\MoviesPosters\\XIHOOGranTurismo.jpg"));
        System.out.println(Database.movies.size());
        Database.movies.get(0).setDescription("gijdfignfnjn nfginfng jngfklngjn bnfjgnjfngj jfngfnjgb");
    }

    public static void main(String[] args) throws InterruptedException {
        // test();

        LoginState = "none";
        lobby = new Lobby();
        Database.save();
    }
}
