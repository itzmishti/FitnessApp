package com.example.callkill;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkoutActivity1 extends AppCompatActivity {

    private Button play1;
    private Button pause1;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout1);
        play1 = findViewById(R.id.play1);
        pause1 = findViewById(R.id.pause1);
        // seekBar = findViewById(R.id.seekBar);
        // MediaPlayer using local source
        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.start();
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
            }
        });
    }
}