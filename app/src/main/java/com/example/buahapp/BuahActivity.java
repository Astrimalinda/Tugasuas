package com.example.buahapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class BuahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);
    }

    public void bt_tebak_buah(View view) {
        Toast.makeText(BuahActivity.this,"Tebak Pintar",Toast.LENGTH_SHORT).show();
    }

    public void bt_alpukat(View view) {
        Intent i = new Intent(BuahActivity.this,AlpukatActivity.class);
        startActivity(i);
    }

    public void bt_apel(View view) {
        Intent i = new Intent(BuahActivity.this,ApelActivity.class);
        startActivity(i);
    }

    public void bt_ceri(View view) {
        Intent i = new Intent(BuahActivity.this,CeriActivity.class);
        startActivity(i);
    }

    public void bt_durian(View view) {
        Intent i = new Intent(BuahActivity.this,DurianApp.class);
        startActivity(i);

    }
    public void bt_jambu(View view) {
        Intent i = new Intent(BuahActivity.this, JambuAirActivity.class);
        startActivity(i);
    }
    public void bt_manggis(View view) {
        Intent i = new Intent(BuahActivity.this, ManggisActivity.class);
        startActivity(i);
    }
    public void bt_strawberry(View view) {
        Intent i = new Intent(BuahActivity.this, StrawberryActivity.class);
        startActivity(i);
    }

}