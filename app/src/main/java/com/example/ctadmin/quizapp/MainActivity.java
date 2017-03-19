package com.example.ctadmin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button clickhere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickhere = (Button)findViewById(R.id.clickhere);
        clickhere.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                clickhere();
            }
        });
    }
    private void clickhere(){
        Intent intent=new Intent(this,first.class);
        startActivity(intent);
    }
}
