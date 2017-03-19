package com.example.ctadmin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class third extends AppCompatActivity {
private CheckBox cb2;
    private CheckBox cb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cb2();
            }
        });
        cb4 = (CheckBox) findViewById(R.id.cb4);
        cb4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cb4();
            }
        });

    }
    private void cb2(){

        Intent intent=new Intent(this,fourth.class);
        startActivity(intent);
    }
    private void cb4(){

        Intent intent=new Intent(this,fourth.class);
        startActivity(intent);
    }
}

