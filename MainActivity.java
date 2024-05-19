package com.example.lab4;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnExplicitContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnExplicitContent=findViewById(R.id.btnExplicitContent);

        btnExplicitContent.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        });
    }
}