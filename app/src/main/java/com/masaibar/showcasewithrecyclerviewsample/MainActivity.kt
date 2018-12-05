package com.masaibar.showcasewithrecyclerviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.elconfidencial.bubbleshowcase.BubbleShowCaseBuilder
import kotlinx.android.synthetic.main.activity_main.*
import ru.dimorinny.showcasecard.position.Center
import ru.dimorinny.showcasecard.step.ShowCaseStep
import ru.dimorinny.showcasecard.step.ShowCaseStepDisplayer

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_bubble_show_case_android.setOnClickListener {
            startActivity(
                BubbleShowCaseAndroidActivity.createIntent(this)
            )
        }


//        BubbleShowCaseBuilder(this)
//            .title("bubble show case android")
//            .targetView(button_bubble_show_case_android)
//            .show()

        button_show_case_card_view.setOnClickListener {
            startActivity(
                ShowCaseCardViewActivity.createIntent(this)
            )
        }

        ShowCaseStepDisplayer.Builder(this)
            .addStep(ShowCaseStep(button_show_case_card_view, "message at view"))
            .build().start()

    }
}
