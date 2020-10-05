package com.melihakkose.kotlinalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Context
        //Activity Context -> this
        //App Context -> applicationContext


        //TOAST MESAJI
        Toast.makeText(applicationContext,"Welcome!",Toast.LENGTH_LONG).show()

    }

    fun save(view: View){

        //Alert Dialog olusturma
        val alert= AlertDialog.Builder(this)

        //Baslik olusturma
        alert.setTitle("Save!")
        //Mesaj gosterme
        alert.setMessage("Are You Sure?")
        //Button koyma
        alert.setPositiveButton("Yes"){dialog,which ->
            //Yes basinca cikacak toast mesaji (onClickListener)
            Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No"){dialog,which ->
            //No basinca cikacak toast mesaji (onClickListener)
            Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}