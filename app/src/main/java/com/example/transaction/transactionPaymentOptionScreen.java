package com.example.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transactionPaymentOptionScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_payment_option_screen);

        // Goes to the Apple Pay transaction screen
        (findViewById(R.id.apple_pay_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), transactionApplePay.class);
                startActivity(intent);
            }
        });

        // Goes to the Google Pay transaction screen
        (findViewById(R.id.google_pay_btn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), transactionGooglePay.class);
                startActivity(intent);
            }
        });

        // Here we can go to the home page
        (findViewById(R.id.home_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Home Screen.
            }
        });
        // Here we can go to the previous screen.In this case, it is the order more screen.
        (findViewById(R.id.back_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), order_activity.class);
                startActivity(intent);
            }
        });
    }
}
