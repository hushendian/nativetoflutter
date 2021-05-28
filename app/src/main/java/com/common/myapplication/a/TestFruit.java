package com.common.myapplication.a;

import android.util.Log;

public class TestFruit<T extends fruit> {

    private T t;

    public void add(T t1) {
        this.t = t1;
    }

    public void get() {
        Log.d("hsd", "get: " + t);
    }

}
