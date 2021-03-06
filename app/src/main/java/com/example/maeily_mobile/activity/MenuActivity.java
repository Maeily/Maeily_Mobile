package com.example.maeily_mobile.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.maeily_mobile.R;
import com.example.maeily_mobile.fragment.HomeFragment;
import com.example.maeily_mobile.fragment.ProfileFragment;
import com.example.maeily_mobile.fragment.ScheduleFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private HomeFragment fragmentHome = new HomeFragment();
    private ProfileFragment fragmentProfile = new ProfileFragment();
    private ScheduleFragment fragmentSchedule = new ScheduleFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

    private class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (menuItem.getItemId()){
                case R.id.ScheduleItem:
                    transaction.replace(R.id.frameLayout, fragmentSchedule).commitNow();
                    break;
                case R.id.HomeItem:
                    transaction.replace(R.id.frameLayout, fragmentHome).commitNow();
                    break;
                case R.id.ProfileItem:
                    transaction.replace(R.id.frameLayout, fragmentProfile).commitNow();
                    break;
            }
            return true;
        }
    }
}