package com.example.mysimpleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Paying_bills_screen extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paying_bills);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void openaddbillsactivity(View v)
    {
        Toast.makeText(this, "add bills", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , add_bills.class);
        startActivity(intent);
    }
}