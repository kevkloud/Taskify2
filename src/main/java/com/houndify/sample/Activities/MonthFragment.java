package com.houndify.sample.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.houndify.sample.R;

/**
 * Created by kevinlee on 1/24/16.
 */
public class MonthFragment extends Fragment {

    public MonthFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.month_fragment, container, false);
    }
}
