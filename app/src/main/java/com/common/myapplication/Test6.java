package com.common.myapplication;

import android.util.Log;

public class Test6<T> {

    public static <T> void getData(T t) {
        Log.d("hsd", "getData: " + t);
    }
}
