package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class orderlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderlist);
    }

    public void emplogout (View view){
        Intent i13 = new Intent(orderlist.this,loginscreen.class);
        startActivity(i13);
    }
}
