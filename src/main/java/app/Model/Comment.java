package main.java.app.Model;

import java.io.Serializable;

public class Comment implements Serializable{
    public String name;
    public String msg;
    public Comment(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }
    
}
