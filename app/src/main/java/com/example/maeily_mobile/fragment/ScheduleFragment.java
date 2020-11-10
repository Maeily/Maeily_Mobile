package com.example.maeily_mobile.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.maeily_mobile.activity.AddActivity;
import com.example.maeily_mobile.model.Channel;
import com.example.maeily_mobile.MyAdapter;
import com.example.maeily_mobile.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ScheduleFragment extends Fragment {
    View view;
    FloatingActionButton add_schedule;
    RecyclerView recyclerView;
    MyAdapter adapter;
    String title;
    String content;
    ArrayList<Channel> channelList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_schedule, container, false);
        add_schedule = view.findViewById(R.id.add_schedule);
        recyclerView = view.findViewById(R.id.recyclerview);

        add_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getArguments() != null) {
            title = getArguments().getString("title1");
            content = getArguments().getString("content1");
            Log.e("title", title);
            Log.e("content", content);
            Channel channel = new Channel(content, title);
            channelList.add(channel);
        }

        adapter = new MyAdapter(getActivity(), channelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}