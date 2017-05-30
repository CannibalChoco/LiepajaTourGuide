package com.example.android.liepajatourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new NatureFragment();
            case 1:
                return new ActiveLeisureFragment();
            case 2:
                return new ClassicsFragment();
            case 3:
                return new HotelsFragment();
            case 4:
                return new DiningFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return context.getString(R.string.category_nature);
            case 1:
                return context.getString(R.string.category_active_leisure);
            case 2:
                return context.getString(R.string.category_classics);
            case 3:
                return context.getString(R.string.category_hotels);
            case 4:
                return context.getString(R.string.category_dining);
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return 5;
    }

}
