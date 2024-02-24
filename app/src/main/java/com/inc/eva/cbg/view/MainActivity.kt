package com.inc.eva.cbg.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inc.eva.cbg.R.layout
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
    }
}
