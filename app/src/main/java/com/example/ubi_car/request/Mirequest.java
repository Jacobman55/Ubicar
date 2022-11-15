package com.example.ubi_car.request;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class Mirequest extends StringRequest {

    String coche,referencia,matricula,dia;

    String dato1,dato2,dato3,dato4;

    public Mirequest(int method, String url, Response.Listener<String> listener, @Nullable Response.ErrorListener errorListener,
                     String coche, String referencia, String matricula, String dia){
        super(method, url, listener, errorListener);
        this.coche=coche;
        this.referencia=referencia;
        this.matricula=matricula;
        this.dia=dia;
    }

    //@Override
    public Map<String,String> hetHeaders()throws AuthFailureError{
        return super.getHeaders();
    }

    @Override
    public byte[] getBody() throws AuthFailureError{
        String chichaPeticion=String.format("coche=%s$referencia=%s$matricula=%s$dia",coche,referencia,matricula,dia);
        byte[] b = chichaPeticion.getBytes();
        return b;
    }
}
