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
import com.example.ubi_car.request.Mirequest;

import java.io.UnsupportedEncodingException;

public class AddUbi extends AppCompatActivity {

    private EditText edit1,edit2,edit3,edit4;
    String coche;
    String referencia;
    String matricula;
    String dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ubi);
        //Asigno valores a los EditText
        edit1 =(EditText) findViewById(R.id.editTextCoche);
        edit2 =(EditText) findViewById(R.id.editTextTextReferencia);
        edit3 =(EditText) findViewById(R.id.editTextTextMatricula);
        edit4 =(EditText) findViewById(R.id.editTextTextDia);
    }

    public void onClickVolv (View view){
        Intent intent = new Intent(this, PantElec.class);
        startActivity(intent);
    }

    public void onClickGuardar (View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text ="Funciona";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //Enviando lo datos
    public void onClickGuardarFinal (View view) throws UnsupportedEncodingException{
        coche=edit1.getText().toString();
        referencia=edit2.getText().toString();
        matricula=edit3.getText().toString();
        dia=edit4.getText().toString();
        Mirequest post = new Mirequest(Request.Method.POST,"https://63564ad8a2d1844a9771151f.mockapi.io/api/uc/Coche",new Response.Listener<String>(){
            @Override
            public void onResponse(String response){
                System.out.print("Guardado");
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text ="Enviado";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error){
                System.out.print("No se ha guardado");
                Context context=getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text ="Fallo al guardar";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        },coche,referencia,matricula,dia);
        RequestQueue cola= Volley.newRequestQueue(this);
        cola.add(post);
        finish();
    }
}