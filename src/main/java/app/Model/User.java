package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        creditcard=null;
        tickets=new ArrayList<>();
    }

    private int id;
    private String name;
    private String email;
    private String password;
    public Visa creditcard;
    public ArrayList<Ticket> tickets;
    

    public void setVisa(Visa v) {
        this.creditcard = v;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name:" + name;
    }
}
