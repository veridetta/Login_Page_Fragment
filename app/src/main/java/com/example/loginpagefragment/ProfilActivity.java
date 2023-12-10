package com.example.loginpagefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.loginpagefragment.ProfilFragment.BiodataFragment;
import com.example.loginpagefragment.ProfilFragment.PendidikanFragment;
import com.example.loginpagefragment.ProfilFragment.ProfileFragment;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        // Menampilkan Fragment Biodata
        Fragment biodataFragment = new BiodataFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerBiodata, biodataFragment)
                .commit();

        // Menampilkan Fragment Profile
        Fragment pendidikanFragment = new PendidikanFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerProfile, pendidikanFragment)
                .commit();
    }
    public void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerProfile, fragment)
                .commit();
    }
}
