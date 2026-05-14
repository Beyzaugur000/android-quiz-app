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

public class Activity_cografya extends AppCompatActivity {
    Button btnA7, btnB7,btnC7, btnD7, cevap7, bitti7;
    ImageButton geri7;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cografya);
        btnA7= (Button) findViewById(R.id.btnA7);
        btnB7 = (Button) findViewById(R.id.btnB7);
        btnC7= (Button) findViewById(R.id.btnC7);
        btnD7 = (Button) findViewById(R.id.btnD7);
        cevap7 = (Button) findViewById(R.id.cevap7);
        bitti7 = (Button) findViewById(R.id.bitti7);
        geri7= (ImageButton) this.<View>findViewById(R.id.geri7);

        btnA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA7.setBackgroundColor(Color.GREEN);
            }
        });
        btnB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB7.setBackgroundColor(Color.RED);
            }
        });
        btnC7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC7.setBackgroundColor(Color.RED);
            }
        });
        btnD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD7.setBackgroundColor(Color.RED);
            }
        });
        cevap7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP: A ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             askToClose();
            }
        });
        geri7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });
    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_cografya.this);
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