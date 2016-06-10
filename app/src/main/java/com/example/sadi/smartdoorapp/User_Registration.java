package com.example.sadi.smartdoorapp;

import android.content.Intent;
import android.os.Bundle;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


/**
 * Created by Sami Ullah on 3/16/2016.
 */
public class User_Registration extends Main_ScreenActivity {
    private static Button button_next1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
     /*   Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        ButtonNext1();
    }
    public void ButtonNext1()
    {
        button_next1=(Button)findViewById(R.id.button_next1);
        button_next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent next1 = new Intent("com.example.sadi.smartdoorapp.activity_registration2");
                        startActivity(next1);

                }



    });
    }

}
