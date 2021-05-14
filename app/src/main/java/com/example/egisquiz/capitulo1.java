package com.example.egisquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class capitulo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulo1);

        Button btnindice = findViewById(R.id.btnindice);
        btnindice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in3 = new Intent(v.getContext(), RecyclerView3.class);
                startActivity(in3);
            }
        });

        Button btncap2 = findViewById(R.id.btncap2);
        btncap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in4 = new Intent(v.getContext(), capitulo2.class);
                startActivity(in4);
            }
        });

    }

}
