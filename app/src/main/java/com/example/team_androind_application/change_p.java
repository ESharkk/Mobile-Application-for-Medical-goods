package com.example.team_androind_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class change_p extends AppCompatActivity {
    private ImageButton profilebutton, listbutton, basketbutton, mainbutton;
    private EditText oldpassword, password, repassword;
    private Button change_p;
    private ImageButton backer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_p);


        oldpassword = (EditText) findViewById(R.id.oldpass);
        password = (EditText) findViewById(R.id.password1);
        repassword = (EditText) findViewById(R.id.password2);
        change_p = (Button) findViewById(R.id.change_passw);
        backer = (ImageButton) findViewById(R.id.ButtonBack);
        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);

        backer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_p.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_p.this, ListActivity.class);
                startActivity(intent);

            }
        });

        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_p.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_p.this, MainActivity.class);
                startActivity(intent);

            }
        });

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(change_p.this, MainActivity.class);
                startActivity(intent);

            }
        });

        change_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = oldpassword.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();
                if (user.equals("") || password.equals("") || repassword.equals(""))
                    Toast.makeText(change_p.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (pass.equals(repass)) {
                        Toast.makeText(change_p.this, "Successfully Changed Password!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(change_p.this, ProfileActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(change_p.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}