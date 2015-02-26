package com.webbed.rankit.newbie.Getters;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/5/2015.
 */
public class ToolsAndHardware {



    static String[] EventName={"Pandora Box", "Photo Flexer", "Assemble'em Up"};
    static int[] EventImage = {R.drawable.fiinal,R.drawable.photo,R.drawable.default_pic};


    public static String[] getEventName(){
        return EventName;
    }


    public static int[] getEventImage(){ return EventImage; }



}
