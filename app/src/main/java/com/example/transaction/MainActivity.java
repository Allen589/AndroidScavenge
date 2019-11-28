package com.example.transaction;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Update the number of pizzas and water selected when Order More button is pressed.
        ((TextView) findViewById(R.id.pizza_cntr)).setText(String.valueOf(Global.pizzaCount));
        ((TextView) findViewById(R.id.water_cntr)).setText(String.valueOf(Global.waterCount));
        ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));

        // Here are some of the action listeners. The maximum quantity for water and pizzas is 4.
        // If the increase button on the pizza is pressed, the number of pizzas will be increased by 1.
        (findViewById(R.id.pizza_increase_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Global.pizzaCount < 4) {
                    ((TextView) findViewById(R.id.pizza_cntr)).setText(String.valueOf(++Global.pizzaCount));
                    ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));
                }
            }
        });
        // If the decrease button on the pizza is pressed, the number of pizzas will be decreased by 1.
        (findViewById(R.id.pizza_decrease_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Global.pizzaCount - 1 >= 0) {
                    ((TextView) findViewById(R.id.pizza_cntr)).setText(String.valueOf(--Global.pizzaCount));
                    ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));
                }
            }
        });
        // If the increase button on the water is pressed, the number will be increased by 1.
        (findViewById(R.id.water_increase_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Global.waterCount < 4) {
                    ((TextView) findViewById(R.id.water_cntr)).setText(String.valueOf(++Global.waterCount));
                    ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));
                }
            }
        });
        // If the decrease button on the water is pressed, the number will be decreased by 1.
        (findViewById(R.id.water_decrease_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Global.waterCount - 1 >= 0) {
                    ((TextView) findViewById(R.id.water_cntr)).setText(String.valueOf(--Global.waterCount));
                    ((TextView) findViewById(R.id.amnt_cntr)).setText(String.valueOf(Global.pizzaCount + Global.waterCount));
                }
            }
        });
        // Here we go to another activity screen that handles the order list, displaying the cost details.
        (findViewById(R.id.order_bttn)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), order_activity.class);
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
                // Go to Previous Screen.
            }
        });
    }
}
