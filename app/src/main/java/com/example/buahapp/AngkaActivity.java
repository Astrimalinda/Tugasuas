package com.example.buahapp;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class AngkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka);
    }

    public void bt_tebak_buah(View view) {
        Toast.makeText(AngkaActivity.this,"Tebak Pintar",Toast.LENGTH_SHORT).show();
    }

    public void bt_angka1(View view) {
        Intent i = new Intent(AngkaActivity.this,Angka1Activity.class);
        startActivity(i);
    }

    public void bt_angka2(View view) {
        Intent i = new Intent(AngkaActivity.this,Angka2Activity.class);
        startActivity(i);
    }

    public void bt_angka3(View view) {
        Intent i = new Intent(AngkaActivity.this,Angka3Activity.class);
        startActivity(i);
    }

    public void bt_angka4(View view) {
        Intent i = new Intent(AngkaActivity.this,Angka4Activity.class);
        startActivity(i); }

}