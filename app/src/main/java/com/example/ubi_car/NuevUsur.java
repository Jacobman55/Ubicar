package com.example.ubi_car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NuevUsur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuev_usur);
    }

    public void onClickGuardar (View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text ="Funciona";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onClickVolv (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}