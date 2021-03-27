package com.debug.converterhex;

import android.app.Application;

import com.debug.converterhex.dagger.AppComponent;
import com.debug.converterhex.dagger.DaggerAppComponent;

public class App extends Application {
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
