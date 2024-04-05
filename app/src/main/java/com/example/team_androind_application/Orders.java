package com.example.team_androind_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Orders extends AppCompatActivity {
    private ImageButton profilebutton, listbutton, basketbutton, mainbutton;
    private ImageButton backer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        backer = (ImageButton) findViewById(R.id.ButtonBack);
        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);

        backer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, ProfileActivity.class);
                startActivity(intent);

            }
        });
        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, ListActivity.class);
                startActivity(intent);

            }
        });
        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, BasketActivity.class);
                startActivity(intent);

            }
        });
        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, MainActivity.class);
                startActivity(intent);

            }
        });
        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Orders.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
