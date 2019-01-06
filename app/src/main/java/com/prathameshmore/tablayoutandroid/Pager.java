package com.prathameshmore.tablayoutandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 1:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 2:
                Tab2 tab2 = new Tab2();
                return tab2;

            case 3:
                Tab3 tab3 = new Tab3();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
