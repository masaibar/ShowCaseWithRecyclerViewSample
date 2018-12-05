package com.masaibar.showcasewithrecyclerviewsample

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BubbleShowCaseAndroidActivity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context): Intent =
            Intent(context, BubbleShowCaseAndroidActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bubble_show_case_android)
    }
}
