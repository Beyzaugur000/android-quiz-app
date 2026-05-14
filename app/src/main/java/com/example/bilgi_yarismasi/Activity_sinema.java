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

public class Activity_sinema extends AppCompatActivity {

    Button btnA6, btnB6,btnC6, btnD6, cevap6, bitti6;
    ImageButton geri6;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinema);
        btnA6= (Button) findViewById(R.id.btnA6);
        btnB6 = (Button) findViewById(R.id.btnB6);
        btnC6= (Button) findViewById(R.id.btnC6);
        btnD6 = (Button) findViewById(R.id.btnD6);
        cevap6 = (Button) findViewById(R.id.cevap6);
        bitti6 = (Button) findViewById(R.id.bitti6);
        geri6 = (ImageButton) this.<View>findViewById(R.id.geri6);

        btnA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA6.setBackgroundColor(Color.GREEN);
            }
        });
        btnB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB6.setBackgroundColor(Color.RED);
            }
        });
        btnC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC6.setBackgroundColor(Color.RED);
            }
        });
        btnD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD6.setBackgroundColor(Color.RED);
            }
        });
        cevap6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP: A ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askToClose();
            }
        });
        geri6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });
    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_sinema.this);
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