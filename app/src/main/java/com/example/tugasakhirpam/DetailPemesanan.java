package com.example.tugasakhirpam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DetailPemesanan extends AppCompatActivity {
    TextView dtlpesanan, dtlnama, dtlalamat, dtlkodepos, dtlnotel;//deklarasi variabel
    Button btndtlbatal, btndtlpesan;
    EditText dtlnamaa, dtlalamatt, dtlkodeposs, dtlnotell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pemesanan);

        dtlpesanan = findViewById(R.id.dtlpesanan);
        dtlnama = findViewById(R.id.dtlnm);
        dtlalamat = findViewById(R.id.dtlalmt);
        dtlkodepos = findViewById(R.id.dtlkp);//untuk menghubungkan pada tampilan yang ada dilayout
        dtlnotel = findViewById(R.id.dtlnt);
        btndtlbatal = findViewById(R.id.btndtlbatal);
        btndtlpesan = findViewById(R.id.btndtlpesan);
        dtlnamaa = findViewById(R.id.edtdtlnama);
        dtlalamatt = findViewById(R.id.edtdtlalamat);
        dtlkodeposs = findViewById(R.id.edtdtlkodepos);
        dtlnotell = findViewById(R.id.edtdtlnotel);

        btndtlbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeActivity.class);//untuk berpindah ke layout home activity
                startActivity(i);
            }
        });

        btndtlpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dtlnamaa.getText().toString().isEmpty() ||//input harus diisi
                        dtlalamatt.getText().toString().isEmpty() ||
                        dtlkodeposs.getText().toString().isEmpty() ||
                        dtlnotell.getText().toString().isEmpty()) {
                    dtlnamaa.setError("Masukkan Nama");
                    dtlalamatt.setError("Masukkan Alamat");//memberi tanda eror dan harus diisi
                    dtlkodeposs.setError("Masukkan Kode Pos");
                    dtlnotell.setError("Masukkan Nomor Telepon");
                } else {
                    Toast.makeText(getApplicationContext(), "Pesanan sedang diproses",//untuk memunculkan pemberitahuan kalau pesanan sedang di proses
                            Toast.LENGTH_LONG).show();
                    Intent i = new Intent(getApplicationContext(), End.class);//untuk pindah layout ke end activity
                    startActivity(i);
                }
            }
        });
    }
}