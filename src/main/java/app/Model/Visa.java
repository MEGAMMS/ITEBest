package main.java.app.Model;

public class Visa {
    private String id;
    private int networth;
    private String pass;
    public Visa(String id,String p){
        this.pass=p;
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
    public void setnetworth(int n) {
        this.networth=n;
    }

    public int getnetworth() {
        return this.networth;
    }
}
