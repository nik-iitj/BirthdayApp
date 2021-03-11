package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtInp;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtInp=(EditText)findViewById(R.id.txtInput);
        btnNext=(Button)findViewById(R.id.txtBtn);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name= txtInp.getEditableText().toString();
                int unicode=0x1F989;
                String emoji=getEmoji(unicode);

                Intent intent= new Intent(v.getContext(), BirthdayGreetingActivity.class);
                if(name.equals("Neha") || name.equals("neha"))  intent.putExtra("name","cutiee owl :)"+"\n"+emoji);
                else intent.putExtra("name",name);
                startActivity(intent);


            }
        });

    }
    public String getEmoji(int uni){
        return new String (Character.toChars(uni));

    }
}