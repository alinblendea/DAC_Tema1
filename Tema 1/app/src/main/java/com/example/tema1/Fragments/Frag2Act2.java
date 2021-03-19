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

public class Frag2Act2 extends Fragment {
    private static final String TAG = "F2A2";

    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2_act2, container, false);

        buttonOne = (Button) view.findViewById(R.id.button1);
        buttonTwo = (Button) view.findViewById(R.id.button2);
        buttonThree = (Button) view.findViewById(R.id.button3);

       buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((SecondActivity)getActivity()).setViewPager(2);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((SecondActivity)getActivity()).setViewPager(0);
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });

        return view;
    }
}