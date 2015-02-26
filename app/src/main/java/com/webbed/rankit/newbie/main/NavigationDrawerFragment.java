package com.webbed.rankit.newbie.main;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webbed.rankit.newbie.Intents.ContactUs;
import com.webbed.rankit.newbie.Intents.Cybonito;
import com.webbed.rankit.newbie.Intents.Department;
import com.webbed.rankit.newbie.Intents.Team;
import com.webbed.rankit.newbie.R;

import java.util.ArrayList;
import java.util.List;


public class NavigationDrawerFragment extends Fragment  implements NavigationAdapter.ClickListener{


    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;
    private boolean mUserLearnedDrawer;
    private boolean mFromInstanceState;
    private static final String PREF_FILE = "my_pref";
    private static final String KEY_USER_LEARNED = "user_learned_drawer";
    private View container_view;
    private RecyclerView navRecyclerView;
    private NavigationAdapter navAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mUserLearnedDrawer = Boolean.valueOf(readFromPreferences(getActivity(), KEY_USER_LEARNED, "false"));
        if (savedInstanceState != null) {

            mFromInstanceState = true;
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        navRecyclerView = (RecyclerView) view.findViewById(R.id.navigationRecView);
        navAdapter = new NavigationAdapter(getActivity(), getData());

        navAdapter.setClickListener(this);

        navRecyclerView.setAdapter(navAdapter);
        navRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //to simple download a page from internet

        /*RequestQueue requestQueue= AppController.getInstance().getRequestQueue();

        StringRequest stringRequest=new StringRequest(Request.Method.GET,"http://php.net/",new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

               //Toast.makeText(getActivity(),response,Toast.LENGTH_LONG).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                //Toast.makeText(getActivity(),error.getMessage().toString(),Toast.LENGTH_LONG).show();

            }
        });

        requestQueue.add(stringRequest);*/



        return view;
    }


    public static List<NavigationData> getData() {
        List<NavigationData> dataList = new ArrayList<>();
        int[] icons = {R.drawable.ic_computer, R.drawable.ic_cybonito_logo, R.drawable.ic_teamwork, R.drawable.ic_notebook};
        String[] text = {"Department", "Cybonito", "Team","Contact Us"};

        for (int i = 0; i < icons.length && i < text.length; i++) {
            NavigationData data = new NavigationData();
            data.navIconId = icons;
            data.navText = text;
            dataList.add(data);
        }
        return dataList;
    }


    public void setUp(int fragment_id, DrawerLayout drawer, Toolbar toolbar) {

        mDrawerLayout = drawer;
        container_view = getActivity().findViewById(fragment_id);

        mDrawerToggle = new ActionBarDrawerToggle(getActivity(), mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActivity().invalidateOptionsMenu();

                if (!mUserLearnedDrawer) {
                    mUserLearnedDrawer = true;
                    saveToPreferences(getActivity(), KEY_USER_LEARNED, mUserLearnedDrawer + "");
                }


            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();

            }

        };

        if (!mUserLearnedDrawer && !mFromInstanceState) {
            mDrawerLayout.openDrawer(container_view);
        }

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {

            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });

    }


    public static void saveToPreferences(Context context, String prefName, String value) {
        SharedPreferences pref = context.getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(prefName, value);
        editor.apply();
    }


    public static String readFromPreferences(Context context, String prefName, String value) {
        SharedPreferences pref = context.getSharedPreferences(PREF_FILE, Context.MODE_PRIVATE);
        return pref.getString(prefName, value);

    }






    @Override
    public void itemClicked(View view, int position) {

        switch(position) {
            case 0:
                startActivity(new Intent(getActivity(), Department.class));
                break;
            case 1:
                startActivity(new Intent(getActivity(), Cybonito.class));
                break;
            case 2:
                startActivity(new Intent(getActivity(), Team.class));
                break;
            case 3:
                startActivity(new Intent(getActivity(), ContactUs.class));
                break;


        }

    }





}
