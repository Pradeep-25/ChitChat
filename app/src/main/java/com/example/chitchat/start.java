package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start extends AppCompatActivity {

    private Button mRegBtn;
    private Button mLoginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mRegBtn=findViewById(R.id.start_reg_button);
        mLoginbtn=findViewById(R.id.start_login_button);

        mRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reg_intent=new Intent(start.this,RegisterActivity.class);
                startActivity(reg_intent);
            }
        });

        mLoginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login_intent=new Intent(start.this,LoginActivity.class);
                startActivity(login_intent);
            }
        });

    }
}
