package com.example.team_androind_application.adults;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.team_androind_application.Adult_allergy;
import com.example.team_androind_application.Adult_cold;
import com.example.team_androind_application.Adult_eyes;
import com.example.team_androind_application.Adult_heart;
import com.example.team_androind_application.BasketActivity;
import com.example.team_androind_application.ListActivity;
import com.example.team_androind_application.MainActivity;
import com.example.team_androind_application.ProfileActivity;
import com.example.team_androind_application.R;
import com.example.team_androind_application.adult_pain;
import com.example.team_androind_application.adult_wound;

public class Adults extends AppCompatActivity {

    private ImageButton profilebutton;
    private ImageButton listbutton;
    private ImageButton basketbutton;
    private ImageButton mainbutton;
    private ImageButton allergy;
    private ImageButton cold;
    private ImageButton eyes;
    private ImageButton heart;
    private ImageButton pain;
    private ImageButton wound;
    private ImageButton backButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult);

        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);
        allergy = (ImageButton) findViewById(R.id.Allergy);
        eyes = (ImageButton) findViewById(R.id.Eyes);
        heart = (ImageButton) findViewById(R.id.Lice);
        pain = (ImageButton) findViewById(R.id.resistance);
        wound = (ImageButton) findViewById(R.id.Wounds);
        cold = (ImageButton) findViewById(R.id.Cold_flu);
        backButton = (ImageButton) findViewById(R.id.ButtonBack);

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, ListActivity.class);
                startActivity(intent);

            }
        });


        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, MainActivity.class);
                startActivity(intent);

            }
        });
        allergy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, Adult_allergy.class);
                startActivity(intent);

            }
        });
        cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, Adult_cold.class);
                startActivity(intent);

            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, ListActivity.class);
                startActivity(intent);

            }
        });

        eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, Adult_eyes.class);
                startActivity(intent);

            }
        });

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, Adult_heart.class);
                startActivity(intent);

            }
        });

        pain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, adult_pain.class);
                startActivity(intent);

            }
        });
        wound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Adults.this, adult_wound.class);
                startActivity(intent);

            }
        });


    }

}



