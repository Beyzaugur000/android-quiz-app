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

public class Activity_sanat extends AppCompatActivity {
    Button btnA8, btnB8, btnC8, btnD8, cevap8, bitti8;
    ImageButton geri8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanat);
        btnA8 = (Button) findViewById(R.id.btnA8);
        btnB8 = (Button) findViewById(R.id.btnB8);
        btnC8 = (Button) findViewById(R.id.btnC8);
        btnD8 = (Button) findViewById(R.id.btnD8);
        cevap8 = (Button) findViewById(R.id.cevap8);
        bitti8 = (Button) findViewById(R.id.bitti8);
        geri8 = (ImageButton) this.<View>findViewById(R.id.geri8);

        btnA8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA8.setBackgroundColor(Color.RED);
            }
        });
        btnB8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnB8.setBackgroundColor(Color.GREEN);
            }
        });
        btnC8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC8.setBackgroundColor(Color.RED);
            }
        });
        btnD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD8.setBackgroundColor(Color.RED);
            }
        });
        cevap8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP: B ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askToClose();

            }
        });
        geri8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });
    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_sanat.this);
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