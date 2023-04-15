package com.example.mysimpleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Home_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void payingbillsacitivity(View v)
    {
        Toast.makeText(this, "Bills Reminder", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , Paying_bills_screen.class);
        startActivity(intent);
    }

    public void healthactivity(View v)
    {
        Toast.makeText(this,"Health Activity",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Health.class);
        startActivity(intent);
    }
}