package com.example.ojan11.arindika.submateri.SubNotasi.subtangganada;

/**
 * Created by ojan11 on 3/30/2017.
 */

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ojan11.arindika.R;
import com.example.ojan11.arindika.submateri.SubNotasi.LetakNada;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn3.MinorAsli;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn3.MinorHarmonis;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn3.MinorMelodis;

public class Tn3 extends Fragment implements View.OnClickListener{
    RelativeLayout rl,rl2,rl3;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tangga_nada3, container, false);
        TextView t = (TextView)rootView.findViewById(R.id.tvtn);
        TextView t2 = (TextView)rootView.findViewById(R.id.ttn1);
        TextView t3 = (TextView)rootView.findViewById(R.id.ttn2);
        TextView t4 = (TextView)rootView.findViewById(R.id.ttn3);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        t3.setTypeface(font);
        t4.setTypeface(font);
        rl = (RelativeLayout)rootView.findViewById(R.id.tn1);
        rl2 = (RelativeLayout)rootView.findViewById(R.id.tn2);
        rl3 = (RelativeLayout)rootView.findViewById(R.id.tn3);
        rl.setOnClickListener(this);
        rl2.setOnClickListener(this);
        rl3.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id==R.id.tn1){
            Intent intent = new Intent(getContext(), MinorAsli.class);
            startActivity(intent);
        }else if (id==R.id.tn2){
            Intent intent = new Intent(getContext(), MinorHarmonis.class);
            startActivity(intent);
        }else if (id==R.id.tn3){
            Intent intent = new Intent(getContext(), MinorMelodis.class);
            startActivity(intent);
        }
    }
}
