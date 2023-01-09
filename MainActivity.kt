package com.example.oldhelper

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.AndroidException
import android.view.*
import android.view.View.OnCreateContextMenuListener
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    var flg: Int = 1;
    var ajay:String = "+917009304743"
    var ajay2:String = "+919781637827"
    var sanjay:String = "+917986994549"
    var ayush:String = "+918264187465"
    var sima:String = "+919506570686"
    var parashuram:String = "+919140722366"
    var vivek:String = "+916387026109"
    var kuldeep:String = "+918960892454"
    var jitendra:String = "+919616030749"
    var upendra:String = "+919956010661"
    var anup:String = "+919554340512"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ajayButton: ImageButton = findViewById(R.id.ajay)
        var ajay2Button: ImageButton = findViewById(R.id.ajay2)
        var sanjayButton: ImageButton = findViewById(R.id.sanjay)
        var ayushButton: ImageButton = findViewById(R.id.ayush)
        var simaButton: ImageButton = findViewById(R.id.sima)
        var parashuramButton: ImageButton = findViewById(R.id.parashuram)
        var vivekButton: ImageButton = findViewById(R.id.vivek)
        var kuldeepButton: ImageButton = findViewById(R.id.kuldeep)
        var jitendraButton: ImageButton = findViewById(R.id.jitendra)
        var upendraButton: ImageButton = findViewById(R.id.upendra)
        var anupButton: ImageButton = findViewById(R.id.anup)
        var btn12: ImageButton = findViewById(R.id.imageButton12)


        var str:String = intent.getStringExtra("new_number").toString()

        ajayButton.setOnClickListener({
            if(str.length >= 10) {
                ajay = str;
            }
            call_ajay();
        })
        ajay2Button.setOnClickListener({
            call_ajay2();
        })
        sanjayButton.setOnClickListener({
            call_sanjay();
        })
        ayushButton.setOnClickListener({
            call_ayush();
        })
        simaButton.setOnClickListener({
            call_sima();
        })
        parashuramButton.setOnClickListener({
            call_parashuram();
        })
        vivekButton.setOnClickListener({
            call_vivek();
        })
        kuldeepButton.setOnClickListener({
            call_kuldeep();
        })
        jitendraButton.setOnClickListener({
            call_jitendra();
        })
        upendraButton.setOnClickListener({
            call_upendra();
        })
        anupButton.setOnClickListener({
            call_anup();
        })
        btn12.setOnClickListener({
            callButton12();
        })
    }

    fun call_ajay() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + ajay;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_ajay2() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + ajay2;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_sanjay() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + sanjay;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_ayush() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + ayush;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_sima() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + sima;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_parashuram() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + parashuram;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_vivek() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + vivek;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_kuldeep() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + kuldeep;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(kuldeep)));
        }
    }

    fun call_jitendra() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + jitendra;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_upendra() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + upendra;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun call_anup() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            var call:String = "tel:" + anup;
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse(call)));
        }
    }

    fun callButton12() {
        if (ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(android.Manifest.permission.CALL_PHONE),
                flg
            );
        } else {
            startActivity(Intent(Intent.ACTION_CALL, Uri.parse("tel:+916387026109")));
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (requestCode == flg) {
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                call_ajay()
                call_ajay2()
                call_sanjay()
                call_ayush()
                call_sima()
                call_parashuram()
                call_vivek()
                call_kuldeep()
                call_jitendra()
                call_upendra()
                call_anup()
                callButton12()
            } else {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.ajay_number -> {
                var i =Intent(this, MainActivity2::class.java)
                i.putExtra("index", "1")
                i.putExtra("name", "Ajay")
                startActivity(i)
            }
            R.id.ajay2_number -> {

            }
            R.id.sanjay_number -> {

            }
            R.id.ayush_number -> {

            }
            R.id.sima_number -> {

            }
            R.id.parashuram_number -> {

            }
            R.id.vivek_number -> {

            }
            R.id.kuldeep_number -> {

            }
            R.id.jitendra_number -> {

            }
            R.id.upendra_number -> {

            }
            R.id.anup_number -> {

            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
        return true;
    }
}