
package com.globant.counter.android.util.bus.observers;

public abstract class ResultButtonBusObserver extends BusObserver<ResultButtonBusObserver.ResultButton> {
    public ResultButtonBusObserver() {
        super(ResultButton.class);
    }

    public static class ResultButton {
    }
}