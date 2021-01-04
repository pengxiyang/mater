package com.example.myapplication.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver(val lifecycle: Lifecycle):LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun activityStart(){
        lifecycle.currentState

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun  activityStop(){

    }

}