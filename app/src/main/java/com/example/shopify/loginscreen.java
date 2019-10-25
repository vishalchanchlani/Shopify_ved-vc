package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
    }


    //After clicking on Customer Login button nextpage will be called by this Intent method
    public  void custlgn (View view){
        Intent i1 = new Intent( loginscreen.this,customerlogin.class);
        startActivity(i1);
    }

    // Employee Login button
    public void emplgn (View view){
        Intent i2 = new Intent(loginscreen.this,employeelogin.class);
        startActivity(i2);
    }
}
