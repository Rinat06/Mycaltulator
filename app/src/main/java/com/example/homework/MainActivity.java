package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import kotlin.text._OneToManyTitlecaseMappingsKt;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first, second;
    public Boolean isOperationClick;
    public Button btn;
    private Integer operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                startActivity( new Intent(MainActivity.this, MainActivity2.class));
                break;
            case R.id.btn_clear:
                btn = findViewById(R.id.btn);
                btn.setVisibility(View.INVISIBLE);
                textView.setText("0");
                first = 0;
                second = 0;
                break;
            case R.id.btn_one:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.three:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.four:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.five:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.six:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.seven:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.eight:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.nine:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                } else if (isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.zero:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else if (isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
        }
        isOperationClick = false;
    }

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.razdelit:
                first = Integer.parseInt(textView.getText().toString());
                setOperation(4);
                break;
            case R.id.minus:
                first = Integer.parseInt(textView.getText().toString());
                setOperation(3);
                break;
            case R.id.umnojuti:
                first = Integer.parseInt(textView.getText().toString());
                setOperation(2);
                break;
            case R.id.btn_plus:
                first = Integer.parseInt(textView.getText().toString());
                setOperation(1);
                break;

            case R.id.btn_rovno:
                 btn = findViewById(R.id.btn);
                 if (btn.getVisibility() == View.INVISIBLE){
                     btn.setVisibility(View.VISIBLE);
                 }else btn.setVisibility(View.INVISIBLE);
                     //
                    if (getOperation() == 1) {
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result = first + second;
                        textView.setText(result.toString());
                    } else if (getOperation() == 2) {
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result1 = first * second;
                        textView.setText(result1.toString());
                    } else if (getOperation() == 3) {
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result2 = first - second;
                        textView.setText(result2.toString());
                    } else if (getOperation() == 4) {
                        second = Integer.parseInt(textView.getText().toString());
                        Integer result3 = first / second;
                        textView.setText(result3.toString());
                    } else textView.setText("error");
                break;
        }
        isOperationClick = true;
    }
}
