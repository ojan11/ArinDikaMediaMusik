package com.example.ojan11.arindika.submateri.SubNotasi.subtangganada;

/**
 * Created by ojan11 on 3/30/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ojan11.arindika.R;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn3.MinorAsli;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn3.MinorHarmonis;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn3.MinorMelodis;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn4.Kromatis;

public class Tn4 extends Fragment implements View.OnClickListener{
    RelativeLayout rl;
    MediaPlayer mp;
    ImageView iv,iv2,iv3,iv4;
    TextView tv,tv2,tv3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tangga_nada4, container, false);

        tv = (TextView)rootView.findViewById(R.id.tv1);
        tv2 = (TextView)rootView.findViewById(R.id.tv2);
        tv3 = (TextView)rootView.findViewById(R.id.tv3);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        tv.setTypeface(font);
        tv2.setTypeface(font);
        tv3.setTypeface(font);
        rl = (RelativeLayout)rootView.findViewById(R.id.tn1);

        iv = (ImageView)rootView.findViewById(R.id.kkr1) ;
        iv2 = (ImageView)rootView.findViewById(R.id.kkr2) ;
        iv3 = (ImageView)rootView.findViewById(R.id.kkr3) ;
        iv4 = (ImageView)rootView.findViewById(R.id.kkr4) ;
        iv.setOnClickListener(this);
        iv2.setOnClickListener(this);
        iv3.setOnClickListener(this);
        iv4.setOnClickListener(this);
        rl.setOnClickListener(this);
        return rootView;
    }
    @Override
    public void onClick(View view) {
        int id = view.getId();
        Animation anim_button= AnimationUtils.loadAnimation(getContext(),R.anim.anim_shake);
        if (id==R.id.tn1){
            Intent intent = new Intent(getContext(), Kromatis.class);
            startActivity(intent);
        }else if (id==R.id.kkr1){
            iv.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.kkr1);
            mp.start();
        }else if (id==R.id.kkr2){
            iv2.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.kkr2);
            mp.start();
        }else if (id==R.id.kkr3){
            iv3.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.kkr1);
            mp.start();
        }else if (id==R.id.kkr4){
            iv4.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.kkr2);
            mp.start();
        }
    }

    @Override
    public void onStop() {
        StopPlaying();
        super.onStop();
    }

    public void StopPlaying(){
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
