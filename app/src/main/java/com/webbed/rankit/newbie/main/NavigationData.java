package com.webbed.rankit.newbie.main;

/**
 * Created by R Ankit on 1/25/2015.
 */
public class NavigationData {

    static int[] navIconId;
    static String[] navText;

    public static String getText(int position) {
        return navText[position];
    }
    public static int getImage(int position) {
        return navIconId[position];
    }
}
