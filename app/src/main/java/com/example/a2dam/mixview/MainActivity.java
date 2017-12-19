package com.example.a2dam.mixview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Element> Hotels;
    Fragment fragmentRecycler;
    Button boton;
    FragmentTransaction ft;
    FragmentManager fm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton=(Button) findViewById(R.id.boton);




        Hotels = new ArrayList<Element>();

        Hotels.add(new Element("Blue Hill", "C/ Rei En Jaume 1 45645 Catarroja, Valencia", 4.5f, 25.5f, R.mipmap.hotel1 ));
        Hotels.add(new Element("Per Se", "C/ Rei En Jaume 1, 2, 45645 Catarroja, Valencia", 3.5f, 43.5f, R.mipmap.hotel2 ));
        Hotels.add(new Element("Gramercy", "C/ Rei En Jaume 1, 45645 Catarroja, Valencia", 5f, 33f, R.mipmap.hotel3 ));


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fm = getSupportFragmentManager();
                ft = fm.beginTransaction();

                fragmentRecycler = FragmentRecycler.newInstance(Hotels);


                ft.add(R.id.areaFragment,fragmentRecycler);
                ft.commit();

            }
        });




    }
}
