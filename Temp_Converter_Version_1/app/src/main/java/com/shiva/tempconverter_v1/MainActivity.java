package com.shiva.tempconverter_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void btnClick1(View view)
    {
        EditText TempC = (EditText) findViewById(R.id.TempC);
        String Temp = TempC.getText().toString();
        Double doubleTemp1 = Double.parseDouble(Temp);
        Double tempF = ((9*doubleTemp1)/5)+32;
        String toastText1 = "= " + tempF.toString() + " F";

        Toast.makeText(this, toastText1, Toast.LENGTH_SHORT).show();
    }

    public void btnClick2(View view)
    {
        EditText TempF = (EditText) findViewById(R.id.TempF);
        String temp = TempF.getText().toString();
        Double doubleTemp2 = Double.parseDouble(temp);
        Double tempC = ((5*doubleTemp2)-160)/9;
        String toastText2 = "= " + tempC.toString() + " C";

        Toast.makeText(this, toastText2, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}