package com.debug.converterhex.dagger;

import com.debug.converterhex.Model;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class Modules {
    @Singleton
    @Provides
    Model providerModel() {
        return new Model();
    }
}
