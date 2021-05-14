package com.example.egisquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Visitantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitantes);

        Button btn_vst_menu = findViewById(R.id.btn_vst_menu);
        btn_vst_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmenu = new Intent(v.getContext(), Menu.class);
                startActivity(intmenu);
            }
        });

    }
}
