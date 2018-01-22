package com.popland.pop.sendbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText)findViewById(R.id.edt);
    }

    public void send(View v){
        Intent intent = new Intent();
        intent.setAction("com.popland.pop.sendbroadcast");//package name is key for Receiver's Intent-Filter
        intent.putExtra("mess",edt.getText().toString());
        sendBroadcast(intent);
    }
}
