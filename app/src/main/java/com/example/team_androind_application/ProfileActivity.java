package com.example.team_androind_application;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton change_pas, change_num, pay, log_outer, prev_orders,listbutton, basketbutton, mainbutton, Info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        listbutton = (ImageButton) findViewById(R.id.ListButton);
        prev_orders = (ImageButton) findViewById(R.id.orders);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);
        change_pas = (ImageButton) findViewById(R.id.chng_paswd);
        change_num = (ImageButton) findViewById(R.id.chng_num);
        log_outer = (ImageButton) findViewById(R.id.log_out);
        Info = (ImageButton) findViewById(R.id.info);
        pay = (ImageButton) findViewById(R.id.paymer);

        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
        prev_orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, Orders.class);
                startActivity(intent);

            }
        });
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, payment.class);
                startActivity(intent);

            }
        });
        change_pas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, change_p.class);
                startActivity(intent);

            }
        });
        change_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, change_number.class);
                startActivity(intent);

            }
        });
        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, ListActivity.class);
                startActivity(intent);

            }
        });
        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, BasketActivity.class);
                startActivity(intent);

            }
        });
        log_outer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProfileActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }

}



