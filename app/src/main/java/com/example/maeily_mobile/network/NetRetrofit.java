package com.example.maeily_mobile.network;

import com.example.maeily_mobile.network.retrofit.Interfaces.LoginInterface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetRetrofit {
    private static NetRetrofit ourInstance = new NetRetrofit();

    public static NetRetrofit getOurInstance() {
        return ourInstance;
    }

    public NetRetrofit() {

    }

    private Retrofit retrofit = new Retrofit.Builder() // retrofit 빌드
            .baseUrl("http://192.168.0.63:8080/") // base 가 되는 URI
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    LoginInterface loginInterface = retrofit.create(LoginInterface.class);
    public LoginInterface getLoginInterface() {
        return loginInterface;
    }
}
