package com.example.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EventList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        (findViewById(R.id.activity_event_list_profile_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), profile.class);
                startActivity(intent);
            }
        });

    }

    public void event(View view){

        Intent intent = new Intent(getApplicationContext(), EventDetails.class);
        startActivity(intent);
    }

    public void hide(View view){

        Intent intent = new Intent(getApplicationContext(), MapActivity.class);
        startActivity(intent);
    }
}
