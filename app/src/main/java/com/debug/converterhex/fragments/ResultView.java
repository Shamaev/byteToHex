package com.debug.converterhex.fragments;

import moxy.MvpView;
import moxy.viewstate.strategy.SingleStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface ResultView extends MvpView {
    @StateStrategyType(value = SingleStateStrategy.class)
    void getResult(String result);
}
