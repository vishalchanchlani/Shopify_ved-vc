package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class employeelogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employeelogin);
    }

    public  void enteremplgn (View view){
        Intent i4 = new Intent( employeelogin.this,orderlist.class);
        startActivity(i4);
    }
}
