package com.example.viewpagerdemo.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpagerdemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class OnServiceFragment extends Fragment {


    public OnServiceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onservice, container, false);
    }

}
