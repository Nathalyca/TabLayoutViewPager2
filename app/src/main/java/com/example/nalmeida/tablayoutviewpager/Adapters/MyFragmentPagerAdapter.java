package com.example.nalmeida.tablayoutviewpager.Adapters;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nalmeida.tablayoutviewpager.fragments.FragmentA;
import com.example.nalmeida.tablayoutviewpager.fragments.FragmentB;

/**
 * Created by nalmeida on 31/07/2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{

    private String[] mtabTitles;

    public MyFragmentPagerAdapter(FragmentManager fm,String[] mtabTitles) {
        super(fm);
        this.mtabTitles = mtabTitles;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return this.mtabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mtabTitles[position];
    }
}
