package com.globant.counter.android.operators;

public class Division extends Operator {

    public float operate (int x, int y) {
        if (y == 0) {
            return 666;
        }
        return x / y;
    }

}
