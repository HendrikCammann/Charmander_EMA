package com.project.charmander.charmander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hendrikcammann on 06.07.15.
 */
public class ImageDetailViewActivity extends Fragment {

    public ImageDetailViewActivity() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_image_detail_view, container, false);

        return rootView;

    }
}
