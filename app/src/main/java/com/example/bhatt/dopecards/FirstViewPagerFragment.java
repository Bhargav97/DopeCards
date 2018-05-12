package com.example.bhatt.dopecards;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bhatt on 12-05-2018.
 */

public class FirstViewPagerFragment extends Fragment {
    VerticalViewPager verticalViewPager;
    public FirstViewPagerFragment(){

    }
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.first_vp_layout, container, false);
        //setContentView(R.layout.activity_main);

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //setSupportActionBar(toolbar);

        verticalViewPager = (VerticalViewPager) view.findViewById(R.id.verticalViewPager);

        verticalViewPager.setAdapter(new VerticalPagerAdapter(getActivity()));
        return view;
    }
}
