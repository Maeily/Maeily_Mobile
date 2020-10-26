package com.example.maeily_mobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.maeily_mobile.fragment.ScheduleFragment;

import petrov.kristiyan.colorpicker.ColorPicker;

public class AddActivity extends AppCompatActivity {
    EditText et_title;
    EditText et_content;
    Button add_button;
    CardView colorView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        et_title = findViewById(R.id.channel_title_et);
        et_content = findViewById(R.id.channel_content_et);
        add_button = findViewById(R.id.add_button);
        colorView = findViewById(R.id.colorpick);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScheduleFragment scheduleFragment = new ScheduleFragment();
                Bundle bundle = new Bundle();
                bundle.putString("title", et_title.getText().toString());
                bundle.putString("content", et_content.getText().toString());
                scheduleFragment.setArguments(bundle);
                onBackPressed();
            }
        });
    }

    public void pickColor(View view){
        openColorPicker();
        colorView.setCardBackgroundColor(0);
    }

    public void openColorPicker() {
        ColorPicker colorPicker = new ColorPicker(this);
        colorPicker.setTitle("채널색상 선택");
        colorPicker.setColors(R.array.colorPicker)
                .setColumns(4)
                .setRoundColorButton(true)
                .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                    @Override
                    public void onChooseColor(int position, int color) {
                        if(color == 0){
                            Toast.makeText(AddActivity.this,"색상이 선택되지 않았습니다.", Toast.LENGTH_SHORT).show();
                            openColorPicker();
                        }
                    }

                    @Override
                    public void onCancel() {

                    }
                }).show();
    }
}