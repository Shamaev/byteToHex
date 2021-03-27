package com.debug.converterhex.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.debug.converterhex.App;
import com.debug.converterhex.R;
import com.debug.converterhex.presenters.ResultPresenter;

import javax.inject.Inject;

import moxy.MvpAppCompatFragment;
import moxy.presenter.InjectPresenter;

public class ResultFragment extends MvpAppCompatFragment implements ResultView {
    private TextView textResult;

    @InjectPresenter
    ResultPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textResult = getActivity().findViewById(R.id.textResult);

        presenter.getData();

        Log.i("qweqwe", "getBackStackEntryCount = " + getActivity().getSupportFragmentManager().getBackStackEntryCount());

    }

    @Override
    public void getResult(String result) {
        textResult.setText(result);
    }
}