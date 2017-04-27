package com.example.ojan11.arindika.submateri;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.example.ojan11.arindika.MainActivity;
import com.example.ojan11.arindika.R;
import com.example.ojan11.arindika.submateri.subtandadinamik.Td1;
import com.example.ojan11.arindika.submateri.subtandadinamik.Td2;
import com.example.ojan11.arindika.submateri.subtandadinamik.Td3;

public class TandaDinamik extends AppCompatActivity {

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
    private MediaPlayer mp;
    int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanda_dinamik);
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
        tabOne.setText("Dinamika");
        tabOne.setTypeface(font);
        tabLayout.getTabAt(0).setCustomView(tabOne);
        TextView tabTwo = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_custom, null);
        tabTwo.setText("Artikulasi");
        tabTwo.setTypeface(font);
        tabLayout.getTabAt(1).setCustomView(tabTwo);
        TextView tabThree = (TextView) LayoutInflater.from(this).inflate(R.layout.tab_custom, null);
        tabThree.setText("Simbol");
        tabThree.setTypeface(font);
        tabLayout.getTabAt(2).setCustomView(tabThree);
        mp = MediaPlayer.create(this, R.raw.tandadinamik);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        temp = extras.getInt("TEMP");
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (temp==1){
            mp = MediaPlayer.create(this, R.raw.tandadinamik);
            mp.start();
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    } protected void onDestroy() {
        super.onDestroy();

        Log.d("ini aplikasi", "ondestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mp.isPlaying()){
            mp.stop();

        }
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


    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener{

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0 :
                    Td1 tab1 = new Td1();
//                    if (tab1.isMenuVisible()){
//                        mp.start();
//                    }else if (tab1.isHidden()){
//                        mp.stop();
//                    }
                    return tab1;
                case 1 : Td2 tab2 = new Td2();
//
//                    if (tab2.isMenuVisible()){
//                        mp2.start();
//                    }else if (tab2.isHidden()){
//                        mp2.stop();
//                    }
                    return  tab2;
                case 2 : Td3 tab3 = new Td3();
                    return  tab3;
                default: return null;
            }
        }


        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }


        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
//            if(position == 0){
//                if (mp2.isPlaying()){
//                    mp2.stop();
//                }
//                mp.start();
//            }else if(position == 1){
//                if(mp.isPlaying()){
//                    mp.stop();
//                }
//                mp2.start();
//            }else if(position == 2){
//            }

        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    }
}
