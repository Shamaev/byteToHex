package com.debug.converterhex;

import com.debug.converterhex.presenters.SecondPresenter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    SecondPresenter secondPresenter = new SecondPresenter();
    @Test
    public void checkHex() {
        byte[] arr = new byte[2];
        arr[0] = 1;
        arr[1] = 32;
        String result = secondPresenter.byteToHex(arr);
        assertEquals(result, "0120");
    }
}