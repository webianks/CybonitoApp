package com.webbed.rankit.newbie.Getters;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/5/2015.
 */
public class Fun {



    static String[] EventName={"Amazing Race","Arm Wrestling", "Tambola", "Dumb Saraz",
            "Freaky Circuit", "Get Famous", "7 Up-7 Down", "Type Pixit"};

    static int[] EventImage = {R.drawable.amazingrace,R.drawable.default_pic,R.drawable.default_pic,R.drawable.default_pic,
            R.drawable.default_pic,R.drawable.default_pic,R.drawable.default_pic,R.drawable.default_pic};


    public static String[] getEventName(){
        return EventName;
    }


    public static int[] getEventImage(){
        return EventImage;
    }



}
