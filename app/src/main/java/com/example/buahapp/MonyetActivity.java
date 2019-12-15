package com.example.buahapp;
import androidx.annotation.StringDef;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MonyetActivity extends AppCompatActivity {

    EditText editTextMonyet;
    Button bt_proses;
    TextView hasil;
    String benar = "monyet";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monyet);

        editTextMonyet = (EditText)findViewById(R.id.edt_hewan_monyet);
        bt_proses = (Button)findViewById(R.id.bt_proses_monyet);
        hasil = (TextView)findViewById(R.id.hasil_monyet);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextMonyet.length()==0){
                    Toast.makeText(getApplicationContext(),"Masukkan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); //jika masukan kosong
                }
                else {
                    String jawaban = editTextMonyet.getText().toString(); //mengambil nilai dari editTextAlpukat
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
