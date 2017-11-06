package com.globant.counter.android.mvp.view;

import android.app.Activity;
import android.widget.TextView;

import com.globant.counter.android.R;
import com.globant.counter.android.operators.Addition;
import com.globant.counter.android.operators.Division;
import com.globant.counter.android.operators.Multiplication;
import com.globant.counter.android.operators.Subtraction;
import com.globant.counter.android.util.bus.RxBus;
import com.globant.counter.android.util.bus.observers.DigitButtonBusObserver;
import com.globant.counter.android.util.bus.observers.OperatorButtonBusObserver;
import com.globant.counter.android.util.bus.observers.ResultButtonBusObserver;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CalculatorView extends ActivityView {

    @BindView(R.id.num_label) TextView numLabel;

    public CalculatorView(Activity activity) {
        super(activity);
        ButterKnife.bind(this, activity);
    }

    public void showResult (float r) {
        numLabel.setText("" + r);
    }

    @OnClick(R.id.digit_zer_button)
    public void digitPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(0));
    }

    @OnClick(R.id.digit_one_button)
    public void digitOnePressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(1));
    }

    @OnClick(R.id.digit_two_button)
    public void digitTwoPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(2));
    }

    @OnClick(R.id.digit_thr_button)
    public void digitThrPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(3));
    }

    @OnClick(R.id.digit_fou_button)
    public void digitFouPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(4));
    }

    @OnClick(R.id.digit_fiv_button)
    public void digitFivPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(5));
    }

    @OnClick(R.id.digit_six_button)
    public void digitSixPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(6));
    }

    @OnClick(R.id.digit_sev_button)
    public void digitSevPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(7));
    }

    @OnClick(R.id.digit_eig_button)
    public void digitEigPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(8));
    }

    @OnClick(R.id.digit_nin_button)
    public void digitNinPressed() {
        RxBus.post(new DigitButtonBusObserver.DigitButton(9));
    }



    @OnClick(R.id.operator_add_button)
    public void operatorAddPressed() {
        RxBus.post(new OperatorButtonBusObserver.OperatorButton(new Addition()));
    }

    @OnClick(R.id.operator_sub_button)
    public void operatorSubPressed() {
        RxBus.post(new OperatorButtonBusObserver.OperatorButton(new Subtraction()));
    }

    @OnClick(R.id.operator_mul_button)
    public void operatorMulPressed() {
        RxBus.post(new OperatorButtonBusObserver.OperatorButton(new Multiplication()));
    }

    @OnClick(R.id.operator_div_button)
    public void operatorDivPressed() {
        RxBus.post(new OperatorButtonBusObserver.OperatorButton(new Division()));
    }



    @OnClick(R.id.result_button)
    public void resultPressed() {
        RxBus.post(new ResultButtonBusObserver.ResultButton());
    }

}
