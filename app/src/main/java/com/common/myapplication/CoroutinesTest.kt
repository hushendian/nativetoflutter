package com.common.myapplication

import android.util.Log
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce

class CoroutinesTest {

    var test12 = ""

    suspend fun main() {
        val job = GlobalScope.launch {
            delay(1000)
            Log.d("hsd", "main: ------word")
        }
        Log.d("hsd", "main: ------hello")
        Thread.sleep(2000)
        Log.d("hsd", "main: ------end")

        job.join()

        runBlocking {

        }

    }

    fun test() = runBlocking {
        launch {
            doSomething()
        }
    }

    suspend fun doSomething() {
        delay(100)
        print("00000")
    }

    fun Test1() {
        runBlocking {
            withTimeout(1300L) {
                repeat(1000) {
                    Log.d("hsd", "Test1: ")
                    delay(500)
                }

            }
        }

    }

//    fun add() {
//        runBlocking {
//            val a = async {
//                doSomethingOne()
//            }
//            val b = async {
//                doSomethingTwo()
//            }
//            Log.d("hsd", "add: " + "${a.await() + b.await()}")
//        }
//    }

    suspend fun doSomethingOne(): Int {
        delay(1000)
        return 13
    }

    suspend fun doSomethingTwo(): Int {
        delay(2000)
        return 33
    }

    fun sample(): Sequence<Int> = sequence {
        for (i in 1..3) {
            Thread.sleep(1000)
            yield(i)
        }
    }

    fun forEach() {
        sample().forEach {
            Log.d("hsd", "forEach: " + it)
        }
    }

    suspend fun requestManger(request: Int): String {

        delay(1000)
        return "response${request}"
    }

    fun asFlow() {
        runBlocking {
            (1..3).asFlow()
                    .map { it -> requestManger(it) }
                    .collect {
                        Log.d("hsd", "asFlow: " + it)
                    }
        }
    }

    fun addSum() {
        runBlocking {
            val sum = (1..5).asFlow()
                    .map {
                        it * it
                        Log.d("hsd", "map: ${it * it}")
                    }.reduce { a, b ->
                        a + b
                        Log.d("hsd", "reduce: ${a}----${b}-----+${a + b}")
                    }
            Log.d("hsd", "addSum: " + sum)

        }
    }

}