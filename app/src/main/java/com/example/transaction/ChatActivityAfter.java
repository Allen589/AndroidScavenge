package com.example.transaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivityAfter extends AppCompatActivity {
    String receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_after);

        Intent i = getIntent();
        receivedText = i.getStringExtra("text_label");

        TextView textView = findViewById(R.id.myViewText);
        textView.setText(receivedText);


        (findViewById(R.id.back_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EventDetails.class);
                startActivity(intent);
            }
        });

        (findViewById(R.id.home_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Home Screen.
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });

        (findViewById(R.id.button_chatbox_send)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Home Screen.
                Intent intent = new Intent(getApplicationContext(), ChatActivityAfter.class);
                EditText et = findViewById(R.id.edittext_chatbox);
                String theText = et.getText().toString();

                intent.putExtra("text_label", theText);
                startActivity(intent);
            }
        });
    }
}
