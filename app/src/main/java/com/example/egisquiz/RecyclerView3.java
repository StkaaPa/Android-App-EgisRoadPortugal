package com.example.egisquiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class RecyclerView3 extends AppCompatActivity {

    //private androidx.recyclerview.widget.RecyclerView mRecyclerView;
    //private androidx.recyclerview.widget.RecyclerView.Adapter mAdapter;
    //private androidx.recyclerview.widget.RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view3);

        Button bt0 = findViewById(R.id.b0);
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in0 = new Intent(v.getContext(), Menu.class);
                startActivity(in0);
            }
        });

        Button bt1 = findViewById(R.id.b1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1 = new Intent(v.getContext(), capitulo1.class);
                startActivity(in1);
            }
        });

        Button bt2 = findViewById(R.id.b2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in2 = new Intent(v.getContext(), capitulo2.class);
                startActivity(in2);
            }
        });

        Button bt3 = findViewById(R.id.b3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(v.getContext(), capitulo3.class);
                startActivity(in3);
            }
        });

        Button bt4 = findViewById(R.id.b4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(v.getContext(), capitulo4.class);
                startActivity(in4);
            }
        });

        Button bt5 = findViewById(R.id.b5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in5 = new Intent(v.getContext(), capitulo5.class);
                startActivity(in5);
            }
        });

        Button bt6 = findViewById(R.id.b6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in6 = new Intent(v.getContext(), capitulo6.class);
                startActivity(in6);
            }
        });

        Button bt7 = findViewById(R.id.b7);
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in7 = new Intent(v.getContext(), capitulo7.class);
                startActivity(in7);
            }
        });

        Button bt8 = findViewById(R.id.b8);
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in8 = new Intent(v.getContext(), capitulo8.class);
                startActivity(in8);
            }
        });

        Button bt9 = findViewById(R.id.b9);
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in9 = new Intent(v.getContext(), capitulo9.class);
                startActivity(in9);
            }
        });

        Button bt10 = findViewById(R.id.b10);
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in10 = new Intent(v.getContext(), capitulo10.class);
                startActivity(in10);
            }
        });

       /* ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.cap1, "REALIZAÇÃO DOS TRABALHOS NA A24"));
        exampleList.add(new ExampleItem(R.drawable.cap2, "CAUSAS DE ACIDENTES QUE PODEM DAR ORIGEM A DANOS"));
        exampleList.add(new ExampleItem(R.drawable.cap3, "CONDUÇÃO NA A24"));
        exampleList.add(new ExampleItem(R.drawable.cap4, "MANOBRAS E ESTACIONAMENTO DE VEÍCULOS E MÁQUINAS"));
        exampleList.add(new ExampleItem(R.drawable.cap5, "SUBIDA E DESCIDA DE VEÍCULOS"));
        exampleList.add(new ExampleItem(R.drawable.cap6, "CIRCULAR A PÉ NA AUTOESTRADA"));
        exampleList.add(new ExampleItem(R.drawable.cap7, "TRANSPORTE DE PESSOAL"));
        exampleList.add(new ExampleItem(R.drawable.cap8, "SINALIZAÇÃO"));
        exampleList.add(new ExampleItem(R.drawable.cap9, "PASSAGEM SOB TENSÃO: LINHAS E CONDUTAS"));
        exampleList.add(new ExampleItem(R.drawable.cap10, "ESTATÍSTICAS E CASOS REAIS"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);


        Intent in2 = new Intent(this, NaoSei.class);
        startActivity(in2);*/

    }
}
