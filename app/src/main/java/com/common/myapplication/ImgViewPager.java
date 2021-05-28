package com.common.myapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.viewpager.widget.ViewPager;

public class ImgViewPager extends ViewPager implements DragImageView.OnMovingListener {
    public final static String TAG = "AlbumViewPager";

    /** 当前子控件是否处理拖动状态 */
    private boolean mChildIsBeingDragged = false;

    public ImgViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if (mChildIsBeingDragged)
            return false;
        return super.onInterceptTouchEvent(arg0);
    }

    @Override
    public void startDrag() {
        mChildIsBeingDragged = true;
    }

    @Override
    public void stopDrag() {
        mChildIsBeingDragged = false;
    }
}


