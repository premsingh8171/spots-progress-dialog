package com.premsinghdaksha.spots_progress_dialog;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/**
 * Created by Er.prem singh daksha
 * https://www.linkedin.com/in/prem-singh-daksha-82az/
 * on 22DEP-2020
 */

class AnimatorPlayer extends AnimatorListenerAdapter {

    private boolean interrupted = false;
    private Animator[] animators;

    AnimatorPlayer(Animator[] animators) {
        this.animators = animators;
    }

    @Override
    public void onAnimationEnd(Animator animation) {
        if (!interrupted) animate();
    }

    void play() {
        animate();
    }

    void stop() {
        interrupted = true;
    }

    private void animate() {
        AnimatorSet set = new AnimatorSet();
        set.playTogether(animators);
        set.addListener(this);
        set.start();
    }
}
