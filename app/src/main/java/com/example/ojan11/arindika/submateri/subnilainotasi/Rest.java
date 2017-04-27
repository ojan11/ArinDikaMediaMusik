package com.example.ojan11.arindika.submateri.subnilainotasi;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Rest extends AppCompatActivity {
    int temp;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
        TextView tm = (TextView)findViewById(R.id.tmain);
        TextView t = (TextView)findViewById(R.id.tvrn1);
        TextView t2 = (TextView)findViewById(R.id.tvrn2);
        TextView t3 = (TextView)findViewById(R.id.tvrn3);
        TextView t4 = (TextView)findViewById(R.id.tvrn4);
        TextView t5 = (TextView)findViewById(R.id.tvrn5);
        TextView t6 = (TextView)findViewById(R.id.tvrn6);
        TextView t7 = (TextView)findViewById(R.id.tvrn7);
        TextView t8 = (TextView)findViewById(R.id.tvrn8);
        TextView t9 = (TextView)findViewById(R.id.tvrn9);
        TextView t10 = (TextView)findViewById(R.id.tvrn10);
        TextView t11 = (TextView)findViewById(R.id.tvrn11);
        TextView t12 = (TextView)findViewById(R.id.tvrn12);
        TextView t13 = (TextView)findViewById(R.id.tvrn13);
        TextView t14 = (TextView)findViewById(R.id.tvrn14);
        TextView t15 = (TextView)findViewById(R.id.tvrn0);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        t3.setTypeface(font);
        t4.setTypeface(font);
        t5.setTypeface(font);
        t6.setTypeface(font);
        t7.setTypeface(font);
        t8.setTypeface(font);
        t9.setTypeface(font);
        t10.setTypeface(font);
        t11.setTypeface(font);
        t12.setTypeface(font);
        t13.setTypeface(font);
        t14.setTypeface(font);
        t15.setTypeface(font);
        tm.setTypeface(font);


        mp = MediaPlayer.create(this, R.raw.paranada);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");


    }
    private void stopPlaying() {
        if(mp.isPlaying()){
            mp.stop();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlaying();
    }
}
