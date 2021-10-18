package com.jfcodes.plateformesupinfo.FilesHelperClasses;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

public class filespecs {

    String FileName;
    String FileDetail;

    GradientDrawable color;

    public filespecs(GradientDrawable color, String FileName, String FileDetail) {

        this.FileName = FileName;
        this.FileDetail = FileDetail;
        this.color = color;
    }

    public String getFileDetail() {
        return FileDetail;
    }

    public String getFileName() {
        return FileName;
    }

    public Drawable getgradient() {
        return color;
    }


}
