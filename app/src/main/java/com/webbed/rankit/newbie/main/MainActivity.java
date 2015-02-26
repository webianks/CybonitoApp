package com.webbed.rankit.newbie.main;


import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.webbed.rankit.newbie.R;
import com.webbed.rankit.newbie.TabLayouts.SlidingTabLayout;


public class MainActivity extends ActionBarActivity {


    private Toolbar toolBar;
    private ViewPager mViewPager;
    private SlidingTabLayout mSlidingTab;


    private static String TAG = MainActivity.class.getSimpleName();
    private FragmentsAdapter mFragmentsAdapter;

    @Override
    protected void
    onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolBar=(Toolbar) findViewById(R.id.my_toolBar);
        setSupportActionBar(toolBar);

       NavigationDrawerFragment ndf= (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentNavigationDrawer);
       ndf.setUp(R.id.fragmentNavigationDrawer,(DrawerLayout)findViewById(R.id.DrawerLayout),toolBar);

        mViewPager=(ViewPager)findViewById(R.id.pager);
        mSlidingTab= (SlidingTabLayout) findViewById(R.id.msliding_tabs);

        mFragmentsAdapter =new FragmentsAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mFragmentsAdapter);

        mSlidingTab.setViewPager(mViewPager);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {


            startActivity(new Intent(this,AboutApp.class));

            return true;
        }
        if(id==android.R.id.home){

            NavUtils.navigateUpFromSameTask(this);

        }

        return super.onOptionsItemSelected(item);
    }


}
