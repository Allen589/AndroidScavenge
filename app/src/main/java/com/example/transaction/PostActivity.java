package com.example.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class PostActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }

    public void back(View view) {

        Intent intent = new Intent(getApplicationContext(), MapActivity.class);
        startActivity(intent);
    }

    public void submit(View view) {

        Intent intent = new Intent(getApplicationContext(), Submitted.class);
        String title = ((EditText)findViewById(R.id.title)).getText().toString();
        String location = ((EditText)findViewById(R.id.location)).getText().toString();
        String start = ((EditText)findViewById(R.id.start)).getText().toString();
        String end = ((EditText)findViewById(R.id.end)).getText().toString();
        intent.putExtra("title", title);
        intent.putExtra("location", location);
        intent.putExtra("start", start);
        intent.putExtra("end", end);
        startActivity(intent);
    }

    public void camera(View view) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
}