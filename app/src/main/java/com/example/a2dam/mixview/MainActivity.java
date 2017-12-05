package com.example.a2dam.mixview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Element> Hotels;
    RecyclerView rvListaHotels;
    RecyclerView.LayoutManager rvLM;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListaHotels = (RecyclerView)findViewById(R.id.lista);

        Hotels = new ArrayList<Element>();

        Hotels.add(new Element("Blue Hill", "C/ Rei En Jaume 1 45645 Catarroja, Valencia", 4.5f, 25.5f, R.mipmap.hotel1 ));
        Hotels.add(new Element("Per Se", "C/ Rei En Jaume 1, 2, 45645 Catarroja, Valencia", 3.5f, 43.5f, R.mipmap.hotel2 ));
        Hotels.add(new Element("Gramercy", "C/ Rei En Jaume 1, 45645 Catarroja, Valencia", 5f, 33f, R.mipmap.hotel3 ));


        rvLM = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        rvListaHotels.setLayoutManager(rvLM);

        adaptador=new Adaptador(Hotels);

        rvListaHotels.setAdapter(adaptador);



    }
}
