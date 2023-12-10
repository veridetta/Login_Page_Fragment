package com.example.loginpagefragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUserID;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi IS_LOGIN agar tidak error
        boolean isLogin = getIntent().getBooleanExtra("IS_LOGIN", true);

        editTextUserID = findViewById(R.id.editTextUserID);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai dari EditText User ID (email) dan Password
                String email = editTextUserID.getText().toString();
                String password = editTextPassword.getText().toString();
                // Membuat Intent untuk berpindah ke VerifikasiSignActivity
                Intent intent = new Intent(MainActivity.this, VerifikasiSignActivity.class);
                // Mengirim data email dan password ke VerifikasiSignActivity
                intent.putExtra("EMAIL", email);
                intent.putExtra("PASSWORD", password);

                // Memulai aktivitas VerifikasiSignActivity dengan mengirim data
                startActivity(intent);
            }
        });

        // Menampilkan pesan jika login gagal
        if (!isLogin) {
            Toast.makeText(this, "Login failed. Please try again.", Toast.LENGTH_SHORT).show();
        }
    }
}