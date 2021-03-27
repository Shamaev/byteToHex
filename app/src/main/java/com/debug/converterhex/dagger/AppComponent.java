package com.debug.converterhex.dagger;

import com.debug.converterhex.presenters.ResultPresenter;
import com.debug.converterhex.presenters.SecondPresenter;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {Modules.class})
public interface AppComponent {
    void injectSecondPresenter(SecondPresenter secondPresenter);
    void injectResultPresenter(ResultPresenter resultPresenter);
}
