package com.example.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        TextView textView4 = (TextView) findViewById(R.id.textView4);

        Button welcomeBtn = (Button) findViewById(R.id.welcomeBtn);
        welcomeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               Intent startIntent = new Intent(MainActivity.this, com.example.quicklauncher.SecondActivity.class);
               startIntent.putExtra("name","Hey,");
               startActivity(startIntent);
            }
        });
        Button GoogleBtn = (Button) findViewById(R.id.GoogleBtn );
        GoogleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                if (goToGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(goToGoogle);
                }
            }
        });
        }
}