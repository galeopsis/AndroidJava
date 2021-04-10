package com.galeopsis.homework_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activity_second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button next = findViewById(R.id.btn_back);
        next.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), MainActivity.class);
            startActivityForResult(myIntent, 0);
        });
    }
}