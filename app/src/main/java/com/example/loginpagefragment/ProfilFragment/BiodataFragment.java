package com.example.loginpagefragment.ProfilFragment;

import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.loginpagefragment.ProfilActivity;
import com.example.loginpagefragment.R;


public class BiodataFragment extends Fragment {

    private boolean isPendidikanActive = false;
    private boolean isPengalamanActive = false;
    private boolean isKeahlianActive = false;

    AppCompatButton btnPendidikan;
    AppCompatButton btnPengalaman;
    AppCompatButton btnKeahlian;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boidata, container, false);

        // Referensi ke tombol-tombol
         btnPendidikan = view.findViewById(R.id.btnPendidikan);
         btnPengalaman = view.findViewById(R.id.btnPengalaman);
         btnKeahlian = view.findViewById(R.id.btnKeahlian);
        btnPendidikan.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.primary)));
        // Set OnClickListener untuk masing-masing tombol
        btnPendidikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonState(btnPendidikan, isPendidikanActive);
                // Panggil metode untuk mengubah fragment di ProfilActivity menjadi fragment pendidikan
                changeProfileFragment(new PendidikanFragment());
            }
        });

        btnPengalaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonState(btnPengalaman, isPengalamanActive);
                // Panggil metode untuk mengubah fragment di ProfilActivity menjadi fragment pengalaman
                changeProfileFragment(new PengalamanFragment());
            }
        });

        btnKeahlian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateButtonState(btnKeahlian, isKeahlianActive);
                // Panggil metode untuk mengubah fragment di ProfilActivity menjadi fragment keahlian
                changeProfileFragment(new KeahlianFragment());
            }
        });

        return view;
    }

    // Metode untuk mengubah fragment di ProfilActivity
    private void changeProfileFragment(Fragment fragment) {
        if (getActivity() != null) {
            ((ProfilActivity) getActivity()).changeFragment(fragment);
        }
    }

    // Metode untuk mengubah tampilan tombol berdasarkan status aktif/nonaktif
    private void updateButtonState(AppCompatButton button, boolean isActive) {
        btnKeahlian.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.grey)));
        btnPendidikan.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.grey)));
        btnPengalaman.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.grey)));
        button.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.primary)));
    }
}
