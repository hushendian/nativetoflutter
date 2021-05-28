package com.common.myapplication;

import android.util.Log;

public class Test4 implements Test3<String> {
    @Override
    public void getData(String data) {
        Log.d("hsd", "getData: " + data);
    }
}
