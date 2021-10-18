package com.jfcodes.plateformesupinfo.MatiereHelperClasses;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class matierespecs {

    String detail;
    String title;
    GradientDrawable color;

    public matierespecs(GradientDrawable color, String title, String detail) {

        this.title = title;
        this.detail = detail;
        this.color = color;
    }

    public String getDetail() {
        return detail;
    }

    public String getTitle() {
        return title;
    }

    public Drawable getgradient() {
        return color;
    }


}
