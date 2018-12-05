package com.masaibar.showcasewithrecyclerviewsample

import android.app.Activity
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.view_item.view.*
import ru.dimorinny.showcasecard.ShowCaseView
import ru.dimorinny.showcasecard.position.ViewPosition
import ru.dimorinny.showcasecard.radius.Radius


class Item(private val activity: Activity) : Item() {

    override fun getLayout(): Int =
        R.layout.view_item

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.text_id.text = position.toString()

        if (position == 4) {
//            ShowCaseStepDisplayer.Builder(activity)
//                .addStep(ShowCaseStep(viewHolder.itemView.button, "message at view"))
//                .build().start()
            ShowCaseView.Builder(activity)
                .withTypedPosition(ViewPosition(viewHolder.itemView.button))
                .withTypedRadius(Radius(60f))
                .withContent("this is message")
                .build()
                .show(activity)
        }

//        BubbleShowCaseBuilder(activity)
//            .title("title")
//            .targetView(viewHolder.itemView.button)
//            .show()
    }
}