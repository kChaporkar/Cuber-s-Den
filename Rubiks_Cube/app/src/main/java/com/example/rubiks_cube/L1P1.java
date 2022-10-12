package com.example.rubiks_cube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class L1P1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l1_p1);
    }

    Intent intent = new Intent();

    public void home(View v){
        intent.setClass(this,MainActivity.class);
        startActivity(intent);
    }

    public void next(View v){
        intent.setClass(this,L1P2.class);
        startActivity(intent);
    }

    public void nextLayer(View v){
        intent.setClass(this,L2P1.class);
        startActivity(intent);
    }
}