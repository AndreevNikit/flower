package com.example.flower;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class vhod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);

        }
        public void onClick(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

        }
}