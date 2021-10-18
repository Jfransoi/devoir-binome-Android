package com.jfcodes.plateformesupinfo.ProgrameHelperClasses;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class programspecs {

    String ProgDetail;
    String ProgTitle;
    GradientDrawable color;

    public programspecs(GradientDrawable color, String ProgTitle, String ProgDetail) {

        this.ProgTitle = ProgTitle;
        this.ProgDetail = ProgDetail;
        this.color = color;
    }

    public String getProgDetail() {
        return ProgDetail;
    }

    public String getProgTitle() {
        return ProgTitle;
    }

    public Drawable getgradient() {
        return color;
    }


}
