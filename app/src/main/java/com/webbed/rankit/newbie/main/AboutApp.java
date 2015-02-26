package com.webbed.rankit.newbie.main;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/5/2015.
 */
public class AboutApp extends ActionBarActivity{

    private Toolbar toolbar;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);


        content=(TextView)findViewById(R.id.about);
        Typeface tfSlab = Typeface.createFromAsset(getAssets(),
                "fonts/RobotoSlab-Regular.ttf");
        content.setTypeface(tfSlab);


    }
}
