package main.java.app.Model;

import java.util.ArrayList;

public class Themes {
    public static ArrayList<String[]> themes = new ArrayList<>();
    static {
        themes.add(new String[] { "#AF2655", "#D17292", "#860A35","#FDF7E4","#EBE3D5","#EAD7BB","#776B5D","#ffffff","#000000","#B80000","#1C6758" });
        themes.add(new String[] {  "#5C8374", "#93B1A6", "#183D3D","#9EB384","#CEDEBD","#435334","#96C291","#ffffff","#000000","#B80000","#1C6758" });
        themes.add(new String[] {  "#279EFF", "#114c99", "#0C356A","#749BC2","#91C8E4","#4682A9","#0D1282","#ffffff","#000000","#ED1257","#13ECD7" });
        themes.add(new String[] {  "#FFC436", "#FFFB73", "#F4CE14","#FBD85D","#FAE392","#F1C93B","#F0DE36","#ffffff","#000000","#ee4011","#D9F609" });
        themes.add(new String[] { "#AF2655", "#6B728E", "#404258","#50577A","#282A3A","#474E68","#6B728E","#474E68","#ffffff","#B80000","#1C6758" });
    }
    public static String[] currTheme(){
        return themes.get(0);
    }
}



