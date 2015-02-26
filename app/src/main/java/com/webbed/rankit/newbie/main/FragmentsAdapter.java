package com.webbed.rankit.newbie.main;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.webbed.rankit.newbie.Fragments.FragmentA;
import com.webbed.rankit.newbie.Fragments.FragmentB;
import com.webbed.rankit.newbie.Fragments.FragmentC;
import com.webbed.rankit.newbie.Fragments.FragmentD;
import com.webbed.rankit.newbie.Fragments.FragmentE;
import com.webbed.rankit.newbie.Fragments.FragmentF;
import com.webbed.rankit.newbie.Fragments.FragmentG;

public class  FragmentsAdapter extends FragmentStatePagerAdapter{

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }



    @Override
    public Fragment getItem(int position)
    {
        // TODO Auto-generated method stub
        Fragment fragment = null;

        switch(position){
            case 0:
                fragment = new FragmentA();
                break;
            case 1:
                fragment = new FragmentB();
                break;
            case 2:
                fragment = new FragmentC();
                break;
            case 3:
                fragment = new FragmentD();
                break;

            case 4:
                fragment = new FragmentF();
                break;
            case 5:
                fragment = new FragmentG();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch(position){
            case 0:
                title = "Coding Events";
                break;
            case 1:
                title = "Quiz Events";
                break;
            case 2:
                title = "Fun Events";
                break;
            case 3:
                title = "Visuals";
                break;

            case 4:
                title = "Gaming";
                break;
            case 5:
                title = "Tools And Hardware";
                break;
        }
        return title;
    }

}
