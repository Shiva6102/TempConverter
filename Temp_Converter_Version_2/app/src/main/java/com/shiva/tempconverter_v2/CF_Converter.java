package com.shiva.tempconverter_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CF_Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_f__converter);
    }

    public void CF_Click(View view)
    {
        EditText TempC = (EditText) findViewById(R.id.TempC);
        String Temp = TempC.getText().toString();
        Double doubleTemp1 = Double.parseDouble(Temp);
        Double tempF = ((9*doubleTemp1)/5)+32;
        String tview2 = "= " + tempF.toString() + " F";
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setText("The Converted Temperature is:"+tview2);
    }
}