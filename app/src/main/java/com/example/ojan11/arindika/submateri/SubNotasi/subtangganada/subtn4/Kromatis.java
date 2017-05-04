package com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn4;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ojan11.arindika.R;

public class Kromatis extends AppCompatActivity {
    ImageView a,b,c,d,e,f,g,h;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kromatis);
        t1= (TextView)findViewById(R.id.tv) ;
        t2= (TextView)findViewById(R.id.tv1) ;
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t1.setTypeface(font);
        t2.setTypeface(font);
        a= (ImageView)findViewById(R.id.kr);
        Glide.with(this).load(R.drawable.kkr).into(a);
    }
}
