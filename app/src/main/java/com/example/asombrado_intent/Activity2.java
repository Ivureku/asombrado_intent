package com.example.asombrado_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {


        Intent i = new Intent(Activity2.this, MainActivity.class);


        switch (v.getId()) {
            case R.id.button:


                startActivity(i);


                break;


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boolean condition;
        int x = 0;

        Intent i = getIntent();
        x = (i.getIntExtra("IntMonths", 0));

        Button back = findViewById(R.id.button);


        back.setOnClickListener(this);

        TextView display = findViewById(R.id.textView);

        switch (x) {
            case 1:
                display.setText(
                        "The month that you have typed is Januray ");
                break;
            case 2:
                display.setText(
                        "The month that you have typed is Febraury ");

                break;
            case 3:
                display.setText(
                        "The month that you have typed is March ");

                break;
            case 4:
                display.setText(
                        "The month that you have typed is April ");
                break;
            case 5:
                display.setText(
                        "The month that you have typed is May ");
                break;
            case 6:
                display.setText(
                        "The month that you have typed is June ");
                break;
            case 7:
                display.setText(
                        "The month that you have typed is July ");
                break;
            case 8:
                display.setText(
                        "The month that you have typed is August ");
                break;
            case 9:
                display.setText(
                        "The month that you have typed is September ");
                break;
            case 10:
                display.setText(
                        "The month that you have typed is October ");
                break;
            case 11:
                display.setText(
                        "The month that you have typed is November ");
                break;
            case 12:
                display.setText(
                        "The month that you have typed is December ");
                break;

            default:
                display.setText(
                        "Invalid Number Motherfucker");
                break;


        }
    }
}