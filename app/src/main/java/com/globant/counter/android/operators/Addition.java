package com.globant.counter.android.operators;


public class Addition extends Operator {

    public Addition () {
        input = "+";
    }

    public float operate (float x, float y) {
        return x + y;
    }

}
