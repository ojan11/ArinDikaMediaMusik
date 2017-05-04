package com.example.ojan11.arindika.submateri;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.ojan11.arindika.R;
import com.example.ojan11.arindika.submateri.SubNotasi.LetakNada;
import com.example.ojan11.arindika.submateri.SubNotasi.Paranada;
import com.example.ojan11.arindika.submateri.SubNotasi.TandaAksidental;
import com.example.ojan11.arindika.submateri.SubNotasi.TanggaNada;
import com.example.ojan11.arindika.submateri.subnilainotasi.NotBertitik;
import com.example.ojan11.arindika.submateri.subnilainotasi.Rest;
import com.example.ojan11.arindika.submateri.subnilainotasi.RitmeNot;
import com.example.ojan11.arindika.submateri.subnilainotasi.Triplet;

public class NilaiNotasi extends AppCompatActivity implements View.OnClickListener{
    Button a, b, c, d, e;
    MediaPlayer mp;
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilai_notasi);
        TextView t = (TextView)findViewById(R.id.tmain);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);

        a = (Button)findViewById(R.id.nn1);
        b = (Button)findViewById(R.id.nn2);
        c = (Button)findViewById(R.id.nn3);
        d = (Button)findViewById(R.id.nn4);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.pitch);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (mp.isPlaying()){
            mp.stop();
        }
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (temp==1){
            mp = MediaPlayer.create(this, R.raw.pitch);
            mp.start();
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mp.isPlaying()){
            mp.pause();
        }
    }

    @Override
    public void onClick(View v) {
        Animation anim_button= AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        int id = v.getId();
        if (id == R.id.nn1){
            a.startAnimation(anim_button);
            Intent intent = new Intent(this, RitmeNot.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }else if (id == R.id.nn2){
            b.startAnimation(anim_button);
            Intent intent = new Intent(this, Rest.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }else if(id == R.id.nn3){
            c.startAnimation(anim_button);
            Intent intent = new Intent(this, Triplet.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }else if(id == R.id.nn4){
            d.startAnimation(anim_button);
            Intent intent = new Intent(this, NotBertitik.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }
    }
}
