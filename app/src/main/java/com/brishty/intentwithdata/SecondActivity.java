package com.brishty.intentwithdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView firstName;
    private  TextView lastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        firstName = (TextView) findViewById(R.id.firtNameTV);
        lastName = (TextView) findViewById(R.id.lastNameTV);
        String fname = getIntent().getStringExtra("fname");
        String lname = getIntent().getStringExtra("lname");
        firstName.setText(fname);
        lastName.setText(lname);


    }
}
