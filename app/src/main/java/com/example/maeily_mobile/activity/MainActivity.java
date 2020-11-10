package com.example.maeily_mobile.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.maeily_mobile.model.response.LoginResponse;
import com.example.maeily_mobile.network.NetRetrofit;
import com.example.maeily_mobile.network.response.Response;
import com.example.maeily_mobile.R;
import com.example.maeily_mobile.model.request.LoginRequest;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    Button sign_in_btn;
    Button sign_up_btn;
    EditText sign_in_id_et;
    EditText sign_in_pw_et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_in_btn = findViewById(R.id.sign_in_btn);
        sign_up_btn = findViewById(R.id.sign_up_btn);
        sign_in_id_et = findViewById(R.id.sign_id_et);
        sign_in_pw_et = findViewById(R.id.sign_pw_et);

        sign_in_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginRequest loginRequest = new LoginRequest(sign_in_id_et.getText().toString(), sign_in_pw_et.getText().toString());
                Call<Response<LoginResponse>> response = NetRetrofit.getOurInstance().getLoginInterface().loginPost(loginRequest);
                response.enqueue(new Callback<Response<LoginResponse>>() {
                    @Override
                    public void onResponse(Call<Response<LoginResponse>> call, retrofit2.Response<Response<LoginResponse>> response) {
                        Log.e("test", "성공");
                        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(), "로그인되었습니다.", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Response<LoginResponse>> call, Throwable t) {
                        Log.e("test", "실패");
                    }
                });
            }
        });

        sign_up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
    }

    private void login(LoginRequest loginRequest){

    }
}