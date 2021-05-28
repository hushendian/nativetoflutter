package com.common.myapplication.fragmentViewModel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.common.myapplication.R
import kotlinx.android.synthetic.main.activity_viewmodel.*

class Fragment2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.activity_livedata, container, false)
        val viewModel: MViewModel by activityViewModels()
        activity?.let {
            viewModel.getData().observe(it, Observer<String> { msg ->
                textView.text = msg
            })
        }
        return view
    }
}