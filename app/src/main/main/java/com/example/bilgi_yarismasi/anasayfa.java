package com.example.bilgi_yarismasi;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class anasayfa extends AppCompatActivity {

    private ListView alistview;
    String[] kategori = {"Müzik", "Bilim", "Tarih", "Edebiyat", "Teknoloji", "Sinema", "Coğrafya", "Sanat", "Matematik", "Gündem"};
    private int[] resimler = {R.drawable.muzik, R.drawable.bilim, R.drawable.tarih, R.drawable.edebiyat, R.drawable.teklonoji, R.drawable.sinema, R.drawable.cografya, R.drawable.sanat, R.drawable.matematik, R.drawable.gundem};

    int skore=0;
    int cevaplananskor=0;
    String derece;
    private Kategori_adapter adapter;
    Button btnskor;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        alistview = (ListView) findViewById(R.id.activity_anasayfa_listview);
        btnskor = (Button) findViewById(R.id.btnskor);
        adapter = new Kategori_adapter(kategori, resimler, this);
        alistview.setAdapter(adapter);


        alistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                cevaplananskor = +1;
                if (position == 0) {

                    Intent intent = new Intent(view.getContext(), Activity_muzik.class);
                    startActivity(intent);

                }
                if (position == 1) {

                    Intent intent = new Intent(view.getContext(), Activity_bilim.class);
                    startActivity(intent);

                }
                if (position == 2) {

                    Intent intent = new Intent(view.getContext(), Activity_tarih.class);
                    startActivity(intent);

                }
                if (position == 3) {

                    Intent intent = new Intent(view.getContext(), Activity_edebiyat.class);
                    startActivity(intent);

                }
                if (position == 4) {

                    Intent intent = new Intent(view.getContext(), Activity_teknoloji.class);
                    startActivity(intent);


                }
                if (position == 5) {

                    Intent intent = new Intent(view.getContext(), Activity_sinema.class);
                    startActivity(intent);


                }
                if (position == 6) {

                    Intent intent = new Intent(view.getContext(), Activity_cografya.class);
                    startActivity(intent);


                }
                if (position == 7) {

                    Intent intent = new Intent(view.getContext(), Activity_sanat.class);
                    startActivity(intent);


                }
                if (position == 8) {

                    Intent intent = new Intent(view.getContext(), Activity_matematik.class);
                    startActivity(intent);


                }
                if (position == 9) {

                    Intent intent = new Intent(view.getContext(), Activity_gundem.class);
                    startActivity(intent);


                }


            }
        });

        if (btnskor != null) {
            btnskor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    skor();
                }

            });


        }
    }

    private void skor() {

            AlertDialog.Builder builder = new AlertDialog.Builder(anasayfa.this);
            builder.setMessage("SKOR:"+skore+"\n Cevaplanan soru:"+cevaplananskor+"\nDERECE:"+derece);
            builder.setCancelable(true);
            builder.setNegativeButton("KAPAT", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {

                   dialog.cancel();

                }
            });
            AlertDialog alert = builder.create();
            alert.show();

        }

    }




