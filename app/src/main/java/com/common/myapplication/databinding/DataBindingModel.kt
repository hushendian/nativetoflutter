package com.common.myapplication.databinding

import android.util.Log
import androidx.databinding.ObservableField

class DataBindingModel {
    private var observableField: ObservableField<User>? = null

    init {
        val user = User("张三")
        observableField = ObservableField()
        observableField!!.set(user)
    }

    fun getUserName(): String {
        return observableField?.get()!!.userName
    }

    fun setUserName(userName: String) {
        Log.d("hsd", "setUserName: $userName")
        observableField?.set(User(userName))
    }

}