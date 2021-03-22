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
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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

        /**
         * BMI计算
         */
        setContentView(R.layout.activity_bmi);
        Button btn_bmi = findViewById(R.id.btn_bmi);
        btn_bmi.setOnClickListener(v->{
            EditText etWight = findViewById(R.id.et_wight);
            EditText etHight = findViewById(R.id.et_hight);
            TextView tvBmi = findViewById(R.id.tv_bmi);
            TextView tvZD = findViewById(R.id.tv_zd);
            RadioButton rbn = findViewById(R.id.rb_nan);

            tvBmi.setText("BMI：");
            tvZD.setText("诊断：");

//            体重/身高^2
            Double bmi=new Double("0");
            try{
                bmi = Double.parseDouble(String.valueOf(etWight.getText())) / (Double.parseDouble(String.valueOf(etHight.getText()))*Double.parseDouble(String.valueOf(etHight.getText())));
                tvZD.setText(this.returnBmiString(rbn.isChecked(),bmi));
                tvBmi.setText(tvBmi.getText()+String.format("%.2f",bmi));
//                tvZD.setText(""+rbn.isChecked());
            }catch (Exception e){
                Toast.makeText(this,"请正确输入！",Toast.LENGTH_LONG).show();
            }
        });


        /*
        setContentView(R.layout.grid_layout);
        计算器
         */
//        Button dengyu = findViewById(R.id.dengyu);
//        EditText editText = findViewById(R.id.txt);
//        editText.setText("Ceshi");


        /*
        显示生日
        Button btn = findViewById(R.id.button);
        TextView bird = findViewById(R.id.bird);
        btn.setOnClickListener(v -> {


            LocalDateTime ldt = LocalDateTime.now();

            String[][] birthday = {{"3-18","戎戎生日快乐"},{"3-17","戎星磊同学生日快乐"}};
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
        * */

    }

    public String returnBmiString(Boolean bool , Double bmi){
        String str ="方法空";
        if(bool){
            if(bmi<20){
                str = "体重过轻";
            }else if(bmi<25){
                str = "体重正常";
            }else if(bmi<27){
                str = "体重超重";
            }else if(bmi<30){
                str = "轻度肥胖";
            }else if(bmi<35){
                str = "中度肥胖";
            }else if(bmi>=35){
                str = "重度肥胖";
            }
        }else{
            if(bmi<19){
                str = "体重过轻";
            }else if(bmi<24){
                str = "体重正常";
            }else if(bmi<26){
                str = "体重超重";
            }else if(bmi<29){
                str = "轻度肥胖";
            }else if(bmi<34){
                str = "中度肥胖";
            }else if(bmi>=34){
                str = "重度肥胖";
            }
        }
        return str;
    }
}