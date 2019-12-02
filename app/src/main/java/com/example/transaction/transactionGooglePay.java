package com.example.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class transactionGooglePay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_google_pay);

        ((TextView) findViewById(R.id.total_cost)).setText(format.format(Global.waterCount * 0.50 + Global.pizzaCount * 1.00));


        // Goes to QR Code Screen
        (findViewById(R.id.pay_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), transactionQRCode.class);
                startActivity(intent);
            }
        });

        // Here we can go to the home page
        (findViewById(R.id.home_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Home Screen.
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });

        // Here we can go to the previous screen. In this case, payment option screen.
        (findViewById(R.id.back_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), transactionPaymentOptionScreen.class);
                startActivity(intent);
            }
        });

        (findViewById(R.id.change_payment_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), transactionPaymentOptionScreen.class);
                startActivity(intent);
            }
        });

    }
}
