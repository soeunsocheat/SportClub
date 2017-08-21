package com.example.msi.sportclub;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Forget_Password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__password);
    }

    public void doOK(View view) {
        Intent intent = new Intent(this, LogIn_Screen.class);
        startActivity(intent);
    }
}
