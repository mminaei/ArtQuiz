package com.example.android.artquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Play music button
        final MediaPlayer playBeethoven = MediaPlayer.create(this, R.raw.beethoven);
        final Button playMusic = (Button) this.findViewById(R.id.button_music);
        playMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBeethoven.start();
            }
        });

// Play video button
        final Button playVideo = (Button) this.findViewById(R.id.button_video);
        playVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=F5zCGgZMaWQ")));
            }
        });

        Glide.with(this)
                .load(R.drawable.icecream)
                .into((ImageView)(findViewById(R.id.cooking)));
    }
}
