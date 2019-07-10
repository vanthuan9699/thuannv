package com.example.viewpagerdemo.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerServiceAdapter extends FragmentPagerAdapter {
    Context context;
    ArrayList<Fragment> data;

    public ViewPagerServiceAdapter(FragmentManager fm, Context context, ArrayList<Fragment> data) {
        super(fm);
        this.context = context;
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    public CharSequence getPageTitle(int position){
        switch (position) {
            case 0:
                return "Đang sửa chữa";
            case 1:
                return "Cảnh báo";
            case 2:
                return "Đề xuất";
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }
}
