package com.example.ojan11.arindika.submateri.subchord;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class ChordG extends AppCompatActivity implements View.OnClickListener{
    ImageView a,b,c,d,e,f,g,h,i,j,k,l;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord_g);
        TextView tm = (TextView)findViewById(R.id.tmain);
        TextView t = (TextView)findViewById(R.id.cr1);
        TextView t2 = (TextView)findViewById(R.id.cr2);
        TextView t3 = (TextView)findViewById(R.id.cr3);
        TextView t4 = (TextView)findViewById(R.id.cr4);
        TextView t5 = (TextView)findViewById(R.id.cr5);
        TextView t6 = (TextView)findViewById(R.id.cr6);
        TextView t7 = (TextView)findViewById(R.id.cr7);
        TextView t8 = (TextView)findViewById(R.id.cr8);
        TextView t9 = (TextView)findViewById(R.id.cr9);
        TextView t10 = (TextView)findViewById(R.id.cr10);
        TextView t11 = (TextView)findViewById(R.id.cr11);
        TextView t12 = (TextView)findViewById(R.id.cr12);
        TextView t13 = (TextView)findViewById(R.id.cr13);
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
        tm.setTypeface(font);
        a= (ImageView)findViewById(R.id.ptr1);
        b= (ImageView)findViewById(R.id.ptr2);
        c= (ImageView)findViewById(R.id.ptr3);
        d= (ImageView)findViewById(R.id.ptr4);
        e= (ImageView)findViewById(R.id.ptr5);
        f= (ImageView)findViewById(R.id.ptr6);
        g= (ImageView)findViewById(R.id.ptr7);
        h= (ImageView)findViewById(R.id.ptr8);
        i= (ImageView)findViewById(R.id.ptr9);
        j= (ImageView)findViewById(R.id.ptr10);
        k= (ImageView)findViewById(R.id.ptr11);
        l= (ImageView)findViewById(R.id.ptr12);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id= view.getId();
        Animation anim_button= AnimationUtils.loadAnimation(this,R.anim.anim_shake);
        if (id == R.id.ptr1){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg1);
            mp.start();a.startAnimation(anim_button);
        }else if (id == R.id.ptr2){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg2);
            mp.start();b.startAnimation(anim_button);
        }else if (id == R.id.ptr3){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg3);
            mp.start();c.startAnimation(anim_button);
        }else if (id == R.id.ptr4){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg4);
            mp.start();d.startAnimation(anim_button);
        }else if (id == R.id.ptr5){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg5);
            mp.start();e.startAnimation(anim_button);
        }else if (id == R.id.ptr6){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg6);
            mp.start();f.startAnimation(anim_button);
        }else if (id == R.id.ptr7){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg7);
            mp.start();g.startAnimation(anim_button);
        }else if (id == R.id.ptr8){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg8);
            mp.start();h.startAnimation(anim_button);
        }else if (id == R.id.ptr9){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg9);
            mp.start();i.startAnimation(anim_button);
        }else if (id == R.id.ptr10){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg10);
            mp.start();j.startAnimation(anim_button);
        }else if (id == R.id.ptr11){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg11);
            mp.start();k.startAnimation(anim_button);
        }else if (id == R.id.ptr12){
            stopPlaying();
            mp= MediaPlayer.create(this,R.raw.chordg12);
            mp.start();l.startAnimation(anim_button);
        }
    }
    public void stopPlaying(){
        if (mp != null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    @Override
    protected void onStop() {
        super.onStop();
        stopPlaying();
    }
}
