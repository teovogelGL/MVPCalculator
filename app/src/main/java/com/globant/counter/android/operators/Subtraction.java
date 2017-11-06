package com.globant.counter.android.operators;


public class Subtraction extends Operator {

    public Subtraction () {
        input = "-";
    }

    public float operate (float x, float y) {
        return x - y;
    }

}
