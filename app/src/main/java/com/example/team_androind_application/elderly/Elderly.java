package com.example.team_androind_application.elderly;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.team_androind_application.BasketActivity;
import com.example.team_androind_application.Elderly_appetite;
import com.example.team_androind_application.Elderly_cold;
import com.example.team_androind_application.Elderly_hygiene;
import com.example.team_androind_application.Elderly_lice;
import com.example.team_androind_application.Elderly_resistance;
import com.example.team_androind_application.Elderly_tonic;
import com.example.team_androind_application.ListActivity;
import com.example.team_androind_application.MainActivity;
import com.example.team_androind_application.ProfileActivity;
import com.example.team_androind_application.R;

public class Elderly extends AppCompatActivity {

    private ImageButton profilebutton;
    private ImageButton listbutton;
    private ImageButton basketbutton;
    private ImageButton mainbutton;
    private ImageButton appet;
    private ImageButton cold;
    private ImageButton hygiene, lice, resistance, tonic;
    private ImageButton backButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elderly);

        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);
        appet = (ImageButton) findViewById(R.id.Appetite_eld);
        hygiene = (ImageButton) findViewById(R.id.Hygiene);
        cold = (ImageButton) findViewById(R.id.Cold_flu);
        tonic = (ImageButton) findViewById(R.id.Sterngth);
        lice = (ImageButton) findViewById(R.id.Lice);
        resistance = (ImageButton) findViewById(R.id.resistance);
        backButton = (ImageButton) findViewById(R.id.ButtonBack);

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, ListActivity.class);
                startActivity(intent);

            }
        });


        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, MainActivity.class);
                startActivity(intent);

            }
        });

        appet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, Elderly_appetite.class);
                startActivity(intent);

            }
        });


        hygiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, Elderly_hygiene.class);
                startActivity(intent);

            }
        });
        cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, Elderly_cold.class);
                startActivity(intent);

            }
        });

        tonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, Elderly_tonic.class);
                startActivity(intent);

            }
        });
        lice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, Elderly_lice.class);
                startActivity(intent);

            }
        });
        resistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, Elderly_resistance.class);
                startActivity(intent);

            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Elderly.this, ListActivity.class);
                startActivity(intent);

            }
        });


    }

}



