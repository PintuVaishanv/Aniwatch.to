package com.example.demo;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button GetStarted;
    VideoView Video1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetStarted = (Button) findViewById(R.id.GetStarted);
        Video1 = (VideoView) findViewById(R.id.Video1);

        String path = "android.resource://com.example.demo/" + R.raw.itachi;
        Uri u = Uri.parse(path);
        Video1.setVideoURI(u);
        Video1.start();

        Video1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        GetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, fourthpage.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

    }

    @Override
    protected void onResume(){
        Video1.resume();
        super.onResume();
    }

    @Override
    protected void onPause(){
        Video1.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        Video1.stopPlayback();
        super.onDestroy();
    }




}
