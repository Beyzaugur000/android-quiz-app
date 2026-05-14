package com.example.bilgi_yarismasi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button btn_devam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimlama();

        btn_devam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kurallar=new Intent(getApplicationContext(), kurallarActivity.class);
                startActivity(kurallar);
            }
        });




    }

    public void tanimlama (){
        btn_devam=findViewById(R.id.devam);
    }
}