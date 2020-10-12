package com.example.maeily_mobile.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.maeily_mobile.R;

import java.util.zip.Inflater;

public class AddFragment extends Fragment {
    EditText et_title;
    EditText et_content;
    Button add_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add2, container, false);
        et_title = view.findViewById(R.id.channel_title_et);
        et_content = view.findViewById(R.id.channel_content_et);
        add_button = view.findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("title1", et_title.getText().toString());
                bundle.putString("content1", et_content.getText().toString());
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                ScheduleFragment scheduleFragment = new ScheduleFragment();
                scheduleFragment.setArguments(bundle);
                transaction.replace(R.id.frameLayout, scheduleFragment);
                transaction.commit();
            }
        });
        return view;
    }
}