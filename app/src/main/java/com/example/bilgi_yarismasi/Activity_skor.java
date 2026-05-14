package com.example.bilgi_yarismasi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_skor extends AppCompatActivity {
int skor = 0;
TextView text2,text4,text6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);
        text2= (TextView)findViewById(R.id.text2);
        text4= (TextView)findViewById(R.id.text4);
        text6= (TextView)findViewById(R.id.text6);

    }


}