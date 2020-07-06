package com.example.quicklauncher;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView myTextView = (TextView) findViewById(R.id.myTextView);
        String text = getIntent().getStringExtra("name");
        myTextView.setText(text + "Welcome folks!");

    }
}