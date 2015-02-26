package com.webbed.rankit.newbie.Getters;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/5/2015.
 */
public class Quiz {



    static String[] EventName={"Pictionary","Logo Quiz","Cybotech v2"};

    static int[] EventImage = {R.drawable.pictionary,R.drawable.logoquiz,R.drawable.cybotech2015};


    public static String[] getEventName(){
        return EventName;
    }


    public static int[] getEventImage(){
        return EventImage;
    }



}
