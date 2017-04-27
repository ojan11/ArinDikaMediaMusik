package com.example.ojan11.arindika.submateri.SubNotasi.subnamanada;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Nn2 extends Fragment implements View.OnClickListener{
    ImageView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y;
    TextView aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt,uu,vv,ww,xx,yy;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_nama_nada2, container, false);
        aa = (TextView)rootView.findViewById(R.id.bc1);
        bb = (TextView)rootView.findViewById(R.id.bc2);
        cc = (TextView)rootView.findViewById(R.id.bc3);
        dd = (TextView)rootView.findViewById(R.id.bc4);
        ee = (TextView)rootView.findViewById(R.id.bc5);
        ff = (TextView)rootView.findViewById(R.id.bc6);
        gg = (TextView)rootView.findViewById(R.id.bc7);
        hh = (TextView)rootView.findViewById(R.id.bc8);
        ii = (TextView)rootView.findViewById(R.id.bc9);
        jj = (TextView)rootView.findViewById(R.id.bc10);
        kk = (TextView)rootView.findViewById(R.id.bc11);
        ll = (TextView)rootView.findViewById(R.id.bc12);
        mm = (TextView)rootView.findViewById(R.id.bc13);
        nn = (TextView)rootView.findViewById(R.id.bc14);
        oo = (TextView)rootView.findViewById(R.id.bc15);
        pp = (TextView)rootView.findViewById(R.id.bc16);
        qq = (TextView)rootView.findViewById(R.id.bc17);
        rr = (TextView)rootView.findViewById(R.id.bc18);
        ss = (TextView)rootView.findViewById(R.id.bc19);
        tt = (TextView)rootView.findViewById(R.id.bc20);
        uu = (TextView)rootView.findViewById(R.id.bc21);
        vv = (TextView)rootView.findViewById(R.id.bc22);
        ww = (TextView)rootView.findViewById(R.id.bc23);
        xx = (TextView)rootView.findViewById(R.id.bc24);
        yy = (TextView)rootView.findViewById(R.id.bc25);
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),"font/BASKVILL.TTF");
        aa.setTypeface(font);
        bb.setTypeface(font);
        cc.setTypeface(font);
        dd.setTypeface(font);
        ee.setTypeface(font);
        ff.setTypeface(font);
        gg.setTypeface(font);
        hh.setTypeface(font);
        ii.setTypeface(font);
        jj.setTypeface(font);
        kk.setTypeface(font);
        ll.setTypeface(font);
        mm.setTypeface(font);
        nn.setTypeface(font);
        oo.setTypeface(font);
        pp.setTypeface(font);
        qq.setTypeface(font);
        rr.setTypeface(font);
        ss.setTypeface(font);
        tt.setTypeface(font);
        uu.setTypeface(font);
        vv.setTypeface(font);
        ww.setTypeface(font);
        xx.setTypeface(font);
        yy.setTypeface(font);
        a= (ImageView)rootView.findViewById(R.id.play_b1);
        b= (ImageView)rootView.findViewById(R.id.play_b2);
        c= (ImageView)rootView.findViewById(R.id.play_b3);
        d= (ImageView)rootView.findViewById(R.id.play_b4);
        e= (ImageView)rootView.findViewById(R.id.play_b5);
        f= (ImageView)rootView.findViewById(R.id.play_b6);
        g= (ImageView)rootView.findViewById(R.id.play_b7);
        h= (ImageView)rootView.findViewById(R.id.play_b8);
        i= (ImageView)rootView.findViewById(R.id.play_b9);
        j= (ImageView)rootView.findViewById(R.id.play_b10);
        k= (ImageView)rootView.findViewById(R.id.play_b11);
        l= (ImageView)rootView.findViewById(R.id.play_b12);
        m= (ImageView)rootView.findViewById(R.id.play_b13);
        n= (ImageView)rootView.findViewById(R.id.play_b14);
        o= (ImageView)rootView.findViewById(R.id.play_b15);
        p= (ImageView)rootView.findViewById(R.id.play_b16);
        q= (ImageView)rootView.findViewById(R.id.play_b17);
        r= (ImageView)rootView.findViewById(R.id.play_b18);
        s= (ImageView)rootView.findViewById(R.id.play_b19);
        t= (ImageView)rootView.findViewById(R.id.play_b20);
        u= (ImageView)rootView.findViewById(R.id.play_b21);
        v= (ImageView)rootView.findViewById(R.id.play_b22);
        w= (ImageView)rootView.findViewById(R.id.play_b23);
        x= (ImageView)rootView.findViewById(R.id.play_b24);
        y= (ImageView)rootView.findViewById(R.id.play_b25);
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
        return rootView;
    }

    @Override
    public void onClick(View v) {
        MediaPlayer am = MediaPlayer.create(getContext(), R.raw.c4);
        MediaPlayer bm = MediaPlayer.create(getContext(), R.raw.b3);
        MediaPlayer cm = MediaPlayer.create(getContext(), R.raw.ap3);
        MediaPlayer dm = MediaPlayer.create(getContext(), R.raw.a3);
        MediaPlayer em = MediaPlayer.create(getContext(), R.raw.gp3);
        MediaPlayer fm = MediaPlayer.create(getContext(), R.raw.g3);
        MediaPlayer gm = MediaPlayer.create(getContext(), R.raw.fp3);
        MediaPlayer hm = MediaPlayer.create(getContext(), R.raw.f3);
        MediaPlayer im = MediaPlayer.create(getContext(), R.raw.e3);
        MediaPlayer jm = MediaPlayer.create(getContext(), R.raw.dp3);
        MediaPlayer km = MediaPlayer.create(getContext(), R.raw.d3);
        MediaPlayer lm = MediaPlayer.create(getContext(), R.raw.cp3);
        MediaPlayer mm = MediaPlayer.create(getContext(), R.raw.c3);
        MediaPlayer nm = MediaPlayer.create(getContext(), R.raw.b2);
        MediaPlayer om = MediaPlayer.create(getContext(), R.raw.ap2);
        MediaPlayer pm = MediaPlayer.create(getContext(), R.raw.a2);
        MediaPlayer qm = MediaPlayer.create(getContext(), R.raw.gp2);
        MediaPlayer rm = MediaPlayer.create(getContext(), R.raw.g2);
        MediaPlayer sm = MediaPlayer.create(getContext(), R.raw.fp2);
        MediaPlayer tm = MediaPlayer.create(getContext(), R.raw.f2);
        MediaPlayer um = MediaPlayer.create(getContext(), R.raw.e2);
        MediaPlayer vm = MediaPlayer.create(getContext(), R.raw.dp3);
        MediaPlayer wm = MediaPlayer.create(getContext(), R.raw.d2);
        MediaPlayer xm = MediaPlayer.create(getContext(), R.raw.cp2);
        MediaPlayer ym = MediaPlayer.create(getContext(), R.raw.c2);
        int id = v.getId();
        Animation anim_button = AnimationUtils.loadAnimation(getContext(), R.anim.anim_shake);
        if (id == R.id.play_b1) {
            a.startAnimation(anim_button);
            am.start();
        } else if (id == R.id.play_b2) {
            b.startAnimation(anim_button);
            bm.start();
        } else if (id == R.id.play_b3) {
            c.startAnimation(anim_button);
            cm.start();
        } else if (id == R.id.play_b4) {
            d.startAnimation(anim_button);
            dm.start();
        } else if (id == R.id.play_b5) {
            e.startAnimation(anim_button);
            em.start();
        } else if (id == R.id.play_b6) {
            f.startAnimation(anim_button);
            fm.start();
        } else if (id == R.id.play_b7) {
            g.startAnimation(anim_button);
            gm.start();
        } else if (id == R.id.play_b8) {
            h.startAnimation(anim_button);
            hm.start();
        } else if (id == R.id.play_b9) {
            i.startAnimation(anim_button);
            im.start();
        } else if (id == R.id.play_b10) {
            j.startAnimation(anim_button);
            jm.start();
        } else if (id == R.id.play_b11) {
            k.startAnimation(anim_button);
            km.start();
        } else if (id == R.id.play_b12) {
            l.startAnimation(anim_button);
            lm.start();
        } else if (id == R.id.play_b13) {
            m.startAnimation(anim_button);
            mm.start();
        } else if (id == R.id.play_b14) {
            n.startAnimation(anim_button);
            nm.start();
        } else if (id == R.id.play_b15) {
            o.startAnimation(anim_button);
            om.start();
        } else if (id == R.id.play_b16) {
            p.startAnimation(anim_button);
            pm.start();
        } else if (id == R.id.play_b17) {
            q.startAnimation(anim_button);
            qm.start();
        } else if (id == R.id.play_b18) {
            r.startAnimation(anim_button);
            rm.start();
        } else if (id == R.id.play_b19) {
            s.startAnimation(anim_button);
            sm.start();
        } else if (id == R.id.play_b20) {
            t.startAnimation(anim_button);
            tm.start();
        } else if (id == R.id.play_b21) {
            u.startAnimation(anim_button);
            um.start();
        } else if (id == R.id.play_b22) {
            v.startAnimation(anim_button);
            vm.start();
        } else if (id == R.id.play_b23) {
            w.startAnimation(anim_button);
            wm.start();
        } else if (id == R.id.play_b24) {
            x.startAnimation(anim_button);
            xm.start();
        } else if (id == R.id.play_b25) {
            y.startAnimation(anim_button);
            ym.start();
        }

    }
}
