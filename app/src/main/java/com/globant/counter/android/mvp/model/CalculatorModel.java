package com.globant.counter.android.mvp.model;

import com.globant.counter.android.operators.Operator;

public class CalculatorModel {

    private int x = 0;
    private int y = 0;
    private Operator operator;

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

    public void clear () {
        x = 0;
        y = 0;
        operator = null;
    }

}
