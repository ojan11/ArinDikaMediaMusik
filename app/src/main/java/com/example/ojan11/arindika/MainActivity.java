package com.example.ojan11.arindika;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.example.ojan11.arindika.submateri.Artikulasi;
import com.example.ojan11.arindika.submateri.Dinamika;
import com.example.ojan11.arindika.submateri.Notasi;
import com.example.ojan11.arindika.submateri.SubNotasi.subtangganada.subtn3.MinorHarmonis;
import com.example.ojan11.arindika.submateri.Tempo;


public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener{
    Button a, b, c, d,e;
    Button backsound,guide;
    MediaPlayer mp, guidemp;
    int tempguide ;

    public MainActivity(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView)findViewById(R.id.tmain);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        t.setTypeface(font);
//            if (Build.VERSION.SDK_INT <= 17){
//                setContentView(R.layout.activity_materi2);
//            }else {
//                setContentView(R.layout.activity_materi);
//            }

        tempguide =1;

        a = (Button)findViewById(R.id.materi_a);
        b = (Button)findViewById(R.id.materi_b);
        c = (Button)findViewById(R.id.materi_c);
        d = (Button)findViewById(R.id.materi_d);
        e = (Button)findViewById(R.id.materi_e);

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);

        backsound = (Button)findViewById(R.id.backsound);
        guide = (Button)findViewById(R.id.guide);
        backsound.setOnClickListener(this);
        guide.setOnClickListener(this);
        mp = MediaPlayer.create(this, R.raw.soundback);
        guidemp = MediaPlayer.create(this,R.raw.awal);
        mp.start();
        mp.setLooping(true);
        mp.setVolume(0.2f,0.2f);
        }

    @Override
    protected void onStart() {
        super.onStart();
        //sound
        if (getTempGuide()==1){
            guidemp = MediaPlayer.create(this,R.raw.awal);
            guidemp.start();
        }
    }

    @Override
    protected void onDestroy() {
        mp.stop();
        guidemp.stop();

        super.onDestroy();
        Log.d("ini aplikasi", "ondestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        guidemp.stop();
        Log.d("ini aplikasi", "onstop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ini aplikasi", "onrestar");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ini aplikasi", "onresume");
    }

    @Override
        public void onClick(View v) {
            Animation anim_button= AnimationUtils.loadAnimation(this,R.anim.anim_scale);
            int id = v.getId();
            if (id == R.id.materi_a){
                a.startAnimation(anim_button);
                Intent intent = new Intent(this, Notasi.class);
                Bundle extras = new Bundle();
                extras.putInt("TEMP",getTempGuide());
                intent.putExtras(extras);
                startActivity(intent);
            }else if (id == R.id.materi_b){
                b.startAnimation(anim_button);
                Intent intent = new Intent(this, MinorHarmonis.class);
//                Bundle extras = new Bundle();
//                extras.putInt("TEMP",getTempGuide());
//                intent.putExtras(extras);
                startActivity(intent);
            }else if(id == R.id.materi_c){
                c.startAnimation(anim_button);
                Intent intent = new Intent(this, Dinamika.class);
                Bundle extras = new Bundle();
                extras.putInt("TEMP",getTempGuide());
                intent.putExtras(extras);
                startActivity(intent);
            }else if(id == R.id.materi_d){
                d.startAnimation(anim_button);
                Intent intent = new Intent(this, Tempo.class);
                Bundle extras = new Bundle();
                extras.putInt("TEMP",getTempGuide());
                intent.putExtras(extras);
                startActivity(intent);
            }else if(id == R.id.materi_e){
                e.startAnimation(anim_button);
                Intent intent = new Intent(this, Artikulasi.class);
                Bundle extras = new Bundle();
                extras.putInt("TEMP",getTempGuide());
                intent.putExtras(extras);
                startActivity(intent);
            }else if (id== R.id.backsound){
                if(mp.isPlaying()){
                    backsound.setBackgroundResource(R.drawable.icbacksoundmute);
                    mp.pause();
                }else {
                    backsound.setBackgroundResource(R.drawable.icbacksound);
                    mp.start();
                }
            }else if (id== R.id.guide){
                if(guidemp.isPlaying()){
                    guide.setBackgroundResource(R.drawable.icguidemute);
                    guidemp.pause();
                    tempguide=0;
                }else {
                    guide.setBackgroundResource(R.drawable.icguide);
                    guidemp = MediaPlayer.create(this,R.raw.awal);
                    guidemp.start();
                    tempguide=1;
                }
            }

        }
    public int getTempGuide(){
        return tempguide;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            CustomDialog cdd = new CustomDialog(MainActivity.this);
            cdd.show();
            Log.d("aplikasi", "Back button pressed!");
        }
        else if(keyCode == KeyEvent.KEYCODE_HOME)
        {
            mp.pause();
            Log.d("aplikasi", "Home button pressed!");
        }else if(keyCode == KeyEvent.KEYCODE_MENU)
        {
            mp.pause();
            Log.d("aplikasi", "Menu button pressed");
        }
        return super.onKeyDown(keyCode, event);
    }
}