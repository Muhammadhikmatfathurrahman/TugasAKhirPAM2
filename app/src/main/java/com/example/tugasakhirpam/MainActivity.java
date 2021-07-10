package com.example.tugasakhirpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast; //fungsi import untuk memanggil activity, menambah fungsi, membaca data string/int,menampilkan data

public class MainActivity extends AppCompatActivity {
    Button btnLogin, btnregis;
    EditText edemail, edpassword; // mendeklarasi variabel yang akan digunakan
    String nama, password; //untuk menyimpan email dan password

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignin);
        edemail = findViewById(R.id.edEmail); // untuk menghubungkan button yang ada pada layout xml
        edpassword = findViewById(R.id.edPassword);
        btnregis = findViewById(R.id.btnregist);

        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Register.class); //untuk memindah layout saat diklik pada button register
                startActivity(i);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();// untuk mengeset email dan pass saat login
                String email = "zamzam@gmail.com";
                String pass = "123";

                if (nama.isEmpty() || password.isEmpty()) { //memastikan nama dan password tidak boleh kosong
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan Password tidak boleh kosong", Toast.LENGTH_LONG);//untuk memunculkan error saat email dan password kosong
                    edemail.setError("Email dan Password tidak boleh kosong");
                    edpassword.setError("Email dan Password tidak boleh kosong");
                    t.show();

                } else {

                    if (nama.equals(email) && password.equals(pass)) {
                        Toast t = Toast.makeText(getApplicationContext(), //verifikasi email dan password sesuai dengan yang telah di setting
                                "Login Sukses", Toast.LENGTH_LONG);
                        t.show();
                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), HomeActivity.class); // jika login sukses maka akan berpindah ke layout home activiy

                        i.putExtras(b);

                        startActivity(i);

                    } else {
                        Toast t = Toast.makeText(getApplicationContext(),//memunculkan error gagal saat verifikasi login tidak sesuai
                                "Login Gagal", Toast.LENGTH_LONG);
                        edemail.setError("Login Gagal");
                        edpassword.setError("Login Gagal");
                        t.show();
                    }
                }
            }
        });
    }
}