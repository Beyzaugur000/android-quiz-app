package com.example.bilgi_yarismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kurallarActivity extends AppCompatActivity {
Button btn_basla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurallar);
        tanimlama();

        btn_basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anasayfa =new Intent(getApplicationContext(), com.example.bilgi_yarismasi.anasayfa.class);
                startActivity(anasayfa);
            }
        });




    }

    public void tanimlama (){
        btn_basla=findViewById(R.id.basla);
    }
}

