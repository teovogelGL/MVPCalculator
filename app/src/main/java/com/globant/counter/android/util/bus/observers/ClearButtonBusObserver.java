
package com.globant.counter.android.util.bus.observers;

public abstract class ClearButtonBusObserver extends BusObserver<ClearButtonBusObserver.ClearButton> {
    public ClearButtonBusObserver() {
        super(ClearButton.class);
    }

    public static class ClearButton {
    }
}