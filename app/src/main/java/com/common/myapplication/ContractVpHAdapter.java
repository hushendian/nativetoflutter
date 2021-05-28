package com.common.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class ContractVpHAdapter extends PagerAdapter {

    private List<Integer> mDataList;
    private List<ImageView> mViewList;
    private Context mContext;
    private ImgViewPager mImgViewPager;

    public ContractVpHAdapter(Context c, List<Integer> data, ImgViewPager imgViewPager) {
        mContext = c;
        mDataList = data;
        mImgViewPager = imgViewPager;
        mViewList = new ArrayList<ImageView>();
        notifyDataView();


//        mImgViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                for (int i = 0; i < mViewList.size(); i++) {
//                    if (null != mViewList.get(i)) {
//                        mViewList.get(i).setCanDrag(false);
//                    }
//                }
//                if ((position + 1) < mViewList.size()) {
//                    mViewList.get(position + 1).setCanDrag(true);
//                }
//            }
//        });
    }
    public ContractVpHAdapter(Context c, List<Integer> data) {
        mContext = c;
        mDataList = data;
        mViewList = new ArrayList<ImageView>();
        notifyDataView();


//        mImgViewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
//
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                for (int i = 0; i < mViewList.size(); i++) {
//                    if (null != mViewList.get(i)) {
//                        mViewList.get(i).setCanDrag(false);
//                    }
//                }
//                if ((position + 1) < mViewList.size()) {
//                    mViewList.get(position + 1).setCanDrag(true);
//                }
//            }
//        });
    }


    @Override
    public float getPageWidth(int position) {
        return (float) 0.33;
    }

    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public void destroyItem(ViewGroup arg0, int arg1, Object arg2) {
        ((ViewPager) arg0).removeView(mViewList.get(arg1));
    }

    @Override
    public View instantiateItem(ViewGroup arg0, int arg1) {
        ((ViewPager) arg0).addView(mViewList.get(arg1));
        return mViewList.get(arg1);
    }

    public void notifyDataView() {
        mViewList.clear();
        if (mDataList.isEmpty()) {
            notifyDataSetChanged();
            return;
        }

        mViewList.add(getImg());
        for (int i = 0; i < mDataList.size(); i++) {
            getView(i);
        }
        mViewList.add(getImg());

        notifyDataSetChanged();
    }

    private void getView(int i) {
        ImageView imageView = getImg();
        imageView.setImageResource(mDataList.get(i));
        mViewList.add(imageView);

//        if (i == 1) {
//            imageView.setCanDrag(true);
//        }
    }

    private ImageView getImg() {
//        DragImageView imageView = new DragImageView(mContext);
//        imageView.setOnMovingListener(mImgViewPager);
//        imageView.setCanDrag(false);
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        imageView.setPadding(12, 0, 12, 0);
        return imageView;
    }
}

