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

public class confirm_sms extends AppCompatActivity {
    private ImageButton profilebutton, listbutton, basketbutton, mainbutton;
    private EditText code;
    private Button confirmer;
    private ImageButton backer;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_sms);


        code = (EditText) findViewById(R.id.confirmation);
        confirmer = (Button) findViewById(R.id.confirm);
        backer = (ImageButton) findViewById(R.id.ButtonBack);
        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);

        backer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_sms.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_sms.this, ListActivity.class);
                startActivity(intent);

            }
        });


        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_sms.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_sms.this, MainActivity.class);
                startActivity(intent);

            }
        });

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(confirm_sms.this, MainActivity.class);
                startActivity(intent);

            }
        });

        confirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value= code.getText().toString();
                if (value.equals(""))
                    Toast.makeText(confirm_sms.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(confirm_sms.this, "SMS is confirmed", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(confirm_sms.this, ProfileActivity.class);
                    startActivity(intent);

                }
            }
        });
    }
}