package com.example.ubi_car;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ubi_car.R;

public class UbiDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubi_detail);
        Bundle bundle = getIntent().getExtras();
        colocarDatos(bundle);
    }

    protected void colocarDatos(Bundle bundle){
        TextView coche = findViewById(R.id.DataCoche);
        coche.setText(bundle.get("coche").toString());
        TextView dia = findViewById(R.id.Datadia);
        dia.setText(bundle.get("dia").toString());
        TextView matricula = findViewById(R.id.DataMatricula);
        matricula.setText(bundle.get("matricula").toString());
        TextView referencia = findViewById(R.id.DataReferencia);
        referencia.setText(bundle.get("referencia").toString());
    }
}