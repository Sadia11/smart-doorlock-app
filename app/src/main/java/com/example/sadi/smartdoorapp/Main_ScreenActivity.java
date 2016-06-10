package com.example.sadi.smartdoorapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main_ScreenActivity extends AppCompatActivity {
    // main screen is Login Page here in this class we will initialize some variables
    DatabaseHelper myDB;
    private static EditText username;
    private static EditText password;
    private static TextView attempts;
    private static Button login_btn;
    int attempt_counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__screen);
     // For SQLite implementation
        //myDB=new DatabaseHelper(this);

      /* Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */
        LoginButton();
    }
// making method for Login button in which we will cast all variables declared above i.e username, password, attempts

    public void LoginButton(){
        username = (EditText) findViewById(R.id.editText_usereg);
        password = (EditText) findViewById(R.id.editText_passreg);
       // attempts =(TextView) findViewById(R.id.textView_attemptcount);
        login_btn= (Button) findViewById(R.id.button_login);
        //= (TextView) findViewById(R.id.textView_createAcc);
        final TextView signup =(TextView) findViewById(R.id.textView_signup);

       // attempts.setText(Integer.toString(attempt_counter));


        login_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(username.getText().toString().equals("sadia")&& password.getText().toString().equals("sami")) {
                            Toast.makeText(Main_ScreenActivity.this, "Username and Password is correct", Toast.LENGTH_SHORT).show();
                            //creating instance of intent for redirecting to second screen
                            Intent i = new Intent("com.example.sadi.smartdoorapp.sidePanel");
                            startActivity(i);
                        }
                        else
                        {
                            Toast.makeText(Main_ScreenActivity.this, "Username or Password is not correct", Toast.LENGTH_SHORT).show();
                            attempt_counter--;
                           // attempts.setText(Integer.toString(attempt_counter));
                            if(attempt_counter == 0)
                            {
                                login_btn.setEnabled(false);
                            }
                        }

                    }
                }


        );

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(Main_ScreenActivity.this,User_Registration.class);
                startActivity(i2);

            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main__screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
