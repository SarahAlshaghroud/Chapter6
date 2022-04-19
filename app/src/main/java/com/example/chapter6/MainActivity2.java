package com.example.chapter6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {

    Button btMarimba, btMerengue;
    MediaPlayer mpMarimba, mpMerengue;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btMarimba=(Button) findViewById(R.id.button);
        btMerengue=(Button) findViewById(R.id.button2);

        mpMarimba=new MediaPlayer();
        mpMarimba=MediaPlayer.create(this, R.raw.track1);
        btMarimba.setOnClickListener(bMarimba);

        mpMerengue=new MediaPlayer();
        mpMerengue=MediaPlayer.create(this, R.raw.track2);
        btMerengue.setOnClickListener(bMerengue);

        playing=0;

    }

    Button.OnClickListener bMarimba=new Button.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch(playing) {
                case 0:
                    mpMarimba.start();
                    playing = 1;
                    btMarimba.setText("Pause Marimba song");
                    break;
                case 1:
                    mpMarimba.pause();
                    playing = 0;
                    btMarimba.setText("Play Marimba song");
                    break;
            }

        }
    };

    Button.OnClickListener bMerengue=new Button.OnClickListener(){

        @Override
        public void onClick(View view) {

            switch(playing) {
                case 0:
                    mpMarimba.start();
                    playing = 1;
                    btMerengue.setText("Pause Merengue song");
                    break;
                case 1:
                    mpMarimba.pause();
                    playing = 0;
                    btMerengue.setText("Play Merengue song");
                    break;
            }

        }
    };
    }
