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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Td1 extends Fragment {
    MediaPlayer mp;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tanda_dinamik, container, false);

        TextView t = (TextView)rootView.findViewById(R.id.td1);
        TextView t2 = (TextView)rootView.findViewById(R.id.td2);
        TextView t3 = (TextView)rootView.findViewById(R.id.td3);
        TextView t4 = (TextView)rootView.findViewById(R.id.td4);
        TextView t5 = (TextView)rootView.findViewById(R.id.td5);
        TextView t6 = (TextView)rootView.findViewById(R.id.td6);
        TextView t7 = (TextView)rootView.findViewById(R.id.td7);
        TextView t8 = (TextView)rootView.findViewById(R.id.td8);
        TextView t9 = (TextView)rootView.findViewById(R.id.std1);
        TextView t10 = (TextView)rootView.findViewById(R.id.std2);
        TextView t11 = (TextView)rootView.findViewById(R.id.std3);
        TextView t12 = (TextView)rootView.findViewById(R.id.std4);
        TextView t13 = (TextView)rootView.findViewById(R.id.std5);
        TextView t14 = (TextView)rootView.findViewById(R.id.std6);
        TextView t15 = (TextView)rootView.findViewById(R.id.std7);
        TextView t16 = (TextView)rootView.findViewById(R.id.std8);
        TextView t17 = (TextView)rootView.findViewById(R.id.std9);
        TextView t18 = (TextView)rootView.findViewById(R.id.tdd1);
        TextView t19 = (TextView)rootView.findViewById(R.id.tdd2);
        TextView t20 = (TextView)rootView.findViewById(R.id.tdd3);
        TextView t21 = (TextView)rootView.findViewById(R.id.tdd4);
        TextView t22 = (TextView)rootView.findViewById(R.id.tdd5);
        TextView t23 = (TextView)rootView.findViewById(R.id.tdd6);
        TextView t24 = (TextView)rootView.findViewById(R.id.tdd7);
        TextView t25 = (TextView)rootView.findViewById(R.id.tdd8);
        TextView t26 = (TextView)rootView.findViewById(R.id.std10);
        TextView t27 = (TextView)rootView.findViewById(R.id.td9);
        TextView t28 = (TextView)rootView.findViewById(R.id.td10);
        TextView t29 = (TextView)rootView.findViewById(R.id.td11);
        TextView t30 = (TextView)rootView.findViewById(R.id.td12);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        Typeface font2 = Typeface.createFromAsset(getContext().getAssets(),"font/VIVALDII.TTF");
        Typeface font3 = Typeface.createFromAsset(getContext().getAssets(),"font/BRLNSDB.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        t3.setTypeface(font);
        t4.setTypeface(font);
        t5.setTypeface(font);
        t6.setTypeface(font);
        t7.setTypeface(font);
        t8.setTypeface(font);
        t9.setTypeface(font2);
        t10.setTypeface(font2);
        t11.setTypeface(font2);
        t12.setTypeface(font2);
        t13.setTypeface(font2);
        t14.setTypeface(font2);
        t15.setTypeface(font2);
        t16.setTypeface(font2);
        t17.setTypeface(font2);
        t18.setTypeface(font);
        t19.setTypeface(font);
        t20.setTypeface(font);
        t21.setTypeface(font);
        t22.setTypeface(font);
        t23.setTypeface(font);
        t24.setTypeface(font);
        t25.setTypeface(font);
        t26.setTypeface(font);
        t27.setTypeface(font3);
        t28.setTypeface(font);
        t29.setTypeface(font3);
        t30.setTypeface(font);
        return rootView;
    }
//
    @Override
    public void onStart() {
        super.onStart();
        Log.d("tes","start");
    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        mp.stop();
//        Log.d("tes","stop");
//
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        Log.d("tes","resume");
//    }
//
//    @Override
//    public void onAttach(Activity activity) {
//        super.onAttach(activity);
//        Log.d("tes","attach");
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        Log.d("tes"," deattach");
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        Log.d("tes"," pause");
//
//    }

}
