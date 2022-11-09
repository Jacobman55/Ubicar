package com.example.ubi_car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickInc (View view){
        Intent intent = new Intent(this, PantElec.class);
        startActivity(intent);
    }

    public void onClickNuev (View view){
        Intent intent = new Intent(this, NuevUsur.class);
        startActivity(intent);
    }
}