package com.example.sadi.smartdoorapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

/**
 * Created by Sami Ullah on 3/16/2016.
 */
public class Account_Settings extends Fragment {
    View myView;
    private static TabHost host;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        host = (TabHost) container.findViewById(R.id.tabHost);
        host.setVisibility(View.GONE);
        myView = inflater.inflate(R.layout.activity_account_settings,container,false);
        return myView;
    }
}
