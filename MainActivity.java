package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convertCurrency(View view ){
        Log.i("Info","Button Pressed");
        EditText editText=(EditText) findViewById(R.id.editText1);
        String amountInEuro=editText.getText().toString();
        double amountInEurodouble=Double.parseDouble(amountInEuro);
        double amountInDollarsdouble=amountInEurodouble*1.11;
        String amountInDollarsString=Double.toString(amountInDollarsdouble);
        Log.i("Amount In Dollars ",amountInDollarsString);

        Toast.makeText(this, amountInEuro+ "€ is " +amountInDollarsString +"$",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
