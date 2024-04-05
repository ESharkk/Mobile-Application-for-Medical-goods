package com.example.team_androind_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class BasketActivity extends AppCompatActivity {

    private ImageButton profilebutton,listbutton, mainbutton, delete1, delete3, delete2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket2);

        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        delete1 = (ImageButton) findViewById(R.id.Delete1);
        delete2 = (ImageButton) findViewById(R.id.Delete2);
        delete3 = (ImageButton) findViewById(R.id.Delete3);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasketActivity.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasketActivity.this, ListActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasketActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        delete3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BasketActivity.this, orofar_deleted.class);
                startActivity(intent);

            }
        });


    }

}



