package main.java.app.Model;

public class Visa {
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

    public Visa(String id, String p) {
        this.pass = p;
        this.id = id;
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

    public void setNetworth(int n) {
        this.networth = n;
    }

    public int getNetworth() {
        return this.networth;
    }
}
