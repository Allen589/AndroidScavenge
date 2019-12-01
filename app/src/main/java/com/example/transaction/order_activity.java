package com.example.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class order_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // NumberFormat help with displaying the cost of selected items
        NumberFormat format = NumberFormat.getCurrencyInstance();
        if (Global.pizzaCount > 0 && Global.waterCount == 0) {
            setContentView(R.layout.order_list_pizza_only);
            ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));
            ((TextView) findViewById(R.id.pizza_amnt)).setText(String.valueOf(Global.pizzaCount));
            ((TextView) findViewById(R.id.total_cost)).setText(format.format(Global.pizzaCount * 1.00));
        } else if (Global.pizzaCount == 0 && Global.waterCount > 0) {
            setContentView(R.layout.order_list_water_only);
            ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));
            ((TextView) findViewById(R.id.water_amnt)).setText(String.valueOf(Global.waterCount));
            ((TextView) findViewById(R.id.total_cost)).setText(format.format(Global.waterCount * 0.50));
        } else {
            setContentView(R.layout.order_list_pizza_water);
            ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));
            ((TextView) findViewById(R.id.pizza_amnt)).setText(String.valueOf(Global.pizzaCount));
            ((TextView) findViewById(R.id.water_amnt)).setText(String.valueOf(Global.waterCount));
            ((TextView) findViewById(R.id.total_cost)).setText(format.format(Global.waterCount * 0.50 + Global.pizzaCount * 1.00));
        }
        // Here we can go back to the previous screen to make changes to the order.
        (findViewById(R.id.order_more)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        // Here we can go to the payment screen.
        (findViewById(R.id.pay_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), transactionPaymentOptionScreen.class);
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
        // Here we can go to the previous screen.In this case, it is the order more screen.
        (findViewById(R.id.back_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
