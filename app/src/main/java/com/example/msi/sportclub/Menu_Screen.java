package com.example.msi.sportclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__screen);
    }

    public void doHome(View view) {
        Intent intent = new Intent(this, Home_Screen.class);
        startActivity(intent);
    }

    public void doLoginAccount(View view) {
        Intent intent = new Intent(this, LogIn_Screen.class);
        startActivity(intent);
    }

    public void doProfile(View view) {
        Intent intent = new Intent(this, Profile_Screen.class);
        startActivity(intent);
    }

    public void doAboutUs(View view) {
        Intent intent = new Intent(this, About_Us.class);
        startActivity(intent);
    }

    public void doFillFeedback(View view) {
        Intent intent = new Intent(this, Fill_Feedback.class);
        startActivity(intent);
    }
}
