package main.java.app.Controller;

import java.awt.Color;

import main.java.app.Model.Themes;

public class ColoringController {
    public static String[] theme;
    static {
        theme = Themes.getTheme();
    }

    public static Color getFirstColor() {
        return Color.decode(theme[0]);
    }

    public static Color getFirstColorLight() {
        return Color.decode(theme[1]);
    }

    public static Color getFirstColorDark() {
        return Color.decode(theme[2]);
    }

    // ------------------------------------
    public static Color getSecoundColor() {
        return Color.decode(theme[3]);
    }

    public static Color getSecoundColorLight() {
        return Color.decode(theme[4]);
    }

    public static Color getSecoundColorDark1() {
        return Color.decode(theme[5]);
    }

    public static Color getSecoundColorDark2() {
        return Color.decode(theme[6]);
    }
    // ------------------------------------

    public static Color getWhiteColor() {
        return Color.decode(theme[7]);

    }

    public static Color getBlackColor() {
        return Color.decode(theme[8]);
    }

    public static Color getRedColor() {
        return Color.decode(theme[9]);
    }

    public static Color getGreenColor() {
        return Color.decode(theme[10]);
    }
}
