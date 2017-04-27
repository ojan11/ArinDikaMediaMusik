package com.example.ojan11.arindika.submateri.SubNotasi;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.widget.TextView;

import com.example.ojan11.arindika.R;
import com.example.ojan11.arindika.submateri.SubNotasi.subnamanada.Nn1;
import com.example.ojan11.arindika.submateri.SubNotasi.subnamanada.Nn2;

public class NamaNada extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    MediaPlayer mp;
    int temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nama_nada);
        setTitle(null);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.tt);
        Typeface font = Typeface.createFromAsset(getAssets(),"font/BASKVILL.TTF");
        mTitle.setTypeface(font);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_custom, null);
        tabOne.setText("Pada Treble Cleff");
        tabOne.setTypeface(font);
        tabLayout.getTabAt(0).setCustomView(tabOne);
        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_custom, null);
        tabTwo.setText("Pada Bass Cleff");
        tabTwo.setTypeface(font);
        tabLayout.getTabAt(1).setCustomView(tabTwo);

        mp = MediaPlayer.create(this, R.raw.namanada);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");

    }

    @Override
    protected void onStart() {
        super.onStart();
        if(temp==1){
            mp = MediaPlayer.create(this, R.raw.namanada);
            mp.start();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mp.isPlaying()){
            mp.stop();

        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0 : Nn1 tab1 = new Nn1();
                    return tab1;
                case 1 : Nn2 tab2 = new Nn2();
                    return  tab2;
                default: return null;
            }
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }

    }
}
