package com.example;

import android.app.Activity;
import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.*;

public class MyApplication extends Activity
{
    /** Called when the activity is first created. */
    static double number1 = 0;
    static double number2 = 0;
    static double sum = 0;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void plusNumber(View buttonClicked)
    {
        Button bt = (Button)buttonClicked;
        String name = bt.getText().toString();
        TextView tv = (TextView)this.findViewById(R.id.Result);
        EditText ed1 = (EditText)this.findViewById(R.id.Number1);
        EditText ed2 = (EditText)this.findViewById(R.id.Number2);
        try
        {
            number1 = Double.parseDouble(ed1.getText().toString());
            number2 = Double.parseDouble(ed2.getText().toString());

            if(name.equalsIgnoreCase("Plus(+)"))
            {
                   sum = number1 + number2;
            }
            else
            {
                   sum = number1 - number2;
            }

            tv.setText(String.valueOf(sum));
        }
        catch(NumberFormatException e)
        {
            tv.setText("Exception is caught!Please re-insert numbers");
        }


    }
}
