package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cartpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartpage);
    }

    public  void confirmorder (View view){
        Intent i5 = new Intent( cartpage.this,orderconfirm.class);
        startActivity(i5);
    }
}
