package com.project.charmander.charmander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hendrikcammann on 05.07.15.
 */
public class ReadReportActivity extends Fragment {
    public ReadReportActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_read_report, container, false);

        return rootView;

    }
}
