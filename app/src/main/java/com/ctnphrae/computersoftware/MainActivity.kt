package com.ctnphrae.computersoftware

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ซ่อน Title bar
        supportActionBar?.hide()
        // Buttton  btn = findViewById(R.id.btn_phrae);

        btn_phrae.setOnClickListener(View.OnClickListener {

            setProvice(getDrawable(R.drawable.phrae_img), getString(R.string.btn_phrae),getString(R.string.history_phrae))

        })
        btn_chaingmai.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.chiangmai_img), getString(R.string.btn_chaingmai),getString(R.string.history_chaingmai))

        })
        btn_chaingrai.setOnClickListener(View.OnClickListener {
            setProvice(getDrawable(R.drawable.chaingrai_img), getString(R.string.btn_chaingrai),getString(R.string.history_chaingrai))

        })



    }

    fun setProvice (drawable :Drawable, header:String , content:String ){

        img_province.setImageDrawable(drawable)  //เปลี่ยนรูปภาพ
        tv_header.setText("ข้อมูลจังหวัด "+header) // ส่วนหัวของเนื้อหา
        tv_history.setText(content) // เปลี่ยนประวัติของแพร่

        Toast.makeText(this,
            "นี่คือ ข้อมูลจังหวัด "+header,Toast.LENGTH_LONG).show()
    }
}
