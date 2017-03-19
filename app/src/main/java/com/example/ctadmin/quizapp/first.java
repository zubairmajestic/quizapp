package com.example.ctadmin.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.view.View;
import android.content.Intent;

public class first extends AppCompatActivity {

    private RadioButton srilanka;
    private RadioButton zimbabawe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        srilanka = (RadioButton) findViewById(R.id.srilanka);
        srilanka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                srilanka();
            }
        });


    }
        private void srilanka(){

            Intent intent=new Intent(this,secnd.class);
            startActivity(intent);
        }
}
