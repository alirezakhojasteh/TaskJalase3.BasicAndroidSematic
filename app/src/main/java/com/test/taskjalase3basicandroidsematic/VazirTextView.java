package com.test.taskjalase3basicandroidsematic;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class VazirTextView extends androidx.appcompat.widget.AppCompatTextView {

    public VazirTextView(@NonNull Context context) {
        super(context);
    }

    public VazirTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        Typeface Vazir = Typeface.createFromAsset(context.getAssets(),"Vazirmatn-Regular.ttf");
        this.setTypeface(Vazir);
    }
}
