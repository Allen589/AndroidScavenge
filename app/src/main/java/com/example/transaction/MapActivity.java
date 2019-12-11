package com.example.transaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // marker 1 goes to event details page
        (findViewById(R.id.marker_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EventDetails.class);
                startActivity(intent);
            }
        });

        // marker 2 goes to events details page as well
        (findViewById(R.id.marker_2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EventDetails.class);
                startActivity(intent);
            }
        });

        // Goes to profile
        (findViewById(R.id.profile_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), profile.class);
                startActivity(intent);
            }
        });

    }

    public void post(View view){

        Intent intent = new Intent(getApplicationContext(), PostActivity.class);
        startActivity(intent);
    }
    public void browse(View view){

        Intent intent = new Intent(getApplicationContext(), EventList.class);
        startActivity(intent);
    }
}
