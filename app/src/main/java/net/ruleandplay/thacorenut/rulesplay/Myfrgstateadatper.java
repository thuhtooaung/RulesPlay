package net.ruleandplay.thacorenut.rulesplay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class Myfrgstateadatper extends FragmentStatePagerAdapter {
    Myfrgstateadatper(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return offline.newInstance();
        }
        if (position==1){
            return online.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
