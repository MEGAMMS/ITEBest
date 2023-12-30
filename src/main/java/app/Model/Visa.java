package main.java.app.Model;

import java.io.Serializable;

public class Visa implements Serializable{
    private int id;
    private int networth;
    private String pass;
    public User user;

    public void setuser(User user) {
        this.user = user;
    }

    public Visa(int id,String p,int networth){
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

    public int getID() {
        return this.id;
    }

    public void setNetworth(int n) {
        this.networth = n;
    }

    public int getNetworth() {
        return this.networth;
    }
}
