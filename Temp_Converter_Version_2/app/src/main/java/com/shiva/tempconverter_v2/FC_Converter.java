package com.shiva.tempconverter_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FC_Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_c__converter);
    }

    public void FC_Click(View view)
    {
        EditText TempF = (EditText) findViewById(R.id.TempF);
        String temp = TempF.getText().toString();
        Double doubleTemp2 = Double.parseDouble(temp);
        Double tempC = ((5*doubleTemp2)-160)/9;
        String tview1 = "= " + tempC.toString() + " C";
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("The Converted Temperature is:"+tview1);

    }
}