package com.common.myapplication.fragmentViewModel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.common.myapplication.R

class Fragment1 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.activity_livedata, container, false)
        val viewModel: MViewModel by activityViewModels()

        view.findViewById<Button>(R.id.button).setOnClickListener {
            viewModel.setData("qqqqw")
            view.findViewById<TextView>(R.id.textView).text = viewModel.getData().value
        }
        return view
    }




}