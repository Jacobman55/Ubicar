package com.example.ubi_car;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

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

    public void onBindViewHolder (ViewHolder holder, int position){
        UbiDto dataInPositionToBeRendered= alltheData.get(position);
        holder.bindData(dataInPositionToBeRendered,activity);
    }

    public int getItemCount(){return alltheData.size();}
}