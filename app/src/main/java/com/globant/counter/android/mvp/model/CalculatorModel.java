package com.globant.counter.android.mvp.model;

import com.globant.counter.android.operators.Operator;

public class CalculatorModel {

    private float x = 0;
    private float y = 0;
    private Operator operator;

    public void setX (float n) {
        x = n;
    }

    public void setY (float n) {
        y = n;
    }

    public void addDigit(int n) {
        if (operator == null) {
            x *= 10;
            x += n;
        } else {
            y *= 10;
            y += n;
        }
    }

    public void setOperator (Operator o) {
        operator = o;
        y = 0;
    }

    public boolean readyToOperate () {
        return operator != null;
    }

    public float operate () {
        float result = operator.operate(x, y);
        operator = null;
        x = 0;
        y = 0;
        return result;
    }

}
