package com.example.msi.sportclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogIn_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_screen);
    }
    public void doLogin(View view) {
        Intent intent = new Intent(this, Home_Screen.class);
        startActivity(intent);
    }

    public void doForgetPassword(View view) {
        Intent intent = new Intent(this, Forget_Password.class);
        startActivity(intent);
    }

    public void doSignUp(View view) {
        Intent intent = new Intent(this, Create_Screen.class);
        startActivity(intent);
    }
}
