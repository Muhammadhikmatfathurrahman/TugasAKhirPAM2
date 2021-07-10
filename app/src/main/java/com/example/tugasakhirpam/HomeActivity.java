package com.example.tugasakhirpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnpjpj, btnzmzmwtr, btnzamzam, btnroyal;//mendeklarasi variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnpjpj = findViewById(R.id.btnpjpjhome);
        btnzmzmwtr = findViewById(R.id.btnzmzmwtrhome);//berfungsi menghubungkan dengan button yang digunakan pada layout xml
        btnzamzam = findViewById(R.id.btnzamzamhome);
        btnroyal = findViewById(R.id.btnroyalhome);

        btnroyal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });

        btnzamzam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });

        btnzmzmwtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });

        btnpjpj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailPemesanan.class);
                startActivity(i);
            }
        });
    }
}