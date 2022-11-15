package com.example.ubi_car;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.ubi_car.R;
import com.example.ubi_car.UbiDetailActivity;

public class ViewHolder extends RecyclerView.ViewHolder {
    
    private final TextView TextoMatricula;
    private final TextView TextoDia;
    private UbiDto UbiDto;

    public ViewHolder(@NonNull View itemView){
        super(itemView);
        TextoMatricula=(TextView) itemView.findViewById(R.id.matricula);
        TextoDia=(TextView) itemView.findViewById(R.id.dia);

    }

    public void bindData(UbiDto data, Activity activity){
        TextoMatricula.setText(data.getCoche());
        TextoDia.setText(" "+data.getDia());
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(activity, UbiDetailActivity.class);
                intent.putExtra("matricula",data.getMatricula());
                intent.putExtra("dia",data.getDia());
                intent.putExtra("coche",data.getCoche());
                intent.putExtra("referencia",data.getReferencia());
                activity.startActivity(intent);
            }
        });
    }
}