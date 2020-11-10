package com.example.maeily_mobile.network.retrofit.Interfaces;

import com.example.maeily_mobile.model.request.LoginRequest;
import com.example.maeily_mobile.model.response.LoginResponse;
import com.example.maeily_mobile.network.response.Response;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LoginInterface {

    @POST("auth/login")
    Call<Response<LoginResponse>> loginPost(@Body LoginRequest loginRequest);
}
