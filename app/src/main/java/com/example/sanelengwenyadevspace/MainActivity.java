package com.example.sanelengwenyadevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<visitorsName> extends AppCompatActivity {

    TextView textView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView visitorsName = (TextView) findViewById(R.id.textView);
        EditText next = (EditText) findViewById(R.id.etNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this,
                        MainMenu.class);
                startActivity(myIntent);

            }
        });
    }

    public void openMainMenu (){
        Intent intent = new Intent(MainActivity.this, MainMenu.class);
        startActivity(intent);
    }
}