package com.example.ojan11.arindika.submateri.SubNotasi;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class LetakNada extends AppCompatActivity {
    MediaPlayer mp;
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letak_nada);
        TextView t = (TextView)findViewById(R.id.ppitch);
        TextView t2 = (TextView)findViewById(R.id.ppitch2);
        TextView tm = (TextView)findViewById(R.id.tmain);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        tm.setTypeface(font);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");
        mp = MediaPlayer.create(this, R.raw.pengertianpitch);//masih belum
    }


    @Override
    protected void onStart() {
        super.onStart();
        if(temp==1){
            mp = MediaPlayer.create(this, R.raw.pengertianpitch);
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
