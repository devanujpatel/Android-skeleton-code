package com.example.android_skeleton_code;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentBeta extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.findViewById(R.id.beta_text_view).setOnClickListener(v -> Navigation.findNavController(container).navigate(R.id.go_to_alpha));

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beta, container, false);
    }
}