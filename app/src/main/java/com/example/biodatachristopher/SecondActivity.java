package com.example.biodatachristopher;

import static com.example.biodatachristopher.R.id.textCetak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");
        String alamat = intent.getStringExtra("alamat");
        String umur = intent.getStringExtra("umur");
        String jk = intent.getStringExtra("jk");
        String kota = intent.getStringExtra("kota");

        String cetak = "Nama: " + nama + "\nAlamat: " + alamat + "\nUmur: " + umur + "\nJenis Kelamin: " + jk + "\nKota: " + kota;
        TextView textCetak = findViewById(R.id.textCetak);
        textCetak.setText(cetak);
    }
}