package com.example.oldhelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var title: TextView = findViewById(R.id.textView3)
        var index: String = intent.getStringExtra("index").toString()
        var name: String = intent.getStringExtra("name").toString()
        var btn: Button = findViewById(R.id.button)
        title.setText(title.text.toString() + " " + index)

        var new_number: EditText = findViewById(R.id.editTextTextPersonName)
        var pass: EditText = findViewById(R.id.editTextTextPersonName2)
        btn.setOnClickListener({
            if (pass.text.toString().equals(name.toString())) {
                var i = Intent(this, MainActivity::class.java)
                i.putExtra("new_number", new_number.toString())
                startActivity(i);
            } else {
                Toast.makeText(this, "incorrect password", Toast.LENGTH_SHORT).show();
            }
        })
    }
}