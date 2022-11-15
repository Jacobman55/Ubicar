package com.example.ubi_car.Recycler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ubi_car.Dto.UbiDto;
import com.example.ubi_car.R;

import java.util.List;

public class RecyclerViewAdapter extends AppCompatActivity {

    private Context context;
    private List<UbiDto> alltheData;
    private Activity activity;

    public RecyclerViewAdapter(List<UbiDto> dataSet, Activity activity){
        this.alltheData=dataSet;
        this.activity=activity;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_holder,parent,false);
        return new ViewHolder(view);
    }

    public void onBondViewHolder (ViewHolder holder, int position){
        UbiDto dataInPositionToBeRendered= alltheData.get(position);
        holder.bindData(dataInPositionToBeRendered,activity);
    }

    public int getItemCount(){return alltheData.size();}
}