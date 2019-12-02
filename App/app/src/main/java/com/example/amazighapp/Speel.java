package com.example.amazighapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Speel extends AppCompatActivity {

    private DatabaseReference databaseSpeel;
    private ValueEventListener onChangeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speel);

        databaseSpeel = FirebaseDatabase.getInstance().getReference().child("categorieën");
    }


    public void onStart() {
        super.onStart();
        ValueEventListener onChangeListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Toast.makeText(Speel.this, "Er is nieuwe data",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(Speel.this, "Failed to load data.",
                        Toast.LENGTH_SHORT).show();
            }
        };
        databaseSpeel.addValueEventListener(onChangeListener);
    }
}
