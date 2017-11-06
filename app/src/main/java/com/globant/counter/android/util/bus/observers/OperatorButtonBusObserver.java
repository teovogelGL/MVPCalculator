package com.globant.counter.android.util.bus.observers;

import com.globant.counter.android.operators.Operator;

public abstract class OperatorButtonBusObserver extends BusObserver<OperatorButtonBusObserver.OperatorButton> {
    public OperatorButtonBusObserver() {
        super(OperatorButton.class);
    }

    public static class OperatorButton {

        public Operator operator;

        public OperatorButton (Operator o) {
            operator = o;
        }

    }
}