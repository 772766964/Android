package com.example.qq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);

        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_qq);

        findViewById(R.id.phone).setOnClickListener(v->{
            Toast.makeText(this,"拍照",Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.button).setOnClickListener(v->{
            Toast.makeText(this,"按钮",Toast.LENGTH_SHORT).show();
        });
        findViewById(R.id.add).setOnClickListener(v->{
            Toast.makeText(this,"更多功能",Toast.LENGTH_SHORT).show();
        });

    }
}