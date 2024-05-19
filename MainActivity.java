package com.example.lab_6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button example = findViewById(R.id.buttonExample);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CheckBox exampleCheckBox = findViewById(R.id.checkBoxExample);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RadioGroup exampleRadioGroup = findViewById(R.id.radioGroupExample);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ToggleButton exampletoggleButton = findViewById(R.id.toggleButtonExample);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton exampleImageButton = findViewById(R.id.imageButtonExample);
        example.setOnClickListener(arg0 -> {
            // TODO Auto-generated method stub
            ToastToDisplay("Hey Button is pressed!!");
        });
        exampleCheckBox.setOnClickListener(v -> {
// TODO Auto-generated method stub
            if (((CheckBox) v).isChecked()) {
                ToastToDisplay("Check Box is checked");
            } else {
                ToastToDisplay("Check box is unchecked");
            }
        });
        exampleRadioGroup
                .setOnCheckedChangeListener((group, checkedId) -> {
// TODO Auto-generated method stub
                    RadioButton rb1 = findViewById(R.id.radioButton1);
                    RadioButton rb2 = findViewById(R.id.radioButton2);
                    if (rb1.isChecked()) {
                        ToastToDisplay("Radio Button 1 is checked");
                    } else if (rb2.isChecked()) {
                        ToastToDisplay("Radio Button 2 is checked");
                    } else {
                        ToastToDisplay("Radio Button 3 is checked");
                    }
                });
        exampletoggleButton.setOnClickListener(v -> {
        //TODO Auto-generated method stub
            if (((ToggleButton) v).isChecked()) {
                ToastToDisplay("Toggle button is ON");
            } else {
                ToastToDisplay("Toggle Button is OFF");
            }
        });
        exampleImageButton.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            ToastToDisplay("Image Button is pressed");
        });
    }
    private void ToastToDisplay(String args) {
        Toast.makeText(getBaseContext(), args, Toast.LENGTH_SHORT).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}