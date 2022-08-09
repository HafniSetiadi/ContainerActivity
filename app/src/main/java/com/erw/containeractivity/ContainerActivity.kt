package com.erw.containeractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.erw.containeractivity.fragment.SampleFragment

class ContainerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        val sampleFragment = SampleFragment()
        fragmentTransaction.add(R.id.fcvSample,sampleFragment)
        fragmentTransaction.commit()
        Log.d("TESSLIFECYCLE1", "onCreate")

    }
}