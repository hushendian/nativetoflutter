package com.common.myapplication.flutter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.common.myapplication.R;
import com.common.myapplication.plugin.FlutterPluginJumpToAct;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugin.common.PluginRegistry;

public class SecondActivity extends AppCompatActivity implements PluginRegistry {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        FlutterEngine flutterEngine = new FlutterEngine(this);
//        flutterEngine.getNavigationChannel().setInitialRoute("/test");
//        flutterEngine.getDartExecutor().executeDartEntrypoint(
//                DartExecutor.DartEntrypoint.createDefault()
//        );
//        // 通过FlutterView引入Flutter编写的页面
//        FlutterView flutterView = new FlutterView(this);
//        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(
//                ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.MATCH_PARENT);
//        FrameLayout flContainer = findViewById(R.id.fl_container);
//        flContainer.addView(flutterView, lp);
//// 关键代码，将Flutter页面显示到FlutterView中
//        flutterView.attachToFlutterEngine(flutterEngine);
//
//        registerCustomPlugin(this);
        startActivity(FlutterActivity.withCachedEngine("my_engine_id").build(this));
    }

    private static void registerCustomPlugin(PluginRegistry registrar) {

        FlutterPluginJumpToAct.registerWith(registrar.registrarFor(FlutterPluginJumpToAct.CHANNEL));

    }

    @Override
    public Registrar registrarFor(String pluginKey) {
        return null;
    }

    @Override
    public boolean hasPlugin(String pluginKey) {
        return false;
    }

    @Override
    public <T> T valuePublishedByPlugin(String pluginKey) {
        return null;
    }
}