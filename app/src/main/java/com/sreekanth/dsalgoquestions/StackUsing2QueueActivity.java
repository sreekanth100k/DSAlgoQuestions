package com.sreekanth.dsalgoquestions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StackUsing2QueueActivity extends AppCompatActivity {
    //Frequently asked interview question
    //Implement stack using 2 queues..

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyStack myStackObj = new MyStack();
        myStackObj.push("Element 1");
        myStackObj.push("Element 2");
        myStackObj.push("Element 3");

        myStackObj.pop();

        myStackObj.push("Element 4");

    }
}