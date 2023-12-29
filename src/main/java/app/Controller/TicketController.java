package main.java.app.Controller;

public class TicketController {
    // public String Booking(Movie movie, User user, ArrayList<Integer> n, Showtime showtime) {
    //     if (n.equals(null) || showtime.equals(null)) {
    //         return "please fill all the required information";
    //     }
    //     if (movie.getprice() * n.size() > user.getvisa().getnetworth()) {
    //         return "Unfortunately you can not afford this transaction";
    //     }
    //     for (int i = 0; i < n.size(); i++) {
    //         movie.getCinema().seats.set(n.get(i), 0);
    //         user.getvisa().setnetworth(user.getvisa().getnetworth() - movie.getprice());
    //         Database.users.get(user.getId()).tickets.add(new Ticket((movie.getId() * 10) + n.get(i), movie, user, showtime));
    //     }
    //     return "Booked successfully";
    // }

    // public String Withdraw(Ticket t, User u, Movie m) {
    //     u.getvisa().setnetworth(u.getvisa().getnetworth() + t.getmovie().getprice());
    //     m.getCinema().seats.set(t.getId() - (m.getId() * 10), 1);
    //     Database.users.get(u.getId()).tickets.remove(t);
    //     return "ticket withdrawn";
    // }

}
