package com.example.ubi_car;

import org.json.JSONException;
import org.json.JSONObject;

public class UbiDto {
    private String coche;
    private String referencia;
    private int matricula;
    private int token;
    private int dia;
    private int id;

    public UbiDto(JSONObject json) throws JSONException {
        this.coche = json.getString("coche");
        this.referencia = json.getString("referencia");
        this.matricula = json.getInt("matrícula");
        this.token = json.getInt("token");
        this.dia = json.getInt("dia");
        this.id = json.getInt("id");
    }

    public String getCoche(){return coche;}

    public String getReferencia(){return referencia;}

    public int getMatricula(){return matricula;}

    public int gettoken(){return token;}

    public int getDia(){return dia;}

    public int getid(){return id;}

    @Override
    public String toString() {
        return "UbiDto{" +
                "coche='" + coche + '\'' +
                ", referencia=" + referencia +
                ", matricula='" + matricula + '\'' +
                ", token=" + token +
                ", dia=" + dia +
                ", id=" +id +
                '}';
    }
}
