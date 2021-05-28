package com.common.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        CoroutinesTest().main()
        CoroutinesTest().addSum()
    }

    private suspend fun setData() {
        DataStore.setInt(100)
    }

}