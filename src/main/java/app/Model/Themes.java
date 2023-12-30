package main.java.app.Model;

import java.util.ArrayList;

public class Themes {
    public static ArrayList<String[]> themes = new ArrayList<>();
    static {
        themes.add(new String[] { "#AF2655", "#D17292", "#860A35","#FDF7E4","#EBE3D5","#EAD7BB","#776B5D","#ffffff","#000000","#B80000","#1C6758" });
        themes.add(new String[] { "#AF2655", "#D17292", "#860A35","#FDF7E4","#EBE3D5","#EAD7BB","#776B5D","#ffffff","#000000","#B80000","#1C6758" });
    }
    public static String[] currTheme(){
        return themes.get(1);
    }
}

