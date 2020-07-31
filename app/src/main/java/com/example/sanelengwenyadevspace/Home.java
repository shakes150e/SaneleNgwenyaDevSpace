package com.example.sanelengwenyadevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        text = findViewById(R.id.text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onUserLeaveHint();
            }
        });
    }

    @Override
    protected void onUserLeaveHint() {
        text.setText(R.string.HomeButtonPressed);
        Toast.makeText(Home.this,"Home button pressed", Toast.LENGTH_LONG).show();
        super.onUserLeaveHint();
    }
}