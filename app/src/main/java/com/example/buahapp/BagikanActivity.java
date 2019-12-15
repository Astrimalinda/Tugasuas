package com.example.buahapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class BagikanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagikan);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Bagikan Aplikasi Tebak Pintar");
        intent.putExtra(Intent.EXTRA_TEXT, "Saya sedang menggunakan Aplikasi Tebak Pintar ayo bagikan aplikasi ini!");

        startActivity(intent);

    }
}
