package com.example.buahapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class BelajarHewanActivity extends AppCompatActivity {

    ListView listView;
    String mTitle[] = { //nama hewan
            "Burung",
            "Gajah",
            "Lebah",
            "Jerapah",
            "Ikan",
            "Kucing",
            "Ayam",
            "Anjing",
            "Monyet",
            "Singa",
            "Semut"
    };

    String mDescription[] = {
            "Bird", //nama buat dalam english
            "Elephant",
            "Bee",
            "Giraffe",
            "Fish",
            "Cat",
            "Chicken",
            "Dog",
            "Mongkey",
            "Lion",
            "Ant"
    };
    int images[] = {
            R.drawable.burung,
            R.drawable.elphant,
            R.drawable.lebah,
            R.drawable.jerapah,
            R.drawable.ikan,
            R.drawable.kucing,
            R.drawable.ayam,
            R.drawable.anjing,
            R.drawable.monyet,
            R.drawable.singa,
            R.drawable.semut
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_buah);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[],String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent,false);
            ImageView images = row.findViewById(R.id.destinasi1);
            TextView myTitle = row.findViewById((R.id.textView1));
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
