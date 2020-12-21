package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.db.MyDatabaseHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dbHepler = MyDatabaseHelper(this, "BookStore.db", 2)

        bt.setOnClickListener{
            Toast.makeText(this,"start",Toast.LENGTH_SHORT).show()
            dbHepler.writableDatabase
        }
        //添加数据

}

}
