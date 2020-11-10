package com.example.maeily_mobile.model.request;

public class SignUpRequest {

    private String id;
    private String user_email;
    private String pw;
    private int year;

    public SignUpRequest(String id, String user_email, String pw, int year) {
        this.id = id;
        this.user_email = user_email;
        this.pw = pw;
        this.year = year;
    }
}
