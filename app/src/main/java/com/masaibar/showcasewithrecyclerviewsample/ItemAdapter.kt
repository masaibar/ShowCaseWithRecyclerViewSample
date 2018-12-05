package com.masaibar.showcasewithrecyclerviewsample

import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder


internal class ItemAdapter(
    private val itemsCount: Int
) : GroupAdapter<ViewHolder>() {
    init {
        for (i in 1..itemsCount) {
            add(
                Item()
            )
        }
    }
}