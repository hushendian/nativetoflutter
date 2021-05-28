package com.common.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class LinearLayout1 extends LinearLayout {
    public LinearLayout1(Context context) {
        super(context);
    }

    public LinearLayout1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayout1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("hsd", "LinearLayout1 dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("hsd", "LinearLayout1 onInterceptTouchEvent: ");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("hsd", "LinearLayout1 onTouchEvent: ");
        return super.onTouchEvent(event);
    }
}
