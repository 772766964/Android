package com.example.app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

public class MainActivity extends AppCompatActivity {

    StringBuffer calcText = new StringBuffer("0");

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * 计算器
         */
        {
        setContentView(R.layout.grid_layout);

        EditText editText = findViewById(R.id.txt);
        editText.setText(calcText);

        findViewById(R.id.btn_c).setOnClickListener(v -> {
            calcText = new StringBuffer("0");
            editText.setText(calcText);
        });
        findViewById(R.id.one).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '1');
            } else {
                calcText.append(1);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.two).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '2');
            } else {
                calcText.append(2);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.three).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '3');
            } else {
                calcText.append(3);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.four).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '4');
            } else {
                calcText.append(4);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.five).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '5');
            } else {
                calcText.append(5);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.six).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '6');
            } else {
                calcText.append(6);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.seven).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '7');
            } else {
                calcText.append(7);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.eight).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '8');
            } else {
                calcText.append(8);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.nine).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '9');
            } else {
                calcText.append(9);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.zero).setOnClickListener(v -> {
            if (calcText.charAt(0) == '0') {
                calcText.setCharAt(0, '0');
            } else {
                calcText.append(0);
            }
            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_chen).setOnClickListener(v -> {
            //判断重复
            if (calcText.charAt(calcText.length()-1) == '*'
                    || calcText.charAt(calcText.length()-1) == '/'
                    || calcText.charAt(calcText.length()-1) == '+'
                    || calcText.charAt(calcText.length()-1) == '-'
                    || calcText.charAt(calcText.length()-1) == '%'
                    || calcText.charAt(calcText.length()-1) == '.') {
                calcText.deleteCharAt(calcText.length()-1);
            }
            calcText.append("*");
//            calcText = calcText.reverse();
//            if (calcText.charAt(0) == '*'
//                    || calcText.charAt(0) == '/'
//                    || calcText.charAt(0) == '+'
//                    || calcText.charAt(0) == '-'
//                    || calcText.charAt(0) == '%'
//                    || calcText.charAt(0) == '.') {
////                Toast.makeText(this,"一样",Toast.LENGTH_SHORT).show();
//
//                calcText = calcText.reverse();
//            }
//            else {
//                calcText.append('*');
//            }

            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_chu).setOnClickListener(v -> {
            //判断重复

            if (calcText.charAt(calcText.length()-1) == '*'
                    || calcText.charAt(calcText.length()-1) == '/'
                    || calcText.charAt(calcText.length()-1) == '+'
                    || calcText.charAt(calcText.length()-1) == '-'
                    || calcText.charAt(calcText.length()-1) == '%'
                    || calcText.charAt(calcText.length()-1) == '.') {
                calcText.deleteCharAt(calcText.length()-1);
            }
            calcText.append("/");
//            calcText = calcText.reverse();
//            if (calcText.charAt(0) == '*'
//                    || calcText.charAt(0) == '/'
//                    || calcText.charAt(0) == '+'
//                    || calcText.charAt(0) == '-'
//                    || calcText.charAt(0) == '%'
//                    || calcText.charAt(0) == '.') {
//                calcText = calcText.reverse();
//            } else {
//                calcText = calcText.reverse();
//                calcText.append('/');
//            }

            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_del).setOnClickListener(v -> {
            //判断重复
            if (calcText.charAt(calcText.length()-1) == '*'
                    || calcText.charAt(calcText.length()-1) == '/'
                    || calcText.charAt(calcText.length()-1) == '+'
                    || calcText.charAt(calcText.length()-1) == '-'
                    || calcText.charAt(calcText.length()-1) == '%'
                    || calcText.charAt(calcText.length()-1) == '.') {
                calcText.deleteCharAt(calcText.length()-1);
            }
            calcText.append("-");
//            calcText = calcText.reverse();
//            if (calcText.charAt(0) == '*'
//                    || calcText.charAt(0) == '/'
//                    || calcText.charAt(0) == '+'
//                    || calcText.charAt(0) == '-'
//                    || calcText.charAt(0) == '%'
//                    || calcText.charAt(0) == '.') {
//                calcText = calcText.reverse();
//            } else {
//                calcText.append('-');
//            }

            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_add).setOnClickListener(v -> {
            //判断重复
            if (calcText.charAt(calcText.length()-1) == '*'
                    || calcText.charAt(calcText.length()-1) == '/'
                    || calcText.charAt(calcText.length()-1) == '+'
                    || calcText.charAt(calcText.length()-1) == '-'
                    || calcText.charAt(calcText.length()-1) == '%'
                    || calcText.charAt(calcText.length()-1) == '.') {
                calcText.deleteCharAt(calcText.length()-1);
            }
            calcText.append("+");
//            calcText = calcText.reverse();
//            if (calcText.charAt(0) == '*'
//                    || calcText.charAt(0) == '/'
//                    || calcText.charAt(0) == '+'
//                    || calcText.charAt(0) == '-'
//                    || calcText.charAt(0) == '%'
//                    || calcText.charAt(0) == '.') {
//                calcText = calcText.reverse();
//            } else {
//                calcText.append('+');
//            }

            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.quyu).setOnClickListener(v -> {
            //判断重复

            if (calcText.charAt(calcText.length()-1) == '*'
                    || calcText.charAt(calcText.length()-1) == '/'
                    || calcText.charAt(calcText.length()-1) == '+'
                    || calcText.charAt(calcText.length()-1) == '-'
                    || calcText.charAt(calcText.length()-1) == '%'
                    || calcText.charAt(calcText.length()-1) == '.') {
                calcText.deleteCharAt(calcText.length()-1);
            }
            calcText.append("%");
//            calcText = calcText.reverse();
//            if (calcText.charAt(0) == '*'
//                    || calcText.charAt(0) == '/'
//                    || calcText.charAt(0) == '+'
//                    || calcText.charAt(0) == '-'
//                    || calcText.charAt(0) == '%'
//                    || calcText.charAt(0) == '.') {
//                calcText = calcText.reverse();
//            } else {
//                calcText.append('%');
//            }

            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.dian).setOnClickListener(v -> {
            //判断重复

            if (calcText.charAt(calcText.length()-1) == '*'
                    || calcText.charAt(calcText.length()-1) == '/'
                    || calcText.charAt(calcText.length()-1) == '+'
                    || calcText.charAt(calcText.length()-1) == '-'
                    || calcText.charAt(calcText.length()-1) == '%'
                    || calcText.charAt(calcText.length()-1) == '.') {
                calcText.deleteCharAt(calcText.length()-1);
            }
            calcText.append(".");
//            calcText = calcText.reverse();
//            if (calcText.charAt(0) == '*'
//                    || calcText.charAt(0) == '/'
//                    || calcText.charAt(0) == '+'
//                    || calcText.charAt(0) == '-'
//                    || calcText.charAt(0) == '%'
//                    || calcText.charAt(0) == '.') {
//                calcText = calcText.reverse();
//            } else {
//                calcText.append('.');
//            }

            if (calcText.length() < 12) {
                editText.setText(calcText.toString());
            } else {
                Toast.makeText(this, "长度过长", Toast.LENGTH_SHORT).show();
            }
        });
        findViewById(R.id.btn_b).setOnClickListener(v -> {
            if (calcText.length() > 1) {
                calcText = calcText.deleteCharAt(calcText.length() - 1);
                editText.setText(calcText);
            } else if (calcText.equals("")) {
                editText.setText("0");
            }
        });
        findViewById(R.id.dengyu).setOnClickListener(v -> {

            try {
                Long result = (Long) AviatorEvaluator.execute(editText.getText().toString());
                calcText = new StringBuffer(result.toString());
                editText.setText(calcText);
//                calcText = new StringBuffer("0");
            } catch (Exception e) {
                calcText = new StringBuffer("Err");
                editText.setText(calcText);
            }
        });
    }

        /**
         * BMI计算
         */
//        setContentView(R.layout.activity_bmi);
//        Button btn_bmi = findViewById(R.id.btn_bmi);
//        btn_bmi.setOnClickListener(v->{
//            EditText etWight = findViewById(R.id.et_wight);
//            EditText etHight = findViewById(R.id.et_hight);
//            TextView tvBmi = findViewById(R.id.tv_bmi);
//            TextView tvZD = findViewById(R.id.tv_zd);
//            RadioButton rbn = findViewById(R.id.rb_nan);
//
//            tvBmi.setText("BMI：");
//            tvZD.setText("诊断：");
//
////            体重/身高^2
//            Double bmi=new Double("0");
//            try{
//                bmi = Double.parseDouble(String.valueOf(etWight.getText())) / (Double.parseDouble(String.valueOf(etHight.getText()))*Double.parseDouble(String.valueOf(etHight.getText())));
//                tvZD.setText(this.returnBmiString(rbn.isChecked(),bmi));
//                tvBmi.setText(tvBmi.getText()+String.format("%.2f",bmi));
////                tvZD.setText(""+rbn.isChecked());
//            }catch (Exception e){
//                Toast.makeText(this,"请正确输入！",Toast.LENGTH_LONG).show();
//            }
//        });




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

    /**
     *  判断是男是女，然后输出对应体重
     * @param bool - true 男 ，false 女
     * @param bmi 值
     * @return  
     */
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