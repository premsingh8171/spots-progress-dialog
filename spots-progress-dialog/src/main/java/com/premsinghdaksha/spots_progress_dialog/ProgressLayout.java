package com.premsinghdaksha.spots_progress_dialog;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by Er.prem singh daksha
 * https://www.linkedin.com/in/prem-singh-daksha-82az/
 * on 22DEP-2020
 */

public class ProgressLayout extends FrameLayout {

    private static final int DEFAULT_COUNT = 5;
    private int spotsCount;

    public ProgressLayout(Context context) {
        this(context, null);
    }

    public ProgressLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProgressLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ProgressLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs, defStyleAttr, defStyleRes);
    }

    private void init(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Dialog,
                defStyleAttr, defStyleRes);

        spotsCount = a.getInt(R.styleable.Dialog_DialogSpotCount, DEFAULT_COUNT);
        a.recycle();
    }

    public int getSpotsCount() {
        return spotsCount;
    }
}
