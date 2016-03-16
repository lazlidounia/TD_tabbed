package com.example.user.td_tabbed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by user on 16/03/2016.
 */
public class PlaceHolderFragement extends android.support.v4.app.Fragment {
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstance)
    {
        View v= inflater.inflate(R.layout.fragment_main,null);
        TextView textView=  (TextView) v.findViewById(R.id.section_label);
        //récupérer la position du tab selectionné
        int i=savedInstance.getInt("position");
        if(i==0)
        {
            textView.setText("Fragement 0");
        }
        if(i==1)
        {
            textView.setText("Fragement 1");
        }
        if(i==2)
        {
            textView.setText("Fragement 2");
        }
        return v;
    }


}

