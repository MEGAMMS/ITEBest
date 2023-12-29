package main.java.app.Controller;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Showtime;
import main.java.app.Model.Ticket;
import main.java.app.Model.User;
import main.java.app.Model.Visa;

public class TicketController {
    public String Book(Movie movie, User user, int count, Showtime showtime) {
        if (count == 0 || showtime.equals(null)) {
            return "please fill all the required information";
        }
        if (movie.getPrice() * count > user.getVisa().getNetworth()) {
            return "Unfortunately you can not afford this transaction";
        }
        showtime.seats -= count;
        for (int i = 0; i < count; i++) {
            user.getVisa().setNetworth(user.getVisa().getNetworth() - movie.getPrice());
            user.tickets.add(new Ticket(user.tickets.size(), movie, user, showtime));
        }
        Database.save();
        return "Booked successfully";
    }

    public String Unbook(Ticket ticket) {
        User user = ticket.getUser();
        Visa visa = user.getVisa();
        Movie movie = ticket.getMovie();
        Showtime showtime = ticket.getShowtime();
        visa.setNetworth(visa.getNetworth() + movie.getPrice());
        showtime.seats++;
        user.tickets.remove(ticket);
        return "Ticket withdrawn";
    }

}
