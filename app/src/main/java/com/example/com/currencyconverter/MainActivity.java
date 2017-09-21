package com.example.com.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View v) {

       EditText amount = (EditText) findViewById(R.id.editText);
       Double dollar = Double.parseDouble(amount.getText().toString());
       Double rupees = dollar * 95;

       Toast.makeText(getApplicationContext(), "Rs " + rupees, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
