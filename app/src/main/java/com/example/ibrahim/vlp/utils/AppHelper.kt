package com.example.ibrahim.vlp.utils

import android.content.Context
import android.content.pm.PackageManager
import android.graphics.Typeface
import android.os.Build
import android.support.v4.app.ActivityCompat
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.ibrahim.vlp.R


object AppHelper {


    fun getTypeFace(context: Context): Typeface {

        return Typeface.createFromAsset(context.applicationContext.assets, "fonts/NeoTech-Light.otf")
    }

    fun getTypeFaceAr(context: Context): Typeface {

        return Typeface.createFromAsset(context.applicationContext.assets, "fonts/GE_SS_Two_Light.otf")
    }

    fun getTypeFaceBold(context: Context): Typeface {

        return Typeface.createFromAsset(context.applicationContext.assets, "fonts/NeoTech-Bold.otf")
    }

    fun getTypeFaceBoldAr(context: Context): Typeface {

        return Typeface.createFromAsset(context.applicationContext.assets, "fonts/GE_SS_Two_Bold.otf")
    }

    fun hasPermissions(context: Context?, vararg permissions: String): Boolean {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && context != null && permissions != null) {
            for (permission in permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false
                }
            }
        }
        return true
    }


    fun setImage(context: Context, img: ImageView, ImgUrl: String) {
        Glide.with(context)
            .load(ImgUrl)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .thumbnail(Glide.with(context).load(R.drawable.loading))
            .dontAnimate().into(img)

    }


    fun setMargins(context: Context, view: View, left: Int, top: Int, right: Int, bottom: Int) {
        if (view.layoutParams is ViewGroup.MarginLayoutParams) {

            val leftInDp = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, left.toFloat(), context.resources
                    .displayMetrics
            ).toInt()
            val topInDp = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, top.toFloat(), context.resources
                    .displayMetrics
            ).toInt()

            val rightInDp = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, right.toFloat(), context.resources
                    .displayMetrics
            ).toInt()

            val bottomInDp = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, bottom.toFloat(), context.resources
                    .displayMetrics
            ).toInt()

            val p = view.layoutParams as ViewGroup.MarginLayoutParams
            p.setMargins(leftInDp, topInDp, rightInDp, bottomInDp)
            view.requestLayout()
        }
    }


}
