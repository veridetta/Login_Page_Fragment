package com.example.loginpagefragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class VerifikasiSignActivity extends AppCompatActivity {

    private static final String EMAIL_VERIFIKASI = "caca@gmail.com";
    private static final String PASSWORD_VERIFIKASI = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifikasi_sign);

        // Mengambil data dari Intent
        Intent intent = getIntent();
        String email = intent.getStringExtra("EMAIL");
        String password = intent.getStringExtra("PASSWORD");

        // Verifikasi email dan password
        if (email != null && password != null &&
                email.equals(EMAIL_VERIFIKASI) && password.equals(PASSWORD_VERIFIKASI)) {
            // Jika verifikasi berhasil, pindah ke ProfilActivity
            Intent profilIntent = new Intent(VerifikasiSignActivity.this, ProfilActivity.class);
            startActivity(profilIntent);
            finish(); // Selesai dengan activity ini
        } else {
            // Jika verifikasi gagal, kembali ke LoginActivity dengan pesan login gagal
            Intent loginIntent = new Intent(VerifikasiSignActivity.this, MainActivity.class);
            loginIntent.putExtra("IS_LOGIN", false);
            startActivity(loginIntent);
            finish(); // Selesai dengan activity ini
        }
    }
}

