package com.example.ojan11.arindika.submateri;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ojan11.arindika.R;
import com.example.ojan11.arindika.submateri.subchord.ChordA;
import com.example.ojan11.arindika.submateri.subchord.ChordB;
import com.example.ojan11.arindika.submateri.subchord.ChordC;
import com.example.ojan11.arindika.submateri.subchord.ChordD;
import com.example.ojan11.arindika.submateri.subchord.ChordE;
import com.example.ojan11.arindika.submateri.subchord.ChordF;
import com.example.ojan11.arindika.submateri.subchord.ChordG;

public class Chord extends AppCompatActivity implements View.OnClickListener{
    LinearLayout a,b,c,d,e,f,g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chord);
        TextView tm = (TextView)findViewById(R.id.tmain);
        TextView t = (TextView)findViewById(R.id.cr1);
        TextView t2 = (TextView)findViewById(R.id.cr2);
        TextView t3 = (TextView)findViewById(R.id.cr3);
        TextView t4 = (TextView)findViewById(R.id.cr4);
        TextView t5 = (TextView)findViewById(R.id.cr5);
        TextView t6 = (TextView)findViewById(R.id.cr6);
        TextView t7 = (TextView)findViewById(R.id.cr7);
        TextView t8 = (TextView)findViewById(R.id.cr0);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        t3.setTypeface(font);
        t4.setTypeface(font);
        t5.setTypeface(font);
        t6.setTypeface(font);
        t7.setTypeface(font);
        t8.setTypeface(font);
        tm.setTypeface(font);
        a= (LinearLayout)findViewById(R.id.lcr1);
        b= (LinearLayout)findViewById(R.id.lcr2);
        c= (LinearLayout)findViewById(R.id.lcr3);
        d= (LinearLayout)findViewById(R.id.lcr4);
        e= (LinearLayout)findViewById(R.id.lcr5);
        f= (LinearLayout)findViewById(R.id.lcr6);
        g= (LinearLayout)findViewById(R.id.lcr7);
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id= view.getId();
        if (id == R.id.lcr1){
            Intent intent = new Intent(this, ChordC.class);
            startActivity(intent);
        }else if (id == R.id.lcr2){
            Intent intent = new Intent(this, ChordD.class);
            startActivity(intent);
        }else if (id == R.id.lcr3){
            Intent intent = new Intent(this, ChordE.class);
            startActivity(intent);
        }else if (id == R.id.lcr4){
            Intent intent = new Intent(this, ChordF.class);
            startActivity(intent);
        }else if (id == R.id.lcr5){
            Intent intent = new Intent(this, ChordG.class);
            startActivity(intent);
        }else if (id == R.id.lcr6){
            Intent intent = new Intent(this, ChordA.class);
            startActivity(intent);
        }else if (id == R.id.lcr7){
            Intent intent = new Intent(this, ChordB.class);
            startActivity(intent);
        }
    }
}
