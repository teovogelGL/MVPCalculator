package com.globant.counter.android.operators;

public abstract class Operator {

    protected String input;

    public abstract float operate (float x, float y);

    public String toString () {
        return input;
    }

}
