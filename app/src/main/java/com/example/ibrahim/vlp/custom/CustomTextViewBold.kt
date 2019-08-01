package com.example.ibrahim.vlp.custom

import android.content.Context
import android.util.AttributeSet
import com.example.ibrahim.vlp.utils.AppHelper


class CustomTextViewBold : android.support.v7.widget.AppCompatTextView {
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context) : super(context) {
        init()
    }

    private fun init() {
        if (!isInEditMode)
            typeface = AppHelper.getTypeFaceBold(context)
    }
}
