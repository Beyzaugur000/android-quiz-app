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

public class Activity_muzik extends AppCompatActivity {
Button btnA1,btnB1,btnC1,btnD1,cevap1,bitti1;
ImageButton geri1;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muzik);
        btnA1= (Button) findViewById(R.id.btnA1);
        btnB1= (Button) findViewById(R.id.btnB1);
        btnC1= (Button) findViewById(R.id.btnC1);
        btnD1= (Button) findViewById(R.id.btnD1);
       cevap1= (Button) findViewById(R.id.cevap1);
        bitti1= (Button) findViewById(R.id.bitti1);
        geri1= (ImageButton) this.<View>findViewById(R.id.geri1);




        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnA1.setBackgroundColor(Color.RED);
            }
        });
        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { btnB1.setBackgroundColor(Color.GREEN);}
        });
        btnC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnC1.setBackgroundColor(Color.RED);
            }
        });
        btnD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnD1.setBackgroundColor(Color.RED);
            }
        });
        cevap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DOĞRU CEVAP:B ŞIKKI",Toast.LENGTH_LONG).show();
            }
        });
        bitti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  askToClose();
            }
        });
        geri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kategori=new Intent(getApplicationContext(), anasayfa.class);
                startActivity(kategori);

            }
        });



    }

    private void askToClose() {
        AlertDialog.Builder builder = new AlertDialog.Builder(Activity_muzik.this);
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