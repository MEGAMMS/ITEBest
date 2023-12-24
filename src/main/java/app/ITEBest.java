package main.java.app;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.View.Lobby;

public class ITEBest {
    public static Lobby lobby;
    public static String LoginnState;

    public static void main(String[] args) throws InterruptedException {
        
        
        //Start.main();
        Database.save();
       // 


        LoginnState="none";
        Database.movies.add(new Movie(1, "Les Miserabels", "\\MoviesPosters\\LesMiserabels.jpg","sadness","noneee"));
        Database.movies.add(new Movie(2, "LADYBUG & CATNOIR", "\\MoviesPosters\\LADYBUG&CATNOIR.png","adventure","noneee"));
        Database.movies.add(new Movie(3, "XIHOOG ran Turismo", "\\MoviesPosters\\XIHOOGranTurismo.jpg","action","noneee"));
        

        lobby=new Lobby();
        
        
    }
}
