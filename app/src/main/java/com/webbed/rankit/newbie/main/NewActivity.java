package com.webbed.rankit.newbie.main;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 1/25/2015.
 */
public class NewActivity extends ActionBarActivity{


    private Toolbar toolbar;
    private final String TAG="WEBIANKS";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        toolbar= (Toolbar) findViewById(R.id.my_toolBarNewActivity);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
