package com.example.app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        TextView bird = findViewById(R.id.bird);
        btn.setOnClickListener(v -> {


            LocalDateTime ldt = LocalDateTime.now();

            String[][] birthday = {{"3-18","晓莉生日快乐"},{"3-17","杨晓莉生日快乐"}};
            String str = ""+ldt.getMonthValue()+"-"+(ldt.getDayOfMonth());
            String text = "今天是："+str+"\n";


            for (int i = 0 ; i < 2 ; i++) {
                if(birthday[i][0].equals(str)){
                    text += "\n"+birthday[i][1];
                }
            }
            bird.setText(text);
            bird.setTextSize(20);
        });

    }
}