package com.example.ojan11.arindika.submateri.subtandadinamik;

/**
 * Created by ojan11 on 3/30/2017.
 */

import android.app.Activity;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Td2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tanda_dinamik2, container, false);

        TextView t = (TextView)rootView.findViewById(R.id.at1);
        TextView t2 = (TextView)rootView.findViewById(R.id.at2);
        TextView t3 = (TextView)rootView.findViewById(R.id.at3);
        TextView t4 = (TextView)rootView.findViewById(R.id.at4);
        TextView t5 = (TextView)rootView.findViewById(R.id.at5);
        TextView t6 = (TextView)rootView.findViewById(R.id.sat1);
        TextView t7 = (TextView)rootView.findViewById(R.id.sat2);
        TextView t8 = (TextView)rootView.findViewById(R.id.sat3);
        TextView t9 = (TextView)rootView.findViewById(R.id.sat4);
        TextView t10 = (TextView)rootView.findViewById(R.id.sat5);
        TextView t11 = (TextView)rootView.findViewById(R.id.at);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        Typeface font2 = Typeface.createFromAsset(getContext().getAssets(),"font/BRLNSDB.TTF");
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
        return rootView;
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("tes","start td 2");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("tes","stop td 2");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("tes","resume td 2");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("tes","attach td 2");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("tes"," deattach td 2");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("tes"," pause td 2");

    }
}
