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

public class Activity_bilim extends AppCompatActivity {
    Button btnA2,btnB2,btnC2,btnD2,cevap2,bitti2;
    ImageButton geri2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilim);
        btnA2= (Button) findViewById(R.id.btnA2);
        btnB2= (Button) findViewById(R.id.btnB2);
        btnC2= (Button) findViewById(R.id.btnC2);
        btnD2= (Button) findViewById(R.id.btnD2);
        cevap2= (Button) findViewById(R.id.cevap2);
        bitti2= (Button) findViewById(R.id.bitti2);
        geri2= (ImageButton) this.<View>findViewById(R.id.geri2);

        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA2.setBackgroundColor(Color.RED);
            }
        });
        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB2.setBackgroundColor(Color.RED);
            }
        });
        btnC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC2.setBackgroundColor(Color.RED);
            }
        });
        btnD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD2.setBackgroundColor(Color.GREEN);
            }
        });
        cevap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP:D ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              askToClose();
            }
        });
        geri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });





    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_bilim.this);
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