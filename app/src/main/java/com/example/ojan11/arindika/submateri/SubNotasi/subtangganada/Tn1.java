package com.example.ojan11.arindika.submateri.SubNotasi.subtangganada;

/**
 * Created by ojan11 on 3/30/2017.
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Tn1 extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tangga_nada, container, false);
        TextView t = (TextView)rootView.findViewById(R.id.ptn1);
        TextView t2 = (TextView)rootView.findViewById(R.id.ptn2);
        TextView t3 = (TextView)rootView.findViewById(R.id.ptn3);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        t3.setTypeface(font);
        return rootView;
    }
}
