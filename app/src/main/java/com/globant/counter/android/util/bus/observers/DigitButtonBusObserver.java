package com.globant.counter.android.util.bus.observers;

public abstract class DigitButtonBusObserver extends BusObserver<DigitButtonBusObserver.DigitButton> {
    public DigitButtonBusObserver() {
        super(DigitButton.class);
    }

    public static class DigitButton {

        public int digit;

        public DigitButton (int n) {
            digit = n;
        }

    }
}