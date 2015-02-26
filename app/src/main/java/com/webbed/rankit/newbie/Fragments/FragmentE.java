package com.webbed.rankit.newbie.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.webbed.rankit.newbie.R;

/**
 * Created by R Ankit on 2/4/2015.
 */
public class FragmentE extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_e,container,false);
        return view;
    }
}
