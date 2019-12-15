package com.example.buahapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class HewanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);
    }

    public void bt_tebak_hewan(View view) {
        Toast.makeText(HewanActivity.this, "Tebak Pintar", Toast.LENGTH_SHORT).show();
    }

    public void bt_lebah(View view) {
        Intent i = new Intent(HewanActivity.this, LebahActivity.class);
        startActivity(i);
    }

    public void bt_ikan(View view) {
        Intent i = new Intent(HewanActivity.this, IkanActivity.class);
        startActivity(i);
    }

    public void bt_monyet(View view) {
        Intent i = new Intent(HewanActivity.this, MonyetActivity.class);
        startActivity(i);
    }

    public void bt_singa(View view) {
        Intent i = new Intent(HewanActivity.this, SingaActivity.class);
        startActivity(i);

    }

}