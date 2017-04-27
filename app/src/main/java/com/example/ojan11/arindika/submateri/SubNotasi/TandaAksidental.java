package com.example.ojan11.arindika.submateri.SubNotasi;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class TandaAksidental extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanda_aksidental);
        TextView t = (TextView)findViewById(R.id.at1);
        TextView t2 = (TextView)findViewById(R.id.at2);
        TextView t3 = (TextView)findViewById(R.id.at3);
        TextView t4 = (TextView)findViewById(R.id.at4);
        TextView t5 = (TextView)findViewById(R.id.at5);
        TextView t6 = (TextView)findViewById(R.id.sat1);
        TextView t7 = (TextView)findViewById(R.id.sat2);
        TextView t8 = (TextView)findViewById(R.id.sat3);
        TextView t9 = (TextView)findViewById(R.id.sat4);
        TextView t10 = (TextView)findViewById(R.id.sat5);
        TextView t11 = (TextView)findViewById(R.id.tmain);
        TextView t12 = (TextView)findViewById(R.id.ta);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"font/BRLNSDB.TTF");
        t.setTypeface(font2);
        t2.setTypeface(font2);
        t3.setTypeface(font2);
        t4.setTypeface(font2);
        t5.setTypeface(font2);
        t6.setTypeface(font);
        t7.setTypeface(font);
        t8.setTypeface(font);
        t9.setTypeface(font);
        t10.setTypeface(font);
        t11.setTypeface(font);
        t12.setTypeface(font);
    }
}
