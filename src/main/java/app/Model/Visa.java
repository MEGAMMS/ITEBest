package main.java.app.Model;

public class Visa {
    private int id;
    private int networth;
    private String pass;
    public Visa(int id,int n){
        this.networth=n;
        this.id = id;
    }
    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getpass() {
        return this.pass;
    }
    public void setnetworth(int n) {
        this.networth=n;
    }

    public int getnetworth() {
        return this.networth;
    }
}
