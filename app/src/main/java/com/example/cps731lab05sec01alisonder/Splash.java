package com.example.cps731lab05sec01alisonder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    MediaPlayer cafe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        cafe = new MediaPlayer();
        cafe = MediaPlayer.create(this, R.raw.db);
        cafe.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Splash.this, ItemListActivity.class));
                cafe.stop();
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}
