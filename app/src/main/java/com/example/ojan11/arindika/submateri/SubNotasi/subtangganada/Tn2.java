package com.example.ojan11.arindika.submateri.SubNotasi.subtangganada;

/**
 * Created by ojan11 on 3/30/2017.
 */

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Tn2 extends Fragment implements View.OnClickListener{
    ImageView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,u,v,w,x,y,z,aa,bb,cc,dd;
    Button t;
    MediaPlayer mp;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tangga_nada2, container, false);
        TextView t = (TextView)rootView.findViewById(R.id.tmy1);
        TextView t2 = (TextView)rootView.findViewById(R.id.tmy2);
        TextView t3 = (TextView)rootView.findViewById(R.id.tmy3);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
        t2.setTypeface(font);
        t3.setTypeface(font);
        a = (ImageView) rootView.findViewById(R.id.my1);
        b = (ImageView) rootView.findViewById(R.id.my2);
        c = (ImageView) rootView.findViewById(R.id.my3);
        d = (ImageView) rootView.findViewById(R.id.my4);
        e = (ImageView) rootView.findViewById(R.id.my5);
        f = (ImageView) rootView.findViewById(R.id.my6);
        g = (ImageView) rootView.findViewById(R.id.my7);
        h = (ImageView) rootView.findViewById(R.id.my8);
        i = (ImageView) rootView.findViewById(R.id.my9);
        j = (ImageView) rootView.findViewById(R.id.my10);
        k = (ImageView) rootView.findViewById(R.id.my11);
        l = (ImageView) rootView.findViewById(R.id.my12);
        m = (ImageView) rootView.findViewById(R.id.my13);
        n = (ImageView) rootView.findViewById(R.id.my14);
        o = (ImageView) rootView.findViewById(R.id.my15);
        p = (ImageView) rootView.findViewById(R.id.my16);
        q = (ImageView) rootView.findViewById(R.id.my17);
        r = (ImageView) rootView.findViewById(R.id.my18);
        s = (ImageView) rootView.findViewById(R.id.my19);
        t = (Button) rootView.findViewById(R.id.my20);
        u = (ImageView) rootView.findViewById(R.id.my21);
        v = (ImageView) rootView.findViewById(R.id.my22);
        w = (ImageView) rootView.findViewById(R.id.my23);
        x = (ImageView) rootView.findViewById(R.id.my24);
        y = (ImageView) rootView.findViewById(R.id.my25);
        z = (ImageView) rootView.findViewById(R.id.my26);
        aa = (ImageView) rootView.findViewById(R.id.my27);
        bb = (ImageView) rootView.findViewById(R.id.my28);
        cc = (ImageView) rootView.findViewById(R.id.my29);
        dd = (ImageView) rootView.findViewById(R.id.my30);
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
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);
        aa.setOnClickListener(this);
        bb.setOnClickListener(this);
        cc.setOnClickListener(this);
        dd.setOnClickListener(this);
        return rootView;

    }
    public void StopPlaying(){
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    public void onClick(View view) {
        int id =v.getId();
        Animation anim_button= AnimationUtils.loadAnimation(getContext(),R.anim.anim_shake);
        if (id==R.id.my1){
            a.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.t1);
            mp.start();
        }else if (id==R.id.my2){
            b.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.s1);
            mp.start();
        }else if (id==R.id.my3){
            c.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t2);
            mp.start();
        }else if (id==R.id.my4){
            d.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s2);
            mp.start();
        }else if (id==R.id.my5){
            e.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t3);
            mp.start();
        }else if (id==R.id.my6){
            f.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s3);
            mp.start();
        }else if (id==R.id.my7){
            g.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t4);
            mp.start();
        }else if (id==R.id.my8){
            h.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s4);
            mp.start();
        }else if (id==R.id.my9){
            i.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t5);
            mp.start();
        }else if (id==R.id.my10){
            j.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s5);
            mp.start();
        }else if (id==R.id.my11){
            k.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t6);
            mp.start();
        }else if (id==R.id.my12){
            l.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s6);
            mp.start();
        }else if (id==R.id.my13){
            m.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t7);
            mp.start();
        }else if (id==R.id.my14){
            n.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.s7);
            mp.start();
        }else if (id==R.id.my15){
            o.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t8);
            mp.start();
        }else if (id==R.id.my16){
            p.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s8);
            mp.start();
        }else if (id==R.id.my17){
            q.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.t9);
            mp.start();
        }else if (id==R.id.my18){
            r.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s9);
            mp.start();
        }else if (id==R.id.my19){
            s.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.t10);
            mp.start();
        }else if (id==R.id.my20){
            t.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s10);
            mp.start();
        }else if (id==R.id.my21){
            u.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t11);
            mp.start();
        }else if (id==R.id.my22){
            v.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s11);
            mp.start();
        }else if (id==R.id.my23){
            w.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t12);
            mp.start();
        }else if (id==R.id.my24){
            x.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s12);
            mp.start();
        }else if (id==R.id.my25){
            y.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t13);
            mp.start();
        }else if (id==R.id.my26){
            z.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s13);
            mp.start();
        }else if (id==R.id.my27){
            aa.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t14);
            mp.start();
        }else if (id==R.id.my28){
            bb.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.s14);
            mp.start();
        }else if (id==R.id.my29){
            cc.startAnimation(anim_button);
            StopPlaying();
            mp = MediaPlayer.create(getContext(),R.raw.t15);
            mp.start();
        }else if (id==R.id.my30){
            dd.startAnimation(anim_button);
            StopPlaying();
            mp= MediaPlayer.create(getContext(),R.raw.s15);
            mp.start();
        }
    }

    @Override
    public void onStop() {
        StopPlaying();
        super.onStop();
    }

    @Override
    public void onPause() {
        StopPlaying();
        super.onPause();
    }
}
