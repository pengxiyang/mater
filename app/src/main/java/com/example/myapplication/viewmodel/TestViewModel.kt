package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel

class TestViewModel(countReserved:Int):ViewModel() {
    var counter =countReserved;
}