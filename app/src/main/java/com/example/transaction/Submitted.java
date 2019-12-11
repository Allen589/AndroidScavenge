package com.example.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Submitted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submitted);
        String title = getIntent().getStringExtra("title");
        String location = getIntent().getStringExtra("location");
        String start = getIntent().getStringExtra("start");
        String end = getIntent().getStringExtra("end");

        Log.e("submit_tag",start);
        ((TextView)findViewById(R.id.title)).setText(title);
        ((TextView)findViewById(R.id.location)).setText(location);
        ((TextView)findViewById(R.id.start)).setText(start);
        ((TextView)findViewById(R.id.end)).setText(end);
    }
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(getApplicationContext(), MapActivity.class);
        startActivity(intent);
    }

    public void back(View view) {

        Intent intent = new Intent(getApplicationContext(), MapActivity.class);
        startActivity(intent);
    }
}
