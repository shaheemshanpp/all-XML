package com.example.questionpaper

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        classsroomhero.setOnClickListener {
            val intent = Intent(this, clasroomheroku::class.java)
            startActivity(intent)
        }
        errorBtn.setOnClickListener {
            val intent = Intent(this, error_page_activity::class.java)
            startActivity(intent)
        }
        herologin.setOnClickListener {
            val intent = Intent(this, herokulogin::class.java)
            startActivity(intent)
        }
        timetable.setOnClickListener {
            val intent = Intent(this, com.example.questionpaper.timetable::class.java)
            startActivity(intent)
        }
        addtimetable.setOnClickListener {
            val intent = Intent(this, newtimetable::class.java)
            startActivity(intent)
        }
        addnewtimetableonly.setOnClickListener {
            val intent = Intent(this, com.example.questionpaper.addnewtimetableonly::class.java)
            startActivity(intent)
        }
        esiasadmin.setOnClickListener {
            val intent = Intent(this, eSiasAdministration::class.java)
            startActivity(intent)
        }
    }
}