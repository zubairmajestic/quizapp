package com.example.ctadmin.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class wrong extends AppCompatActivity {
private Button Try;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
        Try=(Button)findViewById(R.id.Try);
        Try.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Try();
            }
        });
    }
    private void Try(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
