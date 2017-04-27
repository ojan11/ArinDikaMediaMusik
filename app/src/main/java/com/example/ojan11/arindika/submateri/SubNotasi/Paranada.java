package com.example.ojan11.arindika.submateri.SubNotasi;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Paranada extends AppCompatActivity {
    MediaPlayer mp;
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paranada);
        TextView tm = (TextView)findViewById(R.id.tmain);
        TextView t = (TextView)findViewById(R.id.p1);
        TextView t2 = (TextView)findViewById(R.id.p2);
        TextView t3 = (TextView)findViewById(R.id.p3);
        TextView t4 = (TextView)findViewById(R.id.p4);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        t3.setTypeface(font);
        t4.setTypeface(font);
        tm.setTypeface(font);
        mp = MediaPlayer.create(this, R.raw.paranada);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (temp==1){
            mp.start();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mp.isPlaying()){
            mp.stop();
        }
    }
}
