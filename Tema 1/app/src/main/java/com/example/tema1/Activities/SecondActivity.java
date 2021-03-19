package com.example.tema1.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tema1.Fragments.Frag1Act2;
import com.example.tema1.Fragments.Frag2Act2;
import com.example.tema1.Fragments.Frag3Act2;
import com.example.tema1.R;
import com.example.tema1.StatePagerAdapter;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    private StatePagerAdapter statePagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        statePagerAdapter = new StatePagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.fragment_container);

        setupViewPager(viewPager);
    }

    @Override
    public void onBackPressed()
    {
        finishAffinity();
    }

    private void setupViewPager(ViewPager viewpager){
        StatePagerAdapter adapter = new StatePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Frag1Act2(), "F1A2");
        adapter.addFragment(new Frag2Act2(), "F2A2");
        adapter.addFragment(new Frag3Act2(), "F3A2");

        viewpager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){
        viewPager.setCurrentItem(fragmentNumber);
    }
}