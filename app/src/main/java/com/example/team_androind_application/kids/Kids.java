package com.example.team_androind_application.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.team_androind_application.BasketActivity;
import com.example.team_androind_application.ListActivity;
import com.example.team_androind_application.MainActivity;
import com.example.team_androind_application.ProfileActivity;
import com.example.team_androind_application.R;

public class Kids extends AppCompatActivity {

    private ImageButton profilebutton;
    private ImageButton listbutton;
    private ImageButton basketbutton;
    private ImageButton mainbutton;
    private ImageButton Appetite;
    private ImageButton Aller;
    private ImageButton Cold;
    private ImageButton Concer;
    private ImageButton Lice;
    private ImageButton Resistan;
    private ImageButton buttonBack;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);

        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);
        Appetite = (ImageButton) findViewById(R.id.Appetite);
        Aller = (ImageButton) findViewById(R.id.Allergy);
        Cold = (ImageButton) findViewById(R.id.Cold_flu);
        Concer = (ImageButton) findViewById(R.id.Eyes);
        Lice = (ImageButton) findViewById(R.id.Lice);
        Resistan = (ImageButton) findViewById(R.id.resistance);
        buttonBack = (ImageButton) findViewById(R.id.ButtonBack);

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, ListActivity.class);
                startActivity(intent);

            }
        });


        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, MainActivity.class);
                startActivity(intent);

            }
        });
        Appetite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, Kids_appetite.class);
                startActivity(intent);

            }
        });
        Aller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, Kids_allergy.class);
                startActivity(intent);

            }
        });
        Cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, Kids_cold.class);
                startActivity(intent);

            }
        });

        Resistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, Kids_appetite.class);
                startActivity(intent);

            }
        });
        Concer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, Kids_allergy.class);
                startActivity(intent);

            }
        });
        Lice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, Kids_cold.class);
                startActivity(intent);

            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, ListActivity.class);
                startActivity(intent);

            }
        });


    }

}



