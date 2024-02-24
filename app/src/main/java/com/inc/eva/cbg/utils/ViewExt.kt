package com.inc.eva.cbg.utils

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.OnScrollListener
import com.google.android.material.floatingactionbutton.FloatingActionButton

fun RecyclerView.hideFabOnScrollDown(fab: FloatingActionButton) {
    addOnScrollListener(
        object : OnScrollListener() {
            override fun onScrolled(
                recyclerView: RecyclerView,
                dx: Int,
                dy: Int,
            ) {
                if (dy > 0 && fab.isShown) fab.hide()
                if (dy < 0 && !fab.isShown) fab.show()
            }
        },
    )
}
