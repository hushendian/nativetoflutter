package com.common.myapplication.databinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.common.myapplication.R

class DataBindingActivity2 : AppCompatActivity() {

    private lateinit var databindingBinding: ActivityDatabinding2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_databinding2)
        databindingBinding.model = DataBindingModel()
        Log.d("hsd", "onCreate: " + test())

    }


    private fun test(): Int {
        var i = 0;
        try {
            i++
            Log.d("hsd", " try_test:${i} ")
            return i
        } catch (except: Exception) {
            i++
            Log.d("hsd", " catch_test:${i} ")
            return i
        } finally {
            i++
            Log.d("hsd", " finally_test:${i} ")
            return i
        }
    }

}