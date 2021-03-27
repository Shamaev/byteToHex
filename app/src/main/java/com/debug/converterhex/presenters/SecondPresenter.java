package com.debug.converterhex.presenters;

import com.debug.converterhex.App;
import com.debug.converterhex.Model;
import com.debug.converterhex.fragments.SecondView;

import java.util.Random;

import javax.inject.Inject;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class SecondPresenter extends MvpPresenter<SecondView> {

    @Inject
    Model model;

    public void translateToHex(String sizeText) {
        App.getAppComponent().injectSecondPresenter(this);
        int size = Integer.parseInt(sizeText.trim());
        byte[] arr = new byte[size];
        new Random().nextBytes(arr);
        model.setHex(byteToHex(arr));
        getViewState().next();
    }

    public String byteToHex(byte[] arr) {
        StringBuilder sb = new StringBuilder(arr.length * 2);
        for(byte b: arr) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
