package com.common.myapplication;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class T1 {

    private Context context;

    public  void test(){

        WebView webView=new WebView(context);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }
}
