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

public class Activity_matematik extends AppCompatActivity {
    Button btnA9, btnB9, btnC9,btnD9, cevap9, bitti9;
    ImageButton geri9;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematik);
        btnA9 = (Button) findViewById(R.id.btnA9);
        btnB9 = (Button) findViewById(R.id.btnB9);
        btnC9 = (Button) findViewById(R.id.btnC9);
        btnD9= (Button) findViewById(R.id.btnD9);
        cevap9 = (Button) findViewById(R.id.cevap9);
        bitti9 = (Button) findViewById(R.id.bitti9);
        geri9 = (ImageButton) this.<View>findViewById(R.id.geri9);





        btnA9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA9.setBackgroundColor(Color.GREEN);
            }
        });
        btnB9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB9.setBackgroundColor(Color.RED);
            }
        });
        btnC9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC9.setBackgroundColor(Color.RED);
            }
        });
        btnD9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD9.setBackgroundColor(Color.RED);
            }
        });
        cevap9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP:A ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               askToClose();
            }
        });
        geri9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });

    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_matematik.this);
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