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

public class Activity_teknoloji extends AppCompatActivity {
    Button btnA5,btnB5,btnC5,btnD5, cevap5,bitti5;
    ImageButton geri5;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teknoloji);
        btnA5= (Button) findViewById(R.id.btnA5);
        btnB5= (Button) findViewById(R.id.btnB5);
        btnC5= (Button) findViewById(R.id.btnC5);
        btnD5= (Button) findViewById(R.id.btnD5);
        cevap5 = (Button) findViewById(R.id.cevap5);
        bitti5= (Button) findViewById(R.id.bitti5);
        geri5= (ImageButton) this.<View>findViewById(R.id.geri5);

        btnA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA5.setBackgroundColor(Color.RED);
            }
        });
        btnB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB5.setBackgroundColor(Color.RED);
            }
        });
        btnC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC5.setBackgroundColor(Color.GREEN);
            }
        });
        btnD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD5.setBackgroundColor(Color.RED);
            }
        });
        cevap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP: C ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               askToClose();
            }
        });
        geri5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });
    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_teknoloji.this);
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