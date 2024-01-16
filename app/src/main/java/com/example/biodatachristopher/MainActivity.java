package com.example.biodatachristopher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.biodatachristopher.R;

public class MainActivity extends AppCompatActivity {

    private EditText ETnama, ETalamat, ETumur;
    private TextView textCetak;
    private RadioGroup pilih_jk;
    private Spinner SPkota;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETnama = findViewById(R.id.ETnama);
        ETalamat = findViewById(R.id.ETalamat);
        ETumur = findViewById(R.id.ETumur);
        textCetak = findViewById(R.id.textCetak);
        pilih_jk = findViewById(R.id.pilih_jk);
        SPkota = findViewById(R.id.SPkota);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = ETnama.getText().toString();
                String alamat = ETalamat.getText().toString();
                String umur = ETumur.getText().toString();
                String kota = SPkota.getSelectedItem().toString();
                int selectedId = pilih_jk.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(selectedId);
                String jk = radioButton.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("nama", nama);
                intent.putExtra("alamat", alamat);
                intent.putExtra("umur", umur);
                intent.putExtra("jk", jk);
                intent.putExtra("kota", kota);
                startActivity(intent);
            }
        });

    }
}
