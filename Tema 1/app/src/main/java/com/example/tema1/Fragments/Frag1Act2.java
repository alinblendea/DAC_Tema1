package com.example.tema1.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tema1.R;
import com.example.tema1.Activities.SecondActivity;

public class Frag1Act2 extends Fragment {
    private static final String TAG = "F1A2";

    private Button buttonToSecFrag;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1_act2, container, false);

        buttonToSecFrag = (Button) view.findViewById(R.id.addF2A2btn);

        buttonToSecFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((SecondActivity)getActivity()).setViewPager(1);
            }
        });

        return view;
    }
}