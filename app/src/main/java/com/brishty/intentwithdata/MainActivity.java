package com.brishty.intentwithdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstName;
    private  EditText lastName;
    private Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = (EditText) findViewById(R.id.firtNameET);
        lastName = (EditText) findViewById(R.id.lastNameET);
        submitbtn = (Button) findViewById(R.id.Submitbtn);

        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = firstName.getText().toString();
                String lname = lastName.getText().toString();


                Intent secPage = new Intent(MainActivity.this, SecondActivity.class);
                secPage.putExtra("fname",fname);
                secPage.putExtra("lname",lname);
                startActivity(secPage);
            }
        });

    }
}
