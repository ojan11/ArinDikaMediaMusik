package com.example.ojan11.arindika.submateri;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.ojan11.arindika.R;

public class Tempo extends AppCompatActivity implements View.OnClickListener{
    TextView a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    Button aa,bb,cc,dd,ee,ff,gg,hh,ii,jj,kk,ll;
    MediaPlayer mp,mp2;
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempo);
        TextView tm = (TextView)findViewById(R.id.tmain);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        Typeface font2 = Typeface.createFromAsset(getAssets(),"font/BRLNSDB.TTF");
        tm.setTypeface(font);
        a = (TextView)findViewById(R.id.tv_tt1);
        b = (TextView)findViewById(R.id.tv_tt2);
        c = (TextView)findViewById(R.id.tv_tt3);
        d = (TextView)findViewById(R.id.tv_tt4);
        e = (TextView)findViewById(R.id.tv_tt5);
        f = (TextView)findViewById(R.id.tv_tt6);
        g = (TextView)findViewById(R.id.tv_tt7);
        h = (TextView)findViewById(R.id.tv_tt8);
        i = (TextView)findViewById(R.id.tv_tt9);
        j = (TextView)findViewById(R.id.tv_tt10);
        k = (TextView)findViewById(R.id.tv_tt11);
        l = (TextView)findViewById(R.id.tv_tt12);
        m = (TextView)findViewById(R.id.t);
        n = (TextView)findViewById(R.id.tmain);

        o = (TextView)findViewById(R.id.tv_ttv1);
        p = (TextView)findViewById(R.id.tv_ttv2);
        q = (TextView)findViewById(R.id.tv_ttv3);
        r = (TextView)findViewById(R.id.tv_ttv4);
        s = (TextView)findViewById(R.id.tv_ttv5);
        t = (TextView)findViewById(R.id.tv_ttv6);
        u = (TextView)findViewById(R.id.tv_ttv7);
        v = (TextView)findViewById(R.id.tv_ttv8);
        w = (TextView)findViewById(R.id.tv_ttv9);
        x = (TextView)findViewById(R.id.tv_ttv10);
        y = (TextView)findViewById(R.id.tv_ttv11);
        z = (TextView)findViewById(R.id.tv_ttv12);
        a.setTypeface(font);
        b.setTypeface(font);
        c.setTypeface(font);
        d.setTypeface(font);
        e.setTypeface(font);
        f.setTypeface(font);
        g.setTypeface(font);
        h.setTypeface(font);
        i.setTypeface(font);
        j.setTypeface(font);
        k.setTypeface(font);
        l.setTypeface(font);
        m.setTypeface(font);
        n.setTypeface(font);
        o.setTypeface(font2);
        p.setTypeface(font2);
        q.setTypeface(font2);
        r.setTypeface(font2);
        s.setTypeface(font2);
        t.setTypeface(font2);
        u.setTypeface(font2);
        v.setTypeface(font2);
        w.setTypeface(font2);
        x.setTypeface(font2);
        y.setTypeface(font2);
        z.setTypeface(font2);
        aa = (Button)findViewById(R.id.btn_tt1);
        bb = (Button)findViewById(R.id.btn_tt2);
        cc = (Button)findViewById(R.id.btn_tt3);
        dd = (Button)findViewById(R.id.btn_tt4);
        ee = (Button)findViewById(R.id.btn_tt5);
        ff = (Button)findViewById(R.id.btn_tt6);
        gg = (Button)findViewById(R.id.btn_tt7);
        hh = (Button)findViewById(R.id.btn_tt8);
        ii = (Button)findViewById(R.id.btn_tt9);
        jj = (Button)findViewById(R.id.btn_tt10);
        kk = (Button)findViewById(R.id.btn_tt11);
        ll = (Button)findViewById(R.id.btn_tt12);
        aa.setOnClickListener(this);
        bb.setOnClickListener(this);
        cc.setOnClickListener(this);
        dd.setOnClickListener(this);
        ee.setOnClickListener(this);
        ff.setOnClickListener(this);
        gg.setOnClickListener(this);
        hh.setOnClickListener(this);
        ii.setOnClickListener(this);
        jj.setOnClickListener(this);
        kk.setOnClickListener(this);
        ll.setOnClickListener(this);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");
        mp2= MediaPlayer.create(this,R.raw.tempo);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Animation anim_button= AnimationUtils.loadAnimation(this,R.anim.anim_shake);
        switch (id){
            case R.id.btn_tt1 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.largo);
                mp.start();aa.startAnimation(anim_button);break;
            case R.id.btn_tt2 :
                stopPlaying();
                mp = MediaPlayer.create(this,R.raw.adagio);
                mp.start();bb.startAnimation(anim_button);break;
            case R.id.btn_tt3 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.lento);
                mp.start();cc.startAnimation(anim_button);break;

            case R.id.btn_tt4 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.larghetto);
                mp.start();dd.startAnimation(anim_button);break;

            case R.id.btn_tt5 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.andante);
                mp.start();ee.startAnimation(anim_button);break;

            case R.id.btn_tt6 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.andantino);
                mp.start();ff.startAnimation(anim_button);break;

            case R.id.btn_tt7 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.moderato);
                mp.start();gg.startAnimation(anim_button);break;

            case R.id.btn_tt8 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.allegreto);//
                mp.start();hh.startAnimation(anim_button);break;

            case R.id.btn_tt9 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.allegro);
                mp.start();ii.startAnimation(anim_button);break;

            case R.id.btn_tt10 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.vivace);//vivace
                mp.start();jj.startAnimation(anim_button);break;

            case R.id.btn_tt11 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.presto);
                mp.start();kk.startAnimation(anim_button);break;

            case R.id.btn_tt12 :
                stopPlaying();
                mp= MediaPlayer.create(this,R.raw.prestissimo);//prestissimo
                mp.start();ll.startAnimation(anim_button);break;

        }
    }

    @Override
    protected void onDestroy() {
        stopPlaying();
        super.onDestroy();
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }if(mp2.isPlaying()){
            mp2.stop();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if(temp==1){
            mp2= MediaPlayer.create(this,R.raw.tempo);
            mp2.start();

        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlaying();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopPlaying();
        finish();
    }
}
