package main.java.app.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Themes implements Serializable {
    public int numTheme;

    public Themes() {
        numTheme = 0;
    }

    public static ArrayList<String[]> themes = new ArrayList<>();
    static {
        // Signuo houver header item backlight darktitle2 darktitle
        themes.add(new String[] { "#AF2655", "#D17292", "#860A35", "#FDF7E4", "#EBE3D5", "#EAD7BB", "#776B5D",
                "#ffffff", "#000000", "#B80000", "#1C6758" });
        themes.add(new String[] { "#5C8374", "#93B1A6", "#183D3D", "#9EB384", "#CEDEBD", "#435334", "#96C291",
                "#ffffff", "#000000", "#B80000", "#1C6758" });
        themes.add(new String[] { "#279EFF", "#114c99", "#0C356A", "#749BC2", "#91C8E4", "#4682A9", "#0D1282",
                "#ffffff", "#000000", "#ED1257", "#13ECD7" });
        themes.add(new String[] { "#E7B10A", "#898121", "#4C4B16", "#FBD85D", "#FFF1AF", "#FFC26F", "#E7B10A",
                "#ffffff", "#000000", "#E45826", "#61764B" });
        themes.add(new String[] { "#555876", "#6B728E", "#404258", "#50577A", "#282A3A", "#474E68", "#6B728E",
                "#474E68", "#ffffff", "#EE2B47", "#1C6758" });
        themes.add(new String[] { "#AF2655", "#662549", "#451952", "#AE445A", "#282A3A", "#F39F5A", "#6B240C",
                "#E48F45", "#ffffff", "#D80032", "#4F6F52" });
    }

    public static String[] currTheme(int n) {
        Database.themes.numTheme = n;
        return themes.get(n);
    }
}
