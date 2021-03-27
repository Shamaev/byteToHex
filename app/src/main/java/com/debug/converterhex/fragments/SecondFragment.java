package com.debug.converterhex.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.debug.converterhex.App;
import com.debug.converterhex.R;
import com.debug.converterhex.presenters.SecondPresenter;

import moxy.MvpAppCompatFragment;
import moxy.presenter.InjectPresenter;

public class SecondFragment extends MvpAppCompatFragment implements SecondView {
    private Button translate;
    private EditText edit;

    @InjectPresenter
    SecondPresenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        translate = getActivity().findViewById(R.id.translate);
        edit = getActivity().findViewById(R.id.edit);

        Log.i("qweqwe", "getBackStackEntryCount = " + getActivity().getSupportFragmentManager().getBackStackEntryCount());


        translate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit.getText().toString().trim().length() > 0) {
                    presenter.translateToHex(edit.getText().toString());
                    edit.clearFocus();
                    edit.getText().clear();
                } else {
                    Toast.makeText(getContext(), "Введите размер массива", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    @Override
    public void next() {
        Log.i("qweqwe", "next = ");
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new ResultFragment())
                .addToBackStack(null)
                .commit();
    }
}