package com.example.myapplication.activity
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.db.MyDatabaseHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var dbHepler: MyDatabaseHelper? = null
    private var db: SQLiteDatabase? = null
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bt -> createDb()
            R.id.add_bt -> addData()
            R.id.query_bt -> queryDb()
            R.id.update_bt -> updateDb()
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbHepler = MyDatabaseHelper(this, "BookStore.db", 2)

        bt.setOnClickListener(this)
        query_bt.setOnClickListener(this)
        add_bt.setOnClickListener(this)
        update_bt.setOnClickListener(this)
        //添加数据
    }

    fun createDb() {
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show()
        db = dbHepler?.writableDatabase
    }

    fun addData() {
        Toast.makeText(this, "add", Toast.LENGTH_SHORT).show()
        val values = ContentValues().apply {
            put("name", "The Sound of Slience")
            put("author", "xx")
            put("pages", "567")
            put("price", "45")
        }
        //插入第一条数据
        db?.insert("Book", null, values)

    }

    fun queryDb() {
        Toast.makeText(this, "query", Toast.LENGTH_SHORT).show()

    }

    fun updateDb() {
        Toast.makeText(this, "update", Toast.LENGTH_SHORT).show()

    }

}
