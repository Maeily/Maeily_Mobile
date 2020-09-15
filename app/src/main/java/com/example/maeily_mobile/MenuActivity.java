package com.example.maeily_mobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentProfile fragmentProfile = new FragmentProfile();
    private FragmentSchedule fragmentSchedule = new FragmentSchedule();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelctedListener());
    }

    private class ItemSelctedListener implements BottomNavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem){
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (menuItem.getItemId()){
                case R.id.ScheduleItem:
                    transaction.replace(R.id.frameLayout, fragmentSchedule).commitAllowingStateLoss();
                    break;
                case R.id.HomeItem:
                    transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();
                    break;
                case R.id.ProfileItem:
                    transaction.replace(R.id.frameLayout, fragmentProfile).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }
}