package com.premsinghdaksha.spots_progress_dialog;

import android.view.animation.Interpolator;

/**
 * Created by Er.prem singh daksha
 * https://www.linkedin.com/in/prem-singh-daksha-82az/
 * on 22DEP-2020
 */

class HesitateInterpolator implements Interpolator {

    private static double POW = 1.0/2.0;

    @Override
    public float getInterpolation(float input) {
        return input < 0.5
                ? (float) Math.pow(input * 2, POW) * 0.5f
                : (float) Math.pow((1 - input) * 2, POW) * -0.5f + 1;
    }
}
