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

public class RitmeNot extends AppCompatActivity implements View.OnClickListener{
    int temp;
    MediaPlayer mp, mp2;
    Button a,b,c,d,e,f,g,h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ritme_not);
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
        tm.setTypeface(font);

        a = (Button)findViewById(R.id.rn1);
        b = (Button)findViewById(R.id.rn2);
        c = (Button)findViewById(R.id.rn3);
        d = (Button)findViewById(R.id.rn4);
        e = (Button)findViewById(R.id.rn5);
        f = (Button)findViewById(R.id.rn6);
        g = (Button)findViewById(R.id.rn7);
        h = (Button)findViewById(R.id.rn8);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);

        mp = MediaPlayer.create(this, R.raw.paranada);
        mp2 = MediaPlayer.create(this, R.raw.paranada);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Animation anim_button= AnimationUtils.loadAnimation(this,R.anim.anim_shake);
        switch (id){
            case R.id.rn1 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.rn1);
                mp.start();a.startAnimation(anim_button);break;
            case R.id.rn2 :
                stopPlaying();
                mp = MediaPlayer.create(this,R.raw.rn2);
                mp.start();b.startAnimation(anim_button);break;
            case R.id.rn3 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.rn3);
                mp.start();c.startAnimation(anim_button);break;

            case R.id.rn4 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.rn4);
                mp.start();d.startAnimation(anim_button);break;

            case R.id.rn5 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.rn5);
                mp.start();e.startAnimation(anim_button);break;

            case R.id.rn6 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.rn6);
                mp.start();f.startAnimation(anim_button);break;

            case R.id.rn7 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.rn7);
                mp.start();g.startAnimation(anim_button);break;

            case R.id.rn8 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.rn8);
                mp.start();h.startAnimation(anim_button);break;
        }
    }
    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }if(mp2.isPlaying()){
            mp2.stop();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlaying();
    }
}
