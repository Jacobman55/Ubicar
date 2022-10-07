package com.example.ubi_car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PantElec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pant_elec);
    }

    public void onClickNuv (View view){
        Intent intent = new Intent(this, AddUbi.class);
        startActivity(intent);
    }

    public void onClickVer (View view){
        Intent intent = new Intent(this, VerUbic.class);
        startActivity(intent);
    }
}