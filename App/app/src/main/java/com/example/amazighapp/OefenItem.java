package com.example.amazighapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OefenItem extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oefen_item);

        Bundle extras = getIntent().getExtras();
        String bericht = extras.getString("categorie");

        Toast.makeText(OefenItem.this, bericht,
                Toast.LENGTH_SHORT).show();
    }
}
