package main.java.app.Controller;

import java.awt.Font;

public class FontController {
    public static Font getPrimaryFont(int style, int size){
        return new Font("Arial",style,size);
    }
}
