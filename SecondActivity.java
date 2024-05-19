package com.example.lab4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {
    Button btnImplicitContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnImplicitContent=findViewById(R.id.btnImplicitContent);

        btnImplicitContent.setOnClickListener(view -> {

            Uri webpage = Uri.parse("https://www.google.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(intent);

        });

    }
}
