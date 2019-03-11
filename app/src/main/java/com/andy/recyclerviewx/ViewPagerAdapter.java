package com.andy.recyclerviewx;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter  extends FragmentPagerAdapter {

    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lsTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lsTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return lsTitles.get(position);
    }

    public void AddFragment (Fragment fragment,String title){
        lstFragment.add(fragment);
        lsTitles.add(title);
    }
}
