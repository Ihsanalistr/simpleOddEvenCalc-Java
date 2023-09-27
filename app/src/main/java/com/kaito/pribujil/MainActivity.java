package com.kaito.pribujil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText masukan = findViewById(R.id.txtInput);
        Button btn1 = findViewById(R.id.btnPrima);
        Button btn2 = findViewById(R.id.btnBulat);
        Button btn3 = findViewById(R.id.btnGanjil);
        TextView hasil = findViewById(R.id.txtHasil);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = Integer.parseInt(masukan.getText().toString());
                if (angka >= 2) {
                    hasil.setText("Bilangan tersebut adalah Prima");
                    for (int x = 2; x < angka; x++) {
                        if (angka % x == 0) {
                            hasil.setText("Bilangan tersebut bukan bilangan prima");
                            break;
                        }
                    }
                } else {
                    hasil.setText("Bilangan tersebut bukan bilangan prima");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = Integer.parseInt(masukan.getText().toString());
                if (angka >= 1) {
                    hasil.setText("Bilangan tersebut adalah bulat");
                } else {
                    hasil.setText("Bilangan tersebut bukan bilangan bulat");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka = Integer.parseInt(masukan.getText().toString());
                if (angka % 2 == 1) {
                    hasil.setText("Bilangan tersebut adalah ganjil");
                } else {
                    hasil.setText("Bilangan tersebut bukan bilangan ganjil");
                }
            }
        });

    }
}