package com.common.myapplication.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.common.myapplication.MyObserver
import com.common.myapplication.MyObserver2
import com.common.myapplication.R

class DataBindingActivity : AppCompatActivity() {
    private var viewModelWithLiveData: ViewModelWithLiveData? = null

    private lateinit var databindingBinding: ActivityDatabindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding)
        viewModelWithLiveData = ViewModelProvider(this).get(ViewModelWithLiveData::class.java)
        databindingBinding.model = viewModelWithLiveData
        databindingBinding.lifecycleOwner = this
        this.lifecycle.addObserver(MyObserver2())
    }

}