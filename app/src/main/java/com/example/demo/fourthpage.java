package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthpage extends AppCompatActivity {

    Button button2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthpage);

        button2 = findViewById(R.id.button2); // Replace with the actual ID of your button
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(fourthpage.this, SecondpageActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
        button1 = findViewById(R.id.button1); // Replace with the actual ID of your button
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent a = new Intent(fourthpage.this, fifthpage.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }

}

