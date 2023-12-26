package main.java.app.Model;

public class Visa {
    private int id;
    private String networth;
    private String pass;
    private int visamoney;
    public Visa(int id, String networth, String pass, int visamoney) {
        this.id = id;
        this.networth = networth;
        this.pass = pass;
        this.visamoney = visamoney;
    }
    public Visa(int id,String p){
        this.pass=p;
        this.id = id;
    }
    public void setpass(String pass) {
        this.pass = pass;
    }

    public String getpass() {
        return this.pass;
    }
    public void setID(int id) {
         this.id = id;
    }

    public int getID() {
        return this.id;
    }
    public void setnetworth(String n) {
        this.networth=n;
    }

    public String getnetworth() {
        return this.networth;
    }
}
