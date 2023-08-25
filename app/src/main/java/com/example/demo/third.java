package com.example.demo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button site = findViewById(R.id.site);
        Button home = findViewById(R.id.home);
        Button movies = findViewById(R.id.movies);
        Button tvseries = findViewById(R.id.tvseries);
        Button popular = findViewById(R.id.popular);
        Button airing = findViewById(R.id.airing);
        Button kaisen = findViewById(R.id.kaisen);
        Button onepiece = findViewById(R.id.onepiece);
        Button naruto = findViewById(R.id.naruto);
        Button demons = findViewById(R.id.demons);
        Button chainsaw = findViewById(R.id.chainsaw);
        Button titan = findViewById(R.id.titan);
        Button punchman = findViewById(R.id.punchman);
        Button deathnote = findViewById(R.id.deathnote);
        Button boruto = findViewById(R.id.boruto);
        Button attackon = findViewById(R.id.attackon);
        Button dragonball = findViewById(R.id.dragonball);

       site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/home");
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/home");
            }
        });

        movies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/movie");
            }
        });

        tvseries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/tv");
            }
        });

        popular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/most-popular");
            }
        });

        airing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/top-airing");
            }
        });

        kaisen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/jujutsu-kaisen-2nd-season-18413?ref=search");
            }
        });

        onepiece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/one-piece-100?ref=search");
            }
        });

        naruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/naruto-677?ref=search");
            }
        });

        demons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/demon-slayer-kimetsu-no-yaiba-47?ref=search");
            }
        });

        chainsaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/chainsaw-man-17406?ref=search");
            }
        });

        titan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/attack-on-titan-112?ref=search");
            }
        });

        punchman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/one-punch-man-63?ref=search");
            }
        });

        deathnote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/death-note-60?ref=search");
            }
        });

        boruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/boruto-naruto-next-generations-8143?ref=search");
            }
        });

        attackon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/attack-on-titan-final-season-part-2-17753?ref=search");
            }
        });

        dragonball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("https://aniwatch.to/dragon-ball-z-325?ref=search");
            }
        });
    }

    private void openUrl(String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

