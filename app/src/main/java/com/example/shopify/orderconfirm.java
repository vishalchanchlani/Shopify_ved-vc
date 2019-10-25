package com.example.shopify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class orderconfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderconfirm);
    }

    public  void shoppingcontinue (View view){
        Intent i14 = new Intent( orderconfirm.this,productpage.class);
        startActivity(i14);
    }


    public void cstlogout (View view){
        Intent i15 = new Intent(orderconfirm.this,loginscreen.class);
        startActivity(i15);
    }
}
