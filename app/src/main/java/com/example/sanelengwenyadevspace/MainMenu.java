package com.example.sanelengwenyadevspace;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    private Button home;
    TextView textView1;
    private Button calculator;
    TextView textView2;
    private Button AboutMe;
    TextView textView3;
    private Button MyDevProfile;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.setting:
                Toast.makeText(this,"now you can conf...",Toast.LENGTH_LONG).show();
                return true;

            case R.id.share:
                Toast.makeText(this,"give my info...",Toast.LENGTH_LONG).show();
                return true;

            case R.id.contact:
                Toast.makeText(this,"www.sanele.com",Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void init(){
        home = (Button)findViewById(R.id.home);
        textView1 = (TextView) findViewById(R.id.textView1);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("This is my Code");
            }
            public void openHome(){
                Intent int4 = new Intent(MainMenu.this, Home.class);
                startActivity(int4);
            }
        });

        calculator = (Button)findViewById(R.id.calculator);
        textView2 = (TextView) findViewById(R.id.textView2);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText("Force & Area");

            }
            public void openCalculation(){
                Intent int1 = new Intent(MainMenu.this, Calculation.class);
                startActivity(int1);
            }

        });

        AboutMe = (Button)findViewById(R.id.AboutMe);
        textView3 = (TextView) findViewById(R.id.textView3);
        AboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3.setText("My info");
            }
            public void openAboutMe(){
                Intent int2 = new Intent(MainMenu.this, AboutMe.class);
                startActivity(int2);
            }
        });

        MyDevProfile = (Button)findViewById(R.id.MyDevProfile);
        textView4 = (TextView) findViewById(R.id.textView4);
        MyDevProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView4.setText("This is my Code");
            }
            public void openMyDevProfile(){
                Intent int3 = new Intent(MainMenu.this, MyDevProfile.class);
                startActivity(int3);
            }
        });

    }

}