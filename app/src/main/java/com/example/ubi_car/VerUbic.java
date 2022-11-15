package com.example.ubi_car;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class VerUbic extends AppCompatActivity {

    private JSONObject alltheData;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_ubic);

        recyclerView=(RecyclerView) findViewById(R.id.listado);
        Activity activity = this;
        JsonArrayRequest request = new JsonArrayRequest(
                Request.Method.GET,
                "https://63564ad8a2d1844a9771151f.mockapi.io/api/uc/Coche",
                null,
                new Response.Listener<JSONArray>(){
                    @Override
                    public void onResponse(JSONArray response){
                        List<UbiDto> alltheData = new ArrayList<>();
                        for(int i = 0;i< response.length();i++){
                            try{
                                JSONObject ubi = response.getJSONObject(i);
                                UbiDto data = new UbiDto(ubi);
                                System.out.print(data);
                                alltheData.add(data);
                                System.out.println(alltheData.get(i));
                            }catch (JSONException e){
                                e.printStackTrace();
                            };
                        }
                        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(alltheData, activity);
                        recyclerView.setAdapter(recyclerViewAdapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
                    }
                },
                new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Context context = getApplicationContext();
                        int duration = Toast.LENGTH_SHORT;
                        CharSequence text ="Fallo";
                        Toast toast = Toast.makeText(context,text,duration);
                        toast.show();
                    }
                }
        );
        RequestQueue cola = Volley.newRequestQueue(this);
        cola.add(request);
    }
}