package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.databinding.Activity1Binding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Activity1 extends AppCompatActivity {


    Activity1Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_1);
        binding = Activity1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
//        String et1 = intent.getStringExtra("et1");
//        String et2 = intent.getStringExtra("et2");

        Bundle bundle = intent.getExtras();
        int add = bundle.getInt("add");
        binding.tv.setText(""+add);
    }
}