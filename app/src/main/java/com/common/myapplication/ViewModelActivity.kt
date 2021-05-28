package com.common.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_viewmodel.*


class ViewModelActivity : AppCompatActivity() {
    var viewModel: MyViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_viewmodel)
        viewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        textView.text = viewModel?.count.toString()
        button.setOnClickListener {
            viewModel?.count = viewModel?.count?.plus(2)!!
            textView.text = viewModel?.count.toString()
        }
    }
}