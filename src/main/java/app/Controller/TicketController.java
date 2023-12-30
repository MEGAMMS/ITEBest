package main.java.app.Controller;

import java.util.ArrayList;

import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Ticket;
import main.java.app.Model.User;
import main.java.app.Model.Visa;

public class TicketController {
//     public String Booking(Movie m,User u,ArrayList<Integer> n,Integer showtime){
//         if(n.equals(null)||showtime.equals(null)){
//             return "please fill all the required information";
//         }
//         if(m.getprice()*n.size()>u.getvisa().getnetworth()){
//             return "Unfortunately you can not afford this transaction";
//         }
//         for(int i=0;i<n.size();i++){
//             m.getCinema().seats.set(n.get(i),0);
//             u.getvisa().setnetworth(u.getvisa().getnetworth()-m.getprice());
//             Database.users.get(u.getId()).tickets.add(new Ticket((m.getId()*10)+n.get(i), m, u, showtime));
//         }
//          return "Booked successfully";
//     }

//      public String Withdraw(Ticket t,User u,Movie m){
//          u.getvisa().setnetworth(u.getvisa().getnetworth()+t.getmovie().getprice());
//           m.getCinema().seats.set(t.getId()-(m.getId()*10),1);
//          Database.users.get(u.getId()).tickets.remove(t);
//          return "ticket withdrawn";
// }
public void PrintTicketInfo(Ticket t){
    System.out.println(t.getId());
    System.out.println(t.getmovie().getTitle());
    System.out.println(t.getmovie().getCinema());
    System.out.println(t.getId()-(t.getmovie().getId()*10));
    System.out.println(t.getShowTimeId());
}
}
