package com.manu.shikhafirstproject;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import static androidx.recyclerview.widget.OrientationHelper.VERTICAL;

public class MainActivity extends AppCompatActivity { //AppCompatActivity backward compatibility

    boolean list = true;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_example);
        setUpRecyclerView();

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(list){
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,3);
                    gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
                    recyclerView.setLayoutManager(gridLayoutManager);
                    //change to grid
                    list = false;
                }else {
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    //change to list again
                    list = true;
                }
            }
        });

    }

    private void setUpRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        ImageAdapter adapter = new ImageAdapter();

        adapter.setData(getRandomItems());

        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Student> getRandomItems() {
        ArrayList<Student> students = new ArrayList<>();

        return students;
    }

}


