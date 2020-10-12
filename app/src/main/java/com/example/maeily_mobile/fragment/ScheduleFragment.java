package com.example.maeily_mobile.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.maeily_mobile.MyAdapter;
import com.example.maeily_mobile.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ScheduleFragment extends Fragment {
    View view;
    Button add_schedule;
    RecyclerView recyclerView;
    MyAdapter adapter;
    ArrayList arrayList;
    String title;
    String content;
    TextView textView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_schedule, container, false);
        add_schedule = view.findViewById(R.id.add_schedule);
        /*adapter = new MyAdapter(arrayList);*/

        if (getArguments() != null) {
            title = getArguments().getString("title1");
            content = getArguments().getString("content1");
            Log.e("title", title);
            Log.e("content", content);
        }

        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);

        add_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                AddFragment Addfragment = new AddFragment();
                transaction.replace(R.id.frameLayout, Addfragment);
                transaction.commit();
            }
        });
        return view;
    }
}