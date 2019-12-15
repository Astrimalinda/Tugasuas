package com.example.buahapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindah = (Button) findViewById(R.id.tebak_buah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BuahActivity.class);
                startActivity(intent);

            }
        });

        pindah = (Button) findViewById(R.id.tebak_hewan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HewanActivity.class);
                startActivity(intent);

            }
        });

        pindah = (Button) findViewById(R.id.tebak_angka);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AngkaActivity.class);
                startActivity(intent);

            }
        });


        pindah = (Button) findViewById(R.id.belajar_buah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BelajarBuahActivity.class);
                startActivity(intent);

            }
        });

        pindah = (Button) findViewById(R.id.belajar_hewan);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BelajarHewanActivity.class);
                startActivity(intent);

            }
        });

        pindah = (Button) findViewById(R.id.belajar_angka);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BelajarAngkaActivity.class);
                startActivity(intent);

            }
        });

        pindah = (Button) findViewById(R.id.bagikan_app);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BagikanActivity.class);
                startActivity(intent);

            }
        });




    }
}