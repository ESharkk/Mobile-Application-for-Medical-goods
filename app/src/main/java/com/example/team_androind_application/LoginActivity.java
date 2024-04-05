package com.example.team_androind_application;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button btnlogin, signup;
    DBHelper DB;
    private ImageButton back;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsignin1);
        signup = (Button) findViewById(R.id.btn_sign_up);
        back = (ImageButton)findViewById(R.id.ButtonBack);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, sign_in.class);
                startActivity(intent);
                finish();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user =username.getText().toString();
                String pass = password.getText().toString();

                String generatedPassword = null;
                try {
                    MessageDigest md = MessageDigest.getInstance("MD5");
                    String salt = "salt";
                    md.update(salt.getBytes());
                    byte[] bytes = md.digest(pass.getBytes());
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < bytes.length; i++) {
                        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                    }
                    generatedPassword = sb.toString();
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }

                if (user.equals("") || pass.equals("")){
                    Toast.makeText(LoginActivity.this, "Please enter all the fields!", Toast.LENGTH_SHORT).show();
                }
                else{
                    boolean checkuserpass = DB.checkusernamepassword(user,generatedPassword);
                    if (checkuserpass == true ){
                        Toast.makeText(LoginActivity.this, "Succesfully signed in!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity.this, "Invalid credentials!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}