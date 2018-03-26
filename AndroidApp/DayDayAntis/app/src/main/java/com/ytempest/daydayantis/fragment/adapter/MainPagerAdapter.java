package com.ytempest.daydayantis.fragment.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author ytempest
 *         Description：
 */
public class MainPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> mFragments;

    public MainPagerAdapter(FragmentManager fm, List fragments) {
        super(fm);
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
