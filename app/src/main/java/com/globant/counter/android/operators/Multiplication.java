package com.globant.counter.android.operators;


public class Multiplication extends Operator {

    public Multiplication () {
        input = "*";
    }

    public float operate (float x, float y) {
        return x * y;
    }

}
