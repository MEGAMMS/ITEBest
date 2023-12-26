package main.java.app.Controller;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Ticket;
import main.java.app.Model.User;
import main.java.app.Model.Visa;

public class TicketController {
    public String Booking(Movie m,User u,Integer n,Integer showtime){
        if(n.equals(null)||showtime.equals(null)){
            return "please fill all the required information";
        }
        if(n>m.seats.size()){
            return" Unfortunately there is no enough seats";
        }
        if(m.getprice()*n>u.getvisa().getnetworth()){
            return "Unfortunately you can not afford this transaction";
        }
        for(int i=0;i<n;i++){
            m.seats.remove(m.seats.size());
            u.getvisa().setnetworth(u.getvisa().getnetworth()-m.getprice());
            Database.tickets.add(new Ticket((m.getId()*10)+m.seats.size(), m, u.getId(), showtime));
        }
         return "Booked successfully";
    }

     public String Withdraw(Ticket t,User u,Movie m){
         u.getvisa().setnetworth(u.getvisa().getnetworth()+t.getmovie().getprice());
         m.seats.add(1);
         Database.tickets.remove(t);
         return "ticket withdrawn";
}
}
