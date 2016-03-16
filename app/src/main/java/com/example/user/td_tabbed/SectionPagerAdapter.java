package com.example.user.td_tabbed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 16/03/2016.
 */
public class SectionPagerAdapter extends FragmentPagerAdapter {
    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "SECTION 1";
            case 1:
                return "SECTION 2";
            case 2:
                return "SECTION 3";
        }
        return null;
    }

    @Override
    //la méthode qui va lancer le fragement
    //dans le cas où on veut afficher textviex dans frag1, listview dans frg2, imageview dans frg3
    //il faut créer 3 fragements différents et tester a chaque fois
    public Fragment getItem(int position) {
        PlaceHolderFragement placeHolderFragement= new PlaceHolderFragement();
        Bundle bundle = new Bundle();
        bundle.putInt("position",position);
        return placeHolderFragement;
    }

    @Override
    public int getCount() {
        return 0;
    }

}
