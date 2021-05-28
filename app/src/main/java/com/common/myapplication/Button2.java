package com.common.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class Button2 extends Button {
    public Button2(Context context) {
        super(context);
    }

    public Button2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Button2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("hsd", "Button2 dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("hsd", "Button2 onTouchEvent: ");
        return super.onTouchEvent(event);
    }
}
