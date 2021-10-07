package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/*
Create an application that overrides all six methods that control the activity lifecycle.
Each method should print a Log message to the console.
 */

class MainActivity : AppCompatActivity() {
    // 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }//end oncreate

    // 2
    override fun onStart() {
        super.onStart()
        Log.d("here","This is onStart method")
    }
    // 3
    override fun onPause() {
        super.onPause()
        Log.d("here","This is onPause method")
    }
    // 4
    override fun onResume() {
        super.onResume()
        Log.d("here","This is onResume method")
    }
    // 5
    override fun onStop() {
        super.onStop()
        Log.d("here","This is onStop method")
    }
    // 6
    override fun onDestroy() {
        super.onDestroy()
        Log.d("here","This is onDestroy method")
    }

}//end class