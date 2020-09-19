package com.example.maeily_mobile;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prolificinteractive.materialcalendarview.MaterialCalendarView;

public class FragmentHome extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    
}