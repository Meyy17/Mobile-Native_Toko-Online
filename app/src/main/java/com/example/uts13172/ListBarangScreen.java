package com.example.uts13172;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class ListBarangScreen extends AppCompatActivity {

    private RecyclerView rvBarang;
    private ArrayList<BarangModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_barang_screen);
        getSupportActionBar().setTitle("Explore");

        rvBarang = findViewById(R.id.rv_barang);
        rvBarang.setHasFixedSize(true);

        list.addAll(DataBarang.getlistData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvBarang.setLayoutManager(new LinearLayoutManager(this));
        ListModelAdapter listModelAdapter = new ListModelAdapter(list);
        rvBarang.setAdapter(listModelAdapter);

        listModelAdapter.setOnItemClickCallback(new ListModelAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(BarangModel barangmodel){
                Intent moveIntent = new Intent(ListBarangScreen.this, DetailBarangScreen.class);
                moveIntent.putExtra(DetailBarangScreen.ITEM, barangmodel);
                startActivity(moveIntent);
            }
        });

    }
}