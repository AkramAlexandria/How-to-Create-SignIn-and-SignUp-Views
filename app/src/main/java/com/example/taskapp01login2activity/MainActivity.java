package com.example.taskapp01login2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnFacebook, btnTwitter, btnSignUp;
    TextView linkSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFacebook = findViewById(R.id.btnFacebook);
        btnTwitter = findViewById(R.id.btnTwitter);
        btnSignUp = findViewById(R.id.btnSignUp);
        linkSignIn = findViewById(R.id.linkSignIn);

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( MainActivity.this, Main02Activity.class);

                startActivity(intent);
            }
        });

        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( MainActivity.this, Main02Activity.class);

                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent( MainActivity.this, Main02Activity.class);

                startActivity(intent);
            }
        });

        linkSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main03Activity.class);

                startActivity(intent);
            }
        });
    }
}
