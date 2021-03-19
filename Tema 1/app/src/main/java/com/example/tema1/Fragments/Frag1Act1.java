package com.example.tema1.Fragments;

import android.content.Intent;
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

public class Frag1Act1 extends Fragment {
    private static final String TAG = "F1A1";

    private Button buttonToSecAct;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag1_act1, container, false);

        buttonToSecAct = (Button) view.findViewById(R.id.secondActBtn);

        buttonToSecAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), SecondActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}