package com.example.instmojodemo;

public abstract class InstapayListener {
    public abstract void onSuccess(String response);

    public abstract void onFailure(int code, String reason);
}
