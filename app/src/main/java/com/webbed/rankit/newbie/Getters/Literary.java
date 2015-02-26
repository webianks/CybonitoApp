package com.webbed.rankit.newbie.Getters;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/5/2015.
 */
public class Literary {



    static String[] EventName={"Mock Press", "The Forum", ".PPT"};
    static int[] EventImage = {R.drawable.mockpress,R.drawable.default_pic,R.drawable.default_pic };


    public  static String[] getEventName(){
        return EventName;
    }


    public static int[] getEventImage(){

        return EventImage;
    }


}
