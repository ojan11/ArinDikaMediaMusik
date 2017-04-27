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

public class Nn1 extends Fragment implements View.OnClickListener{
    ImageView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y;
    TextView aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll,mm,nn,oo,pp,qq,rr,ss,tt,uu,vv,ww,xx,yy;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_nama_nada, container, false);
        aa = (TextView)rootView.findViewById(R.id.tc1);
        bb = (TextView)rootView.findViewById(R.id.tc2);
        cc = (TextView)rootView.findViewById(R.id.tc3);
        dd = (TextView)rootView.findViewById(R.id.tc4);
        ee = (TextView)rootView.findViewById(R.id.tc5);
        ff = (TextView)rootView.findViewById(R.id.tc6);
        gg = (TextView)rootView.findViewById(R.id.tc7);
        hh = (TextView)rootView.findViewById(R.id.tc8);
        ii = (TextView)rootView.findViewById(R.id.tc9);
        jj = (TextView)rootView.findViewById(R.id.tc10);
        kk = (TextView)rootView.findViewById(R.id.tc11);
        ll = (TextView)rootView.findViewById(R.id.tc12);
        mm = (TextView)rootView.findViewById(R.id.tc13);
        nn = (TextView)rootView.findViewById(R.id.tc14);
        oo = (TextView)rootView.findViewById(R.id.tc15);
        pp = (TextView)rootView.findViewById(R.id.tc16);
        qq = (TextView)rootView.findViewById(R.id.tc17);
        rr = (TextView)rootView.findViewById(R.id.tc18);
        ss = (TextView)rootView.findViewById(R.id.tc19);
        tt = (TextView)rootView.findViewById(R.id.tc20);
        uu = (TextView)rootView.findViewById(R.id.tc21);
        vv = (TextView)rootView.findViewById(R.id.tc22);
        ww = (TextView)rootView.findViewById(R.id.tc23);
        xx = (TextView)rootView.findViewById(R.id.tc24);
        yy = (TextView)rootView.findViewById(R.id.tc25);
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
        a= (ImageView)rootView.findViewById(R.id.play_t1);
        b= (ImageView)rootView.findViewById(R.id.play_t2);
        c= (ImageView)rootView.findViewById(R.id.play_t3);
        d= (ImageView)rootView.findViewById(R.id.play_t4);
        e= (ImageView)rootView.findViewById(R.id.play_t5);
        f= (ImageView)rootView.findViewById(R.id.play_t6);
        g= (ImageView)rootView.findViewById(R.id.play_t7);
        h= (ImageView)rootView.findViewById(R.id.play_t8);
        i= (ImageView)rootView.findViewById(R.id.play_t9);
        j= (ImageView)rootView.findViewById(R.id.play_t10);
        k= (ImageView)rootView.findViewById(R.id.play_t11);
        l= (ImageView)rootView.findViewById(R.id.play_t12);
        m= (ImageView)rootView.findViewById(R.id.play_t13);
        n= (ImageView)rootView.findViewById(R.id.play_t14);
        o= (ImageView)rootView.findViewById(R.id.play_t15);
        p= (ImageView)rootView.findViewById(R.id.play_t16);
        q= (ImageView)rootView.findViewById(R.id.play_t17);
        r= (ImageView)rootView.findViewById(R.id.play_t18);
        s= (ImageView)rootView.findViewById(R.id.play_t19);
        t= (ImageView)rootView.findViewById(R.id.play_t20);
        u= (ImageView)rootView.findViewById(R.id.play_t21);
        v= (ImageView)rootView.findViewById(R.id.play_t22);
        w= (ImageView)rootView.findViewById(R.id.play_t23);
        x= (ImageView)rootView.findViewById(R.id.play_t24);
        y= (ImageView)rootView.findViewById(R.id.play_t25);
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
        MediaPlayer am= MediaPlayer.create(getContext(),R.raw.c4);
        MediaPlayer bm= MediaPlayer.create(getContext(),R.raw.cp4);
        MediaPlayer cm= MediaPlayer.create(getContext(),R.raw.d4);
        MediaPlayer dm= MediaPlayer.create(getContext(),R.raw.dp4);
        MediaPlayer em= MediaPlayer.create(getContext(),R.raw.e4);
        MediaPlayer fm= MediaPlayer.create(getContext(),R.raw.f4);
        MediaPlayer gm= MediaPlayer.create(getContext(),R.raw.fp4);
        MediaPlayer hm= MediaPlayer.create(getContext(),R.raw.g4);
        MediaPlayer im= MediaPlayer.create(getContext(),R.raw.gp4);
        MediaPlayer jm= MediaPlayer.create(getContext(),R.raw.a4);
        MediaPlayer km= MediaPlayer.create(getContext(),R.raw.ap4);
        MediaPlayer lm= MediaPlayer.create(getContext(),R.raw.b4);
        MediaPlayer mm= MediaPlayer.create(getContext(),R.raw.c5);
        MediaPlayer nm= MediaPlayer.create(getContext(),R.raw.cp5);
        MediaPlayer om= MediaPlayer.create(getContext(),R.raw.d5);
        MediaPlayer pm= MediaPlayer.create(getContext(),R.raw.dp5);
        MediaPlayer qm= MediaPlayer.create(getContext(),R.raw.e5);
        MediaPlayer rm= MediaPlayer.create(getContext(),R.raw.f5);
        MediaPlayer sm= MediaPlayer.create(getContext(),R.raw.fp5);
        MediaPlayer tm= MediaPlayer.create(getContext(),R.raw.g5);
        MediaPlayer um= MediaPlayer.create(getContext(),R.raw.gp5);
        MediaPlayer vm= MediaPlayer.create(getContext(),R.raw.a5);
        MediaPlayer wm= MediaPlayer.create(getContext(),R.raw.ap5);
        MediaPlayer xm= MediaPlayer.create(getContext(),R.raw.b5);
        MediaPlayer ym= MediaPlayer.create(getContext(),R.raw.c6);
        int id =v.getId();
        Animation anim_button= AnimationUtils.loadAnimation(getContext(),R.anim.anim_shake);
        if (id==R.id.play_t1){
            a.startAnimation(anim_button);
            am.start();
        }else if (id==R.id.play_t2){
            b.startAnimation(anim_button);
            bm.start();
        }else if (id==R.id.play_t3){
            c.startAnimation(anim_button);
            cm.start();
        }else if (id==R.id.play_t4){
            d.startAnimation(anim_button);
            dm.start();
        }else if (id==R.id.play_t5){
            e.startAnimation(anim_button);
            em.start();
        }else if (id==R.id.play_t6){
            f.startAnimation(anim_button);
            fm.start();
        }else if (id==R.id.play_t7){
            g.startAnimation(anim_button);
            gm.start();
        }else if (id==R.id.play_t8){
            h.startAnimation(anim_button);
            hm.start();
        }else if (id==R.id.play_t9){
            i.startAnimation(anim_button);
            im.start();
        }else if (id==R.id.play_t10){
            j.startAnimation(anim_button);
            jm.start();
        }else if (id==R.id.play_t11){
            k.startAnimation(anim_button);
            km.start();
        }else if (id==R.id.play_t12){
            l.startAnimation(anim_button);
            lm.start();
        }else if (id==R.id.play_t13){
            m.startAnimation(anim_button);
            mm.start();
        }else if (id==R.id.play_t14){
            n.startAnimation(anim_button);
            nm.start();
        }else if (id==R.id.play_t15){
            o.startAnimation(anim_button);
            om.start();
        }else if (id==R.id.play_t16){
            p.startAnimation(anim_button);
            pm.start();
        }else if (id==R.id.play_t17){
            q.startAnimation(anim_button);
            qm.start();
        }else if (id==R.id.play_t18){
            r.startAnimation(anim_button);
            rm.start();
        }else if (id==R.id.play_t19){
            s.startAnimation(anim_button);
            sm.start();
        }else if (id==R.id.play_t20){
            t.startAnimation(anim_button);
            tm.start();
        }else if (id==R.id.play_t21){
            u.startAnimation(anim_button);
            um.start();
        }else if (id==R.id.play_t22){
            v.startAnimation(anim_button);
            vm.start();
        }else if (id==R.id.play_t23){
            w.startAnimation(anim_button);
            wm.start();
        }else if (id==R.id.play_t24){
            x.startAnimation(anim_button);
            xm.start();
        }else if (id==R.id.play_t25){
            y.startAnimation(anim_button);
            ym.start();
        }
    }
}
