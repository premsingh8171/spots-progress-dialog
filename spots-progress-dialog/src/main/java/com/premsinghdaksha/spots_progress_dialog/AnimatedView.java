package com.premsinghdaksha.spots_progress_dialog;

import android.content.Context;
import android.view.View;

/**
 * Created by Er.prem singh daksha
 * https://www.linkedin.com/in/prem-singh-daksha-82az/
 * on 22DEP-2020
 */

class AnimatedView extends View {

    private int target;

    public AnimatedView(Context context) {
        super(context);
    }

    public float getXFactor() {
        return getX() / target;
    }

    public void setXFactor(float xFactor) {
        setX(target * xFactor);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public int getTarget() {
        return target;
    }
}
