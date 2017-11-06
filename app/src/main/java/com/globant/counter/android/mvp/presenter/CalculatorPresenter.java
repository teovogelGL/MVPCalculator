package com.globant.counter.android.mvp.presenter;

import android.app.Activity;

import com.globant.counter.android.mvp.model.CalculatorModel;
import com.globant.counter.android.mvp.view.CalculatorView;
import com.globant.counter.android.operators.Operator;
import com.globant.counter.android.util.bus.RxBus;
import com.globant.counter.android.util.bus.observers.ClearButtonBusObserver;
import com.globant.counter.android.util.bus.observers.DigitButtonBusObserver;
import com.globant.counter.android.util.bus.observers.OperatorButtonBusObserver;
import com.globant.counter.android.util.bus.observers.ResultButtonBusObserver;

public class CalculatorPresenter {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void register() {
        Activity activity = view.getActivity();

        if (activity==null){
            return;
        }

        RxBus.subscribe(activity, new DigitButtonBusObserver() {
            @Override
            public void onEvent(DigitButton value) {
                onDigitClicked(value.digit);
            }
        });

        RxBus.subscribe(activity, new OperatorButtonBusObserver() {
            @Override
            public void onEvent(OperatorButton value) {
                onOperatorClicked(value.operator);
            }
        });

        RxBus.subscribe(activity, new ResultButtonBusObserver() {
            @Override
            public void onEvent(ResultButtonBusObserver.ResultButton value) {
                onResultClicked();
            }
        });

        RxBus.subscribe(activity, new ClearButtonBusObserver() {
            @Override
            public void onEvent(ClearButtonBusObserver.ClearButton value) {
                onClearClicked();
            }
        });

    }

    public void unregister() {
        Activity activity = view.getActivity();

        if (activity==null){
            return;
        }
        RxBus.clear(activity);
    }


    public void onDigitClicked (int n) {
        model.addDigit(n);
    }

    public void onOperatorClicked (Operator o) {
        model.setOperator(o);
    }

    public void onResultClicked () {
        if (model.readyToOperate()) {
            float result = model.operate();
            view.showResult(result);
        }
    }

    public void onClearClicked () {
        model.clear();
        view.clear();
    }
}
