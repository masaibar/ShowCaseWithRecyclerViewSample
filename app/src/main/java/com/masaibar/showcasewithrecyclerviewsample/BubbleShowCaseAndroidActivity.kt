package com.masaibar.showcasewithrecyclerviewsample

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_show_case_card_view.*

class BubbleShowCaseAndroidActivity : AppCompatActivity() {

    companion object {
        fun createIntent(context: Context): Intent =
            Intent(context, BubbleShowCaseAndroidActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bubble_show_case_android)

        val linearLayoutManager = LinearLayoutManager(applicationContext)
        recycler_view.apply {
            layoutManager = linearLayoutManager
            adapter = ItemAdapter(
                this@BubbleShowCaseAndroidActivity,
                5
            )
        }
    }
}
