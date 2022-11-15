package com.example.ubi_car;

import org.json.JSONException;
import org.json.JSONObject;

public class UbiDto {
    private String coche;
    private String referencia;
    private String matricula;
    private String dia;
    private String id;

    public UbiDto(JSONObject json) throws JSONException {
        this.coche = json.getString("coche");
        this.referencia = json.getString("referencia");
        this.matricula = json.getString("matricula");
        this.dia = json.getString("dia");
        this.id = json.getString("id");
    }

    public String getCoche(){return coche;}

    public String getReferencia(){return referencia;}

    public String getMatricula(){return matricula;}

    public String getDia(){return dia;}

    public String getid(){return id;}

}
