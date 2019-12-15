package com.example.buahapp;
import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LebahActivity extends AppCompatActivity {

    EditText editTextLebah;
    Button bt_proses;
    TextView hasil;
    String benar = "Jerapah";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lebah);

        editTextLebah = (EditText)findViewById(R.id.edt_hewan_lebah);
        bt_proses = (Button)findViewById(R.id.bt_proses_lebah);
        hasil = (TextView)findViewById(R.id.hasil_lebah);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextLebah.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextLebah.getText().toString(); //mengambil nilai dari editTextAlpukat
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
