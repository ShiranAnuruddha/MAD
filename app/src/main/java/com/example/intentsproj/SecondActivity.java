package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class SecondActivity extends AppCompatActivity {



    EditText edit3;
    EditText edit4;

    String number1;
    String number2;
    TextView textView3;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edit3 = findViewById(R.id.edit1);
        edit4 = findViewById(R.id.edit2);
        textView3 = findViewById(R.id.textView3);

        Intent intent = getIntent();
number1 = intent.getStringExtra("n1");
number2 = intent.getStringExtra("n2");

edit3.setText(number1);
edit4.setText(number2);

n1= Integer.parseInt(number1);
n2= Integer.parseInt(number2);

    }

    public void add(View view){

            textView3.setText(number1 + " + " + number2 + " = " + (n1+n2));


        }

    public void substract(View view){
        textView3.setText(number1 + " - " + number2 + " = " + (n1-n2));

    }

    public void multiplyadd(View view){
        textView3.setText(number1 + " * " + number2 + " = " + (n1*n2));

    }

    public void divisionView (View view){
        textView3.setText(number1 + " / " + number2 + " = " + (n1/n2));

    }
}

