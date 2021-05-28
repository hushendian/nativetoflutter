package com.common.myapplication;

import android.util.Log;

class Test9 {
    public static int test() {
        int i = 0;
        try {
            i++;
            Log.d("hsd", "try_test: " + i);
            return i;
        } catch (Exception e) {
            i++;
            Log.d("hsd", "catch_test: " + i);
            return i;
        } finally {
            i++;
            Log.d("hsd", "finally_test: " + i);
        }
    }
}
