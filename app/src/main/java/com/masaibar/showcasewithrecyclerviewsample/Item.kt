package com.masaibar.showcasewithrecyclerviewsample

import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.view_item.view.*


class Item : Item() {

    override fun getLayout(): Int =
        R.layout.view_item

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.text_id.text = position.toString()
    }
}