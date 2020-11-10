package com.example.maeily_mobile.model.request;

public class LoginRequest {

    private String id;
    private String pw;

    public LoginRequest(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }
}