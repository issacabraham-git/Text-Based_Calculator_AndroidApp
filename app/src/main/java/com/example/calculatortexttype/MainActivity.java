package com.example.calculatortexttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText afn1;
    private  EditText afn2;
    private TextView afnResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        afn1 = (EditText) findViewById(R.id.afn1);
        afn2 = (EditText) findViewById(R.id.afn2);
        afnResult = (TextView) findViewById(R.id.afnResult);
    }

    public void btnadd(View view) {
        int n1 = Integer.parseInt(afn1.getText().toString());
        int n2 = Integer.parseInt(afn2.getText().toString());
        int sum = n1 + n2;
        afnResult.setText(String.valueOf(sum));
    }

    public void btnsub(View view) {
        int n1 = Integer.parseInt(afn1.getText().toString());
        int n2 = Integer.parseInt(afn2.getText().toString());
        int sum = n1 - n2;
        afnResult.setText(String.valueOf(sum));
    }

    public void btnmul(View view) {
        int n1 = Integer.parseInt(afn1.getText().toString());
        int n2 = Integer.parseInt(afn2.getText().toString());
        int sum = n1 * n2;
        afnResult.setText(String.valueOf(sum));
    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(afn1.getText().toString());
        int n2 = Integer.parseInt(afn2.getText().toString());
        int sum = n1 / n2;
        afnResult.setText(String.valueOf(sum));
    }
}