package com.app.pravin_unit_testing.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

}

fun main(){
   val x =  higherOrderFunction(2,4,::add)
    println("Output => $x")
}

fun higherOrderFunction(a : Int ,b:Int,myfun :(a:Int,b : Int)->Int):Int{
    return myfun(a,b)
}

fun add(a : Int, b : Int): Int{
    return a + b;

}