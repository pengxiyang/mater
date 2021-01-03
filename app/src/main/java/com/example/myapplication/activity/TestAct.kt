package com.example.myapplication.activity

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.factory.TestViewModelFactory
import com.example.myapplication.viewmodel.TestViewModel
import kotlinx.android.synthetic.main.activity_test.*


class TestAct : AppCompatActivity() {
    var TAG ="----ATestAct"
    lateinit var viewmodel:TestViewModel
    lateinit var sp:SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        sp=getPreferences(Context.MODE_PRIVATE)
        val countReserved =sp.getInt("count_reserved",0)
        viewmodel = ViewModelProvider(this,TestViewModelFactory(countReserved)).get(TestViewModel::class.java)
        bt.setOnClickListener{
            viewmodel.counter++;
            refreshPage()
        }
        refreshPage()
        Log.e(TAG, "onCreate: " )

        bt1.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }


    fun refreshPage(){
        tv.text =viewmodel.counter.toString()
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: " )
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: " )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: " )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: " )
        sp.edit {
            putInt("count_reserved",viewmodel.counter)
        }
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: " )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: " )
    }
}

