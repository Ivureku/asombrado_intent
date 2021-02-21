package com.example.asombrado_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.btnNextactivity);


        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

                TextView display = findViewById(R.id.displayTxt);
                EditText input = findViewById(R.id.inputText);



                Intent i= new Intent(MainActivity.this,Activity2.class);
                startActivity(i);

                int numMonths = Integer.parseInt(String.valueOf(input.getText()));





        switch (v.getId()){
           case R.id.btnNextactivity:
                i.putExtra("IntMonths",numMonths);

                startActivity(i);


                break;

        }

    }
}