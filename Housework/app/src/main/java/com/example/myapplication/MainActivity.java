package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btn.setOnClickListener(v->{

//            showAdd();
try {

    showNormalDialog();
}catch (Exception e){
    //
}

        });

    }

    private void showAdd() {
        String et1 = binding.et1.getText().toString();
        String et2 = binding.et2.getText().toString();


        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        intent.setAction("com.niit.activity1.Second");
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        bundle.putInt("add", Integer.parseInt(et1) + Integer.parseInt(et2));

        intent.putExtras(bundle);
        startActivity(intent);
    }



    private void showNormalDialog(){
        /*
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */

        int i = Integer.parseInt(binding.et1.getText().toString());
        int i1 = Integer.parseInt(binding.et2.getText().toString());

        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(MainActivity.this);
        normalDialog.setTitle("我是一个普通Dialog");


        normalDialog.setMessage("值为："+(i+i1));
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.setNegativeButton("关闭",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        // 显示
        normalDialog.show();
    }
}