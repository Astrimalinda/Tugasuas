package com.example.buahapp;
import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Angka4Activity extends AppCompatActivity {

    EditText editTextAngka4;
    Button bt_proses;
    TextView hasil;
    String benar = "tujuh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angka4);

        editTextAngka4= (EditText)findViewById(R.id.edt_angka4);
        bt_proses = (Button)findViewById(R.id.bt_proses_angka4);
        hasil = (TextView)findViewById(R.id.hasil_angka4);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextAngka4.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextAngka4.getText().toString(); //mengambil nilai dari editTextApel
                    if (jawaban.equals(benar)){ // membandingkat masukan dengan ketentuan benar  ".equals()" membandingkan nilai String yang tersimpan.
                        String keterangan = "Anda benar";
                        hasil.setText(keterangan);
                    }
                    else{
                        String keterangan = "Anda salah";
                        hasil.setText(keterangan);
                    }
                }

            }
        });
    }
}
