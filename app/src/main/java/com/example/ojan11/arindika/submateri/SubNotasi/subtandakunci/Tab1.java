package com.example.ojan11.arindika.submateri.SubNotasi.subtandakunci;

/**
 * Created by ojan11 on 3/30/2017.
 */

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Tab1 extends Fragment{

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tanda_kunci, container, false);
        TextView t = (TextView)rootView.findViewById(R.id.ptk);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        return rootView;
    }
}
