package com.masaibar.showcasewithrecyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_bubble_show_case_android.setOnClickListener {
            startActivity(
                BubbleShowCaseAndroidActivity.createIntent(this)
            )
        }

        button_show_case_card_view.setOnClickListener {
            startActivity(
                ShowCaseCardViewActivity.createIntent(this)
            )
        }
    }
}
