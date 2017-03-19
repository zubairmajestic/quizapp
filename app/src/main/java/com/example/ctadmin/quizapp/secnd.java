package com.example.ctadmin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class secnd extends AppCompatActivity {
private RadioButton glanmorgan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secnd);
        glanmorgan = (RadioButton) findViewById(R.id.glanmorgan);
        glanmorgan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                glanmorgan();
            }
        });
    }
    private void glanmorgan(){

        Intent intent=new Intent(this,third.class);
        startActivity(intent);
    }
}


