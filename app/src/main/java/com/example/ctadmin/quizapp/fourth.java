package com.example.ctadmin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class fourth extends AppCompatActivity {
private CheckBox cb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                cb1();
            }
        });
    }
    private void cb1(){

        Intent intent=new Intent(this,last.class);
        startActivity(intent);
    }

}
