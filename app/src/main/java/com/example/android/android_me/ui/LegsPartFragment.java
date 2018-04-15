package com.example.android.android_me.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class LegsPartFragment extends Fragment {

    public LegsPartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_legs_part, container, false);
        ImageView imageView = rootView.findViewById(R.id.legs_part_image_vew);
        imageView.setImageResource(AndroidImageAssets.getLegs().get(0));
        return rootView;
    }
}
