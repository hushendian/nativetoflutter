package com.common.myapplication;

import android.util.Log;

class Test5 {


    public <T> T getClass(Class<T> tClass) throws InstantiationException, IllegalAccessException {

        return tClass.newInstance();
    }


    public <E> void getData(E e) {
        Log.d("hsd", "getData: " + e.toString());
    }


    public <T> void printMsg(T... args) {
        for (T t : args) {
            Log.d("hsd", "printMsg: " + t);

        }
    }
}
