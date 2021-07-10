package com.example.tugasakhirpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tugasakhirpam.MainActivity;
import com.example.tugasakhirpam.R;
import com.google.android.material.snackbar.Snackbar;

public class Register extends AppCompatActivity {

    EditText usr, email, alamat, pwd, repwd;
    Button btnrgs, btnbatal;
    CheckBox jenisklm, agama;//deklarasi variabel

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        usr = findViewById(R.id.redtnama);
        email = findViewById(R.id.redtemail);
        alamat = findViewById(R.id.redtalamat);
        pwd = findViewById(R.id.redtpassword);
        repwd = findViewById(R.id.redtrepassword);//menghubungkan button yang ada di layout xml
        btnrgs = findViewById(R.id.rbtndaftar);
        btnbatal = findViewById(R.id.rbtnbatal);
        jenisklm = findViewById(R.id.checkBox);
        jenisklm = findViewById(R.id.checkBox2);

        btnrgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usr.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||//input data tidak boleh kosong
                        alamat.getText().toString().isEmpty() ||
                        pwd.getText().toString().isEmpty() ||
                        repwd.getText().toString().isEmpty() ||
                        jenisklm.getText().toString().isEmpty() ||
                        agama.getText().toString().isEmpty()) {
                    usr.setError("Masukkan Nama");
                    email.setError("Masukkan Email");
                    alamat.setError("Masukkan Alamat");
                    pwd.setError("Masukkan Password");
                    repwd.setError("Masukkan Re-Password");//menampilkan error jika ada input yang kosong
                } else {
                    if (pwd.getText().toString().equals(repwd.getText().toString())) {//mengecek password dan repassword harus sama
                        Toast.makeText(getApplicationContext(), "registration is successful",//menampilkan jika registrasi sukses
                                Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);//jika registrasi sukses akan menuju ke main activity
                        startActivity(i);
                    } else {
                        Snackbar.make(view, "password and repassword must be same",//menampilkan snackbar password dan repass harus sama
                                Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
        btnbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);//untuk kembali ke main activity jika klik btn batal
                startActivity(i);
            }
        });

    }
}