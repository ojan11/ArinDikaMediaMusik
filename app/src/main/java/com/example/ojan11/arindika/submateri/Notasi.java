package com.example.ojan11.arindika.submateri;

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
import com.example.ojan11.arindika.submateri.SubNotasi.LetakNada;
import com.example.ojan11.arindika.submateri.SubNotasi.NamaNada;
import com.example.ojan11.arindika.submateri.SubNotasi.Paranada;
import com.example.ojan11.arindika.submateri.SubNotasi.TandaAksidental;
import com.example.ojan11.arindika.submateri.SubNotasi.TandaKunci;
import com.example.ojan11.arindika.submateri.SubNotasi.TanggaNada;

public class Notasi extends AppCompatActivity implements View.OnClickListener{
    Button a, b, c, d, e;
    MediaPlayer mp;
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notasi);
        TextView t = (TextView)findViewById(R.id.tmain);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);

        a = (Button)findViewById(R.id.pitch_a);
        b = (Button)findViewById(R.id.pitch_b);
        c = (Button)findViewById(R.id.pitch_c);
        d = (Button)findViewById(R.id.pitch_d);
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
        if (id == R.id.pitch_a){
            a.startAnimation(anim_button);
            Intent intent = new Intent(this, Paranada.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }else if (id == R.id.pitch_b){
            b.startAnimation(anim_button);
            Intent intent = new Intent(this, LetakNada.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }else if(id == R.id.pitch_c){
            c.startAnimation(anim_button);
            Intent intent = new Intent(this, TandaAksidental.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }else if(id == R.id.pitch_d){
            d.startAnimation(anim_button);
            Intent intent = new Intent(this, TanggaNada.class);
            Bundle extras = new Bundle();
            extras.putInt("TEMP",temp);
            intent.putExtras(extras);
            startActivity(intent);
        }
    }
}
