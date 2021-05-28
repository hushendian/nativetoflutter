package com.common.myapplication.liveData

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.common.myapplication.R
import kotlinx.android.synthetic.main.activity_viewmodel.*

class LiveDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)
        val viewModelWithLiveData :ViewModelWithLiveData by viewModels()
        textView.text = viewModelWithLiveData.getLiveData()?.value.toString()
        button.setOnClickListener {
            viewModelWithLiveData.setData(100)
        }
        viewModelWithLiveData.getLiveData().observe(this, Observer<Int> { textView.text = viewModelWithLiveData?.getLiveData()?.value.toString() })
    }

}