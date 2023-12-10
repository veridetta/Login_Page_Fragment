package com.example.loginpagefragment.ProfilFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.loginpagefragment.R;

public class ProfileFragment extends Fragment {

    private ViewPager viewPager;

    public ProfileFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        //viewPager = view.findViewById(R.id.viewPagerProfile);

        // Set up ViewPager with its adapter to manage the sub-fragments
        // Example:
        // ProfilePagerAdapter profilePagerAdapter = new ProfilePagerAdapter(getChildFragmentManager());
        // viewPager.setAdapter(profilePagerAdapter);

        return view;
    }
}
