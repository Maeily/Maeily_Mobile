package com.example.maeily_mobile.network.response;

public class Response<Data> {

    private String message;
    private int status;
    private Data data;

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }
}