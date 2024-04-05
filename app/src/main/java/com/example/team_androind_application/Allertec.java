package com.example.team_androind_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.team_androind_application.kids.Kids_allergy;

public class Allertec extends AppCompatActivity {
    Button cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allertec);

        cart = (Button)findViewById(R.id.addToCartButton);

        cart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Toast.makeText(Allertec.this, "Added to Cart!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Kids_allergy.class);
                startActivity(intent);
            }
        });


    }


}