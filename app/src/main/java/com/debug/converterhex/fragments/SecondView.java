package com.debug.converterhex.fragments;

import moxy.MvpView;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {
    @StateStrategyType(value = SkipStrategy.class)
    void next();
}
