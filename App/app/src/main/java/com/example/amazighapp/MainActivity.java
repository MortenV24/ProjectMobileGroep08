package com.example.amazighapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void NaarSpelen(View v){
        // van huidige activiteit naar speel
        Intent intNext = new Intent(this, speel.class);
        startActivity(intNext);
    }

    public void NaarOefenen(View v){
        // van huidige activiteit naar oefen
        Intent intNext = new Intent(this, oefen.class);
        startActivity(intNext);
    }

    public void NaarOverOns(View v){
        // van huidige activiteit naar over ons
        Intent intNext = new Intent(this, overOns.class);
        startActivity(intNext);
    }

    public void NaarAchievments(View v){
        // van huidige activiteit naar achievmnets
        Intent intNext = new Intent(this,achievments.class);
        startActivity(intNext);
    }

}
