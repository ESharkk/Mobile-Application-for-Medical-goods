package com.example.team_androind_application.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.team_androind_application.BasketActivity;
import com.example.team_androind_application.Ibuprof_adult;
import com.example.team_androind_application.ListActivity;
import com.example.team_androind_application.MainActivity;
import com.example.team_androind_application.ProfileActivity;
import com.example.team_androind_application.R;

public class Kids_cold extends AppCompatActivity {

    private ImageButton profilebutton;
    private ImageButton listbutton;
    private ImageButton basketbutton;
    private ImageButton mainbutton;
    private ImageView ibu_but;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_cold);

        profilebutton = (ImageButton) findViewById(R.id.ProfileButton); listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton); mainbutton = (ImageButton) findViewById(R.id.HomeButton);
        ibu_but = (ImageView) findViewById(R.id.Allertec);

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids_cold.this, ProfileActivity.class);
                startActivity(intent);

            }
        });
        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids_cold.this, ListActivity.class);
                startActivity(intent);

            }
        });
        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids_cold.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids_cold.this, MainActivity.class);
                startActivity(intent);

            }
        });

        ibu_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids_cold.this, Ibuprof_adult.class);
                startActivity(intent);

            }
        });




    }

}
