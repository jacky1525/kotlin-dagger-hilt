package com.jacky.hiltkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //Field Injection
    @Inject
    lateinit var lars : Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val instrument = Instrument()
        val band = Band()

        var james = Musician(instrument,band)

        james.sing()
        */

        lars.sing()

        myClass.printFunction(myClass.myFunction())

        myClass.printFunction(myClass.secondFunction())

    }
}