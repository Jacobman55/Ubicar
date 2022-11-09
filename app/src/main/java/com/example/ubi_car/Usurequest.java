package com.example.ubi_car;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class Usurequest extends StringRequest {

    String nombre,contrasea;

    String dato1,dato2;

    public Usurequest(int method, String url, Response.Listener<String> listener, @Nullable Response.ErrorListener errorListener,
                      String nombre, String contrasea){
        super(method, url, listener, errorListener);
        this.nombre=nombre;
        this.contrasea=contrasea;
    }

    public Map<String,String> getHeaders() throws AuthFailureError{
        return super.getHeaders();
    }

//    @Override
//    public byte[] getBody() throws AuthFailureError{
//        String cuerpoPeticion=String.format("nombre=%s$contrasea",nombre,contrasea);
//        byte[] b= cuerpoPeticion.getBytes();
//        return b;
//    }
}
