package com.example.myassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText emailBox, passwordBox;
    Button loginBtn, signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        emailBox = findViewById(R.id.emailBox);
        passwordBox = findViewById(R.id.passwordBox);

        loginBtn=findViewById(R.id.loginbtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((emailBox.getText().toString()).equals("admin")&& (passwordBox.getText().toString()).equals("admin")){
                    Toast.makeText(MainActivity.this,"Logged In",Toast.LENGTH_SHORT).show();

                    startActivity(new Intent(MainActivity.this, CallActivity.class));


                } else{
                    Toast.makeText(MainActivity.this,"Incorrect Password",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}