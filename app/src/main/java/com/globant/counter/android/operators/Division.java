package com.globant.counter.android.operators;

public class Division extends Operator {

    public Division () {
        input = "/";
    }

    public float operate (float x, float y) {
        if (y == 0) {
            return 666;
        }
        return x / y;
    }

}
