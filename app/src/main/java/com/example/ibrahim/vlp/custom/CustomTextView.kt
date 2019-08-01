package com.example.ibrahim.vlp.custom

import android.content.Context
import android.util.AttributeSet
import com.example.ibrahim.vlp.utils.AppHelper


/**
 * Created by Ali Hariri on 5/22/2017.
 */

class CustomTextView : android.support.v7.widget.AppCompatTextView {
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
            typeface = AppHelper.getTypeFace(context)
    }
}
