package com.galeopsis.homework_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.btn_next);
        next.setOnClickListener(view -> {
            Intent myIntent = new Intent(view.getContext(), activity_second.class);
            startActivityForResult(myIntent, 0);
        });

    }
}