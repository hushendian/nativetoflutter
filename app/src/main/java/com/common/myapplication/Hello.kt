package com.common.myapplication

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log

class Hello {
    fun say() {
        Log.d("hsd", "say: ")
    }

    fun say(count: Int) {
        Log.d("hsd", "say: " + count)
    }

    fun people(a: () -> Unit) {
        a()
    }

    fun testa(): Int {
        return 1
    }

    fun Test(b: () -> Int) {
        say(b())
    }

    fun testc(a: Int) {

    }

    fun Testb(c: (Int) -> Unit) {
        c(1)
    }

    fun main() {
        people { say() }
        Test { testa() }
        Testb { testc(5) }
    }


}