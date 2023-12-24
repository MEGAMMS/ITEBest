package main.java.app;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.View.MainFrame;
import main.java.app.View.TicketAdd;

public class ITEBest {
    public static MainFrame mainFrame;
    public static String LoginState;

    static void test() {
        // Database.delete();
        Database.movies.add(new Movie(3, "Les Miserabels", "\\MoviesPosters\\LesMiserabels.jpg"));
        Database.movies.add(new Movie(2, "LADYBUG & CATNOIR", "\\MoviesPosters\\LADYBUG&CATNOIR.png"));
        Database.movies.add(new Movie(1, "XIHOOG ran Turismo", "\\MoviesPosters\\XIHOOGranTurismo.jpg"));
        System.out.println(Database.movies.size());
        Database.save();
    }

    public static void main(String[] args) throws InterruptedException {
        // test();

        LoginState = "none";
        mainFrame = new MainFrame();
        Database.save();
    }
}
