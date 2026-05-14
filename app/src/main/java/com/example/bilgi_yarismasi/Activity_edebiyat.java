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

public class Activity_edebiyat extends AppCompatActivity {
    Button btnA4,btnB4,btnC4,btnD4,cevap4,bitti4;
    ImageButton geri4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edebiyat);
        btnA4= (Button) findViewById(R.id.btnA4);
        btnB4= (Button) findViewById(R.id.btnB4);
        btnC4= (Button) findViewById(R.id.btnC4);
        btnD4= (Button) findViewById(R.id.btnD4);
        cevap4= (Button) findViewById(R.id.cevap4);
        bitti4= (Button) findViewById(R.id.bitti4);
        geri4= (ImageButton) this.<View>findViewById(R.id.geri4);

        btnA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA4.setBackgroundColor(Color.RED);
            }
        });
        btnB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB4.setBackgroundColor(Color.RED);
            }
        });
        btnC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC4.setBackgroundColor(Color.RED);
            }
        });
        btnD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD4.setBackgroundColor(Color.GREEN);
            }
        });
        cevap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP:D ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               askToClose();
            }
        });
        geri4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });
    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_edebiyat.this);
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