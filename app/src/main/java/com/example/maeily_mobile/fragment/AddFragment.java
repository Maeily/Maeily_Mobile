/*
package com.example.maeily_mobile.fragment;

import android.app.Activity;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.maeily_mobile.R;

import petrov.kristiyan.colorpicker.ColorPicker;

public class AddFragment extends Fragment {
    EditText et_title;
    EditText et_content;
    Button add_button;
    CardView colorView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add2, container, false);
        et_title = view.findViewById(R.id.channel_title_et);
        et_content = view.findViewById(R.id.channel_content_et);
        add_button = view.findViewById(R.id.add_button);
        colorView = view.findViewById(R.id.colorpick);

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

    public void pickColor(View view){
        openColorPicker();
        colorView.setCardBackgroundColor(0);
    }

    public void openColorPicker() {
        ColorPicker colorPicker = new ColorPicker(getActivity());
        colorPicker.setColors(R.array.colorPicker)
                .setColumns(5)
                .setRoundColorButton(true)
                .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if(color == 0){
                            Toast.makeText(getActivity(),"색상이 선택되지 않았습니다.", Toast.LENGTH_SHORT).show();
                            openColorPicker();
                        }else{
                            colorView.setCardBackgroundColor(color);
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                });
    }
}*/
