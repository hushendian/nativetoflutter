package com.common.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;

public class FramLayout extends FrameLayout {
    public FramLayout(Context context) {
        super(context);
    }

    public FramLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FramLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("hsd", "FramLayout dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("hsd", "FramLayout onInterceptTouchEvent: ");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("hsd", "FramLayout onTouchEvent: ");
        return super.onTouchEvent(event);
    }
}
