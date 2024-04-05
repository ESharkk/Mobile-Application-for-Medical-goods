package com.example.team_androind_application;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import de.hdodenhof.circleimageview.CircleImageView;

public class adult_pain extends AppCompatActivity {

    private ImageButton profilebutton;
    private ImageButton listbutton;
    private ImageButton basketbutton;
    private ImageButton main;
    private CircleImageView ibu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adult_pain);

        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        main = (ImageButton) findViewById(R.id.HomeButton);
        ibu = (CircleImageView) findViewById(R.id.Allertec);

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adult_pain.this, ProfileActivity.class);
                startActivity(intent);

            }
        });
        ibu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adult_pain.this, Ibuprof_adult.class);
                startActivity(intent);

            }
        });
        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adult_pain.this, ListActivity.class);
                startActivity(intent);

            }
        });
        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adult_pain.this, BasketActivity.class);
                startActivity(intent);

            }
        });
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adult_pain.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

}



