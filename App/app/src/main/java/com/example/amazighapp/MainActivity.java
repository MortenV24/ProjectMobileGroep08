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
        // van huidige activiteit naar over Speel
        Intent intNext = new Intent(this, Speel.class);
        startActivity(intNext);
    }

    public void NaarOefenen(View v){
        // van huidige activiteit naar over Oefen
        Intent intNext = new Intent(this, Oefen.class);
        startActivity(intNext);
    }

    public void NaarOverOns(View v){
        // van huidige activiteit naar over ons
        Intent intNext = new Intent(this, OverOns.class);
        startActivity(intNext);
    }

    public void NaarAchievements(View v){
        // van huidige activiteit naar achievements
        Intent intNext = new Intent(this, Achievements.class);
        startActivity(intNext);
    }

}
