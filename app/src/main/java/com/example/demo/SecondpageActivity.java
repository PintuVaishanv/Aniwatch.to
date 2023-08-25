package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.material.button.MaterialButton;

public class SecondpageActivity extends AppCompatActivity {

    Button loginbtn;
    VideoView Video1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        loginbtn = findViewById(R.id.loginbtn);
        Video1 = findViewById(R.id.Video1);

        String path = "android.resource://com.example.demo/" + R.raw.video6;
        Uri u = Uri.parse(path);
        Video1.setVideoURI(u);
        Video1.start();
        Video1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    // Correct login
                    Toast.makeText(SecondpageActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent a = new Intent(SecondpageActivity.this, third.class);
                            a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                            startActivity(a);
                        }
                    }, 1000); // 1000 milliseconds = 1 second
                } else {
                    // Incorrect login
                    Toast.makeText(SecondpageActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onResume() {
        Video1.resume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Video1.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Video1.stopPlayback();
        super.onDestroy();
    }
}