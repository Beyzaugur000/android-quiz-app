package com.example.bilgi_yarismasi;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_tarih extends AppCompatActivity {
    Button btnA3,btnB3,btnC3,btnD3,cevap3,bitti3;
    ImageButton geri3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarih);
        btnA3= (Button) findViewById(R.id.btnA3);
        btnB3= (Button) findViewById(R.id.btnB3);
        btnC3= (Button) findViewById(R.id.btnC3);
        btnD3= (Button) findViewById(R.id.btnD3);
        cevap3= (Button) findViewById(R.id.cevap3);
        bitti3= (Button) findViewById(R.id.bitti3);
        geri3= (ImageButton) this.<View>findViewById(R.id.geri3);

        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA3.setBackgroundColor(Color.GREEN);
            }
        });
        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB3.setBackgroundColor(Color.RED);
            }
        });
        btnC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC3.setBackgroundColor(Color.RED);
            }
        });
        btnD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD3.setBackgroundColor(Color.RED);
            }
        });
        cevap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP:A ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               askToClose();
            }
        });
        geri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });

    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_tarih.this);
        builder.setMessage("Oyunu bitirmek istiyor musun");
        builder.setCancelable(true);
        builder.setPositiveButton("EVET", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());

            }
        });
        builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}