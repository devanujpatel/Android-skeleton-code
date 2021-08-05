package com.example.android_skeleton_code;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

public class FragmentAlpha extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        container.findViewById(R.id.alpha_text_view).setOnClickListener(v -> onClick());

        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_alpha, container, false);


    }

    private void onClick() {
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager.findFragmentById(R.id.nav_host_fragment_container);
        NavController navController = navHostFragment.getNavController();
    }
}