package com.example.myweeklycalender;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login (View v){
        Intent myIntent = new Intent(this, MainActivity.class);
        this.startActivity(myIntent);
    }

}
