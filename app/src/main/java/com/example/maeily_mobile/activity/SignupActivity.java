package com.example.maeily_mobile.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.maeily_mobile.R;

import java.util.ArrayList;

public class SignupActivity extends AppCompatActivity {
    Button button;

    private Spinner spinner;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        arrayList = new ArrayList<>();
        arrayList.add("1기");
        arrayList.add("2기");
        arrayList.add("3기");
        arrayList.add("4기");
        arrayList.add("5기");

        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,
                arrayList);
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(arrayAdapter);

        button = findViewById(R.id.sign_up_cp_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "회원가입되었습니다.", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}