package main.java.app.Model;

import java.io.Serializable;

public class Visa implements Serializable{
    private String id;
    private int networth;
    private String pass;
    private User user;
    public void setuser(User user) {
        this.user = user;
    }
     public User getuser() {
        return this.user;
    }
    public Visa(String id,String p,int networth){
        this.pass=p;
        this.id = id;
        this.networth=networth;
        this.user=null;
    }
    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getpass() {
        return this.pass;
    }
    public void setID(String id) {
         this.id = id;
    }

    public String getID() {
        return this.id;
    }
    public void setnetworth(int n) {
        this.networth=n;
    }

    public int getnetworth() {
        return this.networth;
    }
}
