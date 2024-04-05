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

public class change_number extends AppCompatActivity {
    private ImageButton profilebutton, listbutton, basketbutton, mainbutton;
    private EditText number;
    private Button change_n;
    private ImageButton backer;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_number);


        number = (EditText) findViewById(R.id.Phone_num);
        change_n = (Button) findViewById(R.id.change_num);
        backer = (ImageButton) findViewById(R.id.ButtonBack);
        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);

        backer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_number.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_number.this, ListActivity.class);
                startActivity(intent);

            }
        });


        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_number.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_number.this, MainActivity.class);
                startActivity(intent);

            }
        });

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_number.this, MainActivity.class);
                startActivity(intent);

            }
        });

        change_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value= number.getText().toString();
                if (value.equals(""))
                    Toast.makeText(change_number.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(change_number.this, "SMS is sent", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(change_number.this, confirm_sms.class);
                    startActivity(intent);

                }
            }
        });
    }
}