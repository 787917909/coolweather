package com.example.materialtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button confirm = findViewById(R.id.register);
        Button back = findViewById(R.id.back);
        
    }

    @Override
    public void onClick(View v) {

    }
}
