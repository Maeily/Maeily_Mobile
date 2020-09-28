package com.example.maeily_mobile.fragment;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maeily_mobile.R;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class HomeFragment extends Fragment {
    View view;
    MaterialCalendarView materialCalendarView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        materialCalendarView = view.findViewById(R.id.calendarView);

        return view;
    }
}