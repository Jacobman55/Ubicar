package com.example.ubi_car.Recycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ubi_car.R;

public class ViewHolder extends AppCompatActivity {
    
    private final TextView Textocoche;
    private final TextView TextoDia;
    private UbiDto UbiDto;

    public ViewHolder(@NonNull View itemView){
        super(itemView);
        Textocoche=(TextView) itemView.findViewById(R.id.coche);
        TextoDia=(TextView) itemView.findViewById(R.id.dia);

    }

    public void bindData(UbiDto data, Activity activity){
        Textocoche.setText(data.getCoche());
        TextoDia.setText(setText(" "+data.getDia));
        itemView.setOnCliclListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(activity, UbiDetailActivity.class);
                intent.putExtra("coche",data.getMatricula());
                intent.putExtra("dia",data.getDia());
                activity.startActivity(intent);
            }
        })
    }
}