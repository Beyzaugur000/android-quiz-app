package com.example.bilgi_yarismasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Kategori_adapter extends ArrayAdapter<String> {
    private String[] kategori;
    private int[] resimler;
    public Context context;
    private TextView katisim;
    private ImageView katresim;



    public Kategori_adapter(String[] kategori,int[] resimler,Context context) {
        super(context, R.layout.kategoriler_list, kategori);
        this.kategori = kategori;
        this.resimler = resimler;
        this.context = context;


    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.kategoriler_list,null);

      if (view != null) {
          katisim=(TextView) view.findViewById(R.id.kategoriler_list_textView);
          katresim=(ImageView) view.findViewById(R.id.kategoriler_list_imageView);

         katresim.setBackgroundResource(resimler[position]);
         katisim.setText(String.valueOf(kategori[position]));



      }
        return view;

    }
}
