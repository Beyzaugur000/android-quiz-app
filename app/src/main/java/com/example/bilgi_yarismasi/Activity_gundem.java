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

public class Activity_gundem extends AppCompatActivity {

    Button btnA10, btnB10, btnC10, btnD10, cevap10, bitti10;
    ImageButton geri10;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gundem);
        btnA10 = (Button) findViewById(R.id.btnA10);
        btnB10 = (Button) findViewById(R.id.btnB10);
        btnC10 = (Button) findViewById(R.id.btnC10);
        btnD10 = (Button) findViewById(R.id.btnD10);
        cevap10 = (Button) findViewById(R.id.cevap10);
        bitti10 = (Button) findViewById(R.id.bitti10);
        geri10 = (ImageButton) this.<View>findViewById(R.id.geri10);





        btnA10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA10.setBackgroundColor(Color.RED);
            }
        });
        btnB10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB10.setBackgroundColor(Color.RED);
            }
        });
        btnC10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC10.setBackgroundColor(Color.GREEN);
            }
        });
        btnD10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD10.setBackgroundColor(Color.RED);
            }
        });
        cevap10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP:C ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               askToClose();

            }
        });
        geri10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });

    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_gundem.this);
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