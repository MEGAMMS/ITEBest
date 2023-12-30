package main.java.app.Controller;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Showtime;
import main.java.app.Model.Ticket;
import main.java.app.Model.User;
import main.java.app.Model.Visa;

public class TicketController {
    public static String Book(Movie movie, User user, int count, Showtime showtime) {
        if (count == 0 || showtime ==null) {
            return "please fill all the required information";
        }
        if(user.creditcard == null){
            return "You don't have a creditcard";
        }
        if (movie.getPrice() * count > user.creditcard.getNetworth()) {
            return "Unfortunately you can not afford this transaction";
        }
        if(showtime.seats < count){
            return "Sorry, not enough seats";
        }
        showtime.seats -= count;
        for (int i = 0; i < count; i++) {
            user.creditcard.setNetworth(user.creditcard.getNetworth() - movie.getPrice());
            user.tickets.add(new Ticket(user.tickets.size(), movie, user, showtime));
        }
        Database.save();
        return "Booked successfully";
    }

    public String UnBook(Ticket ticket) {
        User user = ticket.getUser();
        Visa visa = user.creditcard;
        Movie movie = ticket.getMovie();
        Showtime showtime = ticket.getShowtime();
        visa.setNetworth(visa.getNetworth() + movie.getPrice());
        showtime.seats++;
        user.tickets.remove(ticket);
        return "Ticket withdrawn";
    }

}
