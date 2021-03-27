package com.debug.converterhex.presenters;

import com.debug.converterhex.App;
import com.debug.converterhex.Model;
import com.debug.converterhex.fragments.ResultView;

import javax.inject.Inject;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class ResultPresenter extends MvpPresenter<ResultView> {

    @Inject
    Model model;

    public void getData() {
        App.getAppComponent().injectResultPresenter(this);
        String hex = model.getHex();
        getViewState().getResult(hex);
    }
}
