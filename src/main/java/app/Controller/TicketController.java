package main.java.app.Controller;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Showtime;
import main.java.app.Model.Ticket;
import main.java.app.Model.User;
import main.java.app.Model.Visa;

public class TicketController {

    static class BookThread extends Thread {

        private Movie movie;
        private User user;
        private int count;
        private Showtime showtime;
        private String result = null;

        BookThread(Movie movie, User user, int count, Showtime showtime) {
            this.movie = movie;
            this.user = user;
            this.count = count;
            this.showtime = showtime;
        }

        @Override
        public void run() {
            result = Book(movie, user, count, showtime);
        }

        String getResult() {
            return result;
        }

        public static String Book(Movie movie, User user, int count, Showtime showtime) {
            if (count == 0 || showtime == null) {
                return "please fill all the required information";
            }
            if (user.creditcard == null) {
                return "You don't have a creditcard";
            }
            if (movie.getPrice() * count > user.creditcard.getNetworth()) {
                return "Unfortunately you can not afford this transaction";
            }
            if (showtime.seats < count) {
                return "Sorry, not enough seats";
            }
            showtime.seats -= count;
            for (int i = 0; i < count; i++) {
                user.creditcard.setNetworth(user.creditcard.getNetworth() - movie.getPrice());
                user.tickets.add(new Ticket(user.tickets.size(), movie, user, showtime, showtime.seats + i + 1));
            }
            Database.save();
            return "Booked successfully";
        }

    }
    public static String Book(Movie movie, User user, int count, Showtime showtime) {
        BookThread t = new BookThread(movie, user, count, showtime);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return t.getResult();

    }

    static class UnBookThread extends Thread {
        Ticket ticket;
        String result = null;

        UnBookThread(Ticket ticket) {
            this.ticket = ticket;
        }
         @Override
        public void run() {
            result = UnBook(ticket);
        }

        String getResult() {
            return result;
        }
        public static String UnBook(Ticket ticket) {
            User user = ticket.getUser();
            Visa visa = user.creditcard;
            Movie movie = ticket.getMovie();
            Showtime showtime = ticket.getShowtime();
            visa.setNetworth(visa.getNetworth() + movie.getPrice());
            showtime.seats++;
            user.tickets.remove(ticket);
            for (int i = 0; i < ticket.getUser().tickets.size(); i++)
                ticket.getUser().tickets.get(i).setId(i);
            return "Ticket withdrawn";
        }

    }

    public static String UnBook(Ticket ticket) {
        UnBookThread t = new UnBookThread(ticket);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return t.getResult();
        
    }

}
