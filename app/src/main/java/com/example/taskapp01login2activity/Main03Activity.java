package com.example.taskapp01login2activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main03Activity extends AppCompatActivity {

    TextView linkCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main03);

        linkCreateAccount = findViewById(R.id.linkCreateAccount);

        linkCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Main03Activity.this, Main02Activity.class);

                startActivity(intent);
            }
        });
    }
}
