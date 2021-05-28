package com.common.myapplication.fragmentViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MViewModel : ViewModel() {

    var liveData: MutableLiveData<String>? = null

    fun getData(): MutableLiveData<String> {
        if (liveData == null) {
            liveData = MutableLiveData<String>()
            liveData?.value = ""
        }
        return liveData!!
    }

    fun setData(value: String) {
        liveData?.value = value
    }


}