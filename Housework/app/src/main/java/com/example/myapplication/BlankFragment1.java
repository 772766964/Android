package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment1 extends Fragment {

//    FragmentBlank1Binding binding;


    long startTime = System.currentTimeMillis(); //获取开始时间
    long endTime = 0;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);


        endTime = System.currentTimeMillis(); //获取结束时间

        Log.i(TAG, "onAttach: "+"程序运行时间：" + (endTime - startTime) + "ms");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding = FragmentBlank1Binding.inflate(getLayoutInflater());

        endTime = System.currentTimeMillis(); //获取结束时间

        Log.i(TAG, "onCreate: "+"程序运行时间：" + (endTime - startTime) + "ms");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Log.i(TAG, "onCreateView: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


        return inflater.inflate(R.layout.fragment_blank1, container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "onActivityCreated: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onCreateView: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: "+"程序运行时间：" + (System.currentTimeMillis() - startTime) + "ms");


    }
}