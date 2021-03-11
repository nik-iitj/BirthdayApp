package com.example.birthdayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);
        txt=(TextView)findViewById(R.id.txtName);

        Bundle data= getIntent().getExtras();
        CharSequence getName=data.getCharSequence("name");
        txt.setText(getName);


    }

}