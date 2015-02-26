package com.webbed.rankit.newbie.Getters;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/5/2015.
 */
public class Coding {



    static String[] EventName={"Code Jam", "Blind Coding"};
    static int[] EventImage = {R.drawable.codejam,R.drawable.blindcoding};


    public  static String[] getEventName(){
        return EventName;
    }


    public static int[] getEventImage(){

        return EventImage;
    }



}
