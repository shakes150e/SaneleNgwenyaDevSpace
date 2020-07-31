package com.example.sanelengwenyadevspace;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

public class AboutMe extends AppCompatActivity {

    int view = R.layout.activity_about_me;
    private static final int TIME_INTERVAL=2000;
    private long mBackPressed;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);
    }

    @Override
    public void onBackPressed() {
        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()){
        super.onBackPressed();
        return;
    }else {
            Toast.makeText(getBaseContext(), "Click two times to close an activity",    Toast.LENGTH_SHORT).show();
        }
        mBackPressed = System.currentTimeMillis();
    }
}