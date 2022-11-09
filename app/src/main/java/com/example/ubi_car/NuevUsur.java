package com.example.ubi_car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import java.io.UnsupportedEncodingException;

public class NuevUsur extends AppCompatActivity {

    private EditText edit1,edit2,edit3;
    String nombre;
    String contrasea;
    String confcontrasea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuev_usur);
        // Lo mismo que antes asignando los Edit
        edit1 =(EditText) findViewById(R.id.editTextTextNombre);
        edit2 =(EditText) findViewById(R.id.editTextTextContrasea);
        edit3 =(EditText) findViewById(R.id.editTextTextContraseaConfirm);
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

    public void onClickRegistrar(View view) throws UnsupportedEncodingException{
        nombre=edit1.getText().toString();
        contrasea=edit2.getText().toString();
        confcontrasea=edit3.getText().toString();
//        if(confcontrasea.equals(contrasea)){
            Usurequest post = new Usurequest(Request.Method.POST, "https://63564ad8a2d1844a9771151f.mockapi.io/api/uc/Usuario", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    System.out.print("Registrado");
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text = "Enviado";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    System.out.print("No funciona");
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text ="Fallo al subirlo";
                    Toast toast = Toast.makeText(context,text,duration);
                    toast.show();
                }
            },nombre,contrasea);
            RequestQueue cola= Volley.newRequestQueue(this);
            cola.add(post);
            finish();
//        }
    }

}