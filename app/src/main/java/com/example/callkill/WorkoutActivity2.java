package com.example.callkill;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutActivity2 extends AppCompatActivity {
    private Button play2;
    private Button pause2;

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout2);
        play2 = findViewById(R.id.play2);
        pause2 = findViewById(R.id.pause2);
        // seekBar = findViewById(R.id.seekBar);
        // MediaPlayer using local source
        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.start();
        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}