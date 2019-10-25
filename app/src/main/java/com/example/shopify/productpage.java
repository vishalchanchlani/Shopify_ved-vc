package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class productpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productpage);
    }

    public  void product1 (View view){
        Intent i6 = new Intent( productpage.this,cartpage.class);
        startActivity(i6);
    }

    public  void product2 (View view){
        Intent i7 = new Intent( productpage.this,cartpage.class);
        startActivity(i7);
    }

    public  void product3 (View view){
        Intent i8 = new Intent( productpage.this,cartpage.class);
        startActivity(i8);
    }

    public  void product4 (View view){
        Intent i9 = new Intent( productpage.this,cartpage.class);
        startActivity(i9);
    }

    public  void product5 (View view){
        Intent i10 = new Intent( productpage.this,cartpage.class);
        startActivity(i10);
    }

    public  void product6 (View view){
        Intent i11 = new Intent( productpage.this,cartpage.class);
        startActivity(i11);
    }

    public  void product7 (View view){
        Intent i12 = new Intent( productpage.this,cartpage.class);
        startActivity(i12);
    }
}
