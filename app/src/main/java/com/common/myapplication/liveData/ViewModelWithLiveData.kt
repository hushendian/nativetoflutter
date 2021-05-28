package com.common.myapplication.liveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelWithLiveData : ViewModel() {

    private var liveData: MutableLiveData<Int>? = null


    fun getLiveData(): MutableLiveData<Int> {

        if (liveData == null) {
            liveData = MutableLiveData()
            liveData?.value = 0
        }
        return liveData!!
    }

    fun setData(count: Int) {
        liveData?.value = liveData?.value?.plus(count)
    }

}