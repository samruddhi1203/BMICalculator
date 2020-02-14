package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button b1;
    EditText e1,e2;
    TextView e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        e3=findViewById(R.id.textView3);
        b1=findViewById(R.id.button1);

        b1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        double w,h;
        double res;
        w=Integer.parseInt(e1.getText().toString());
        h=Integer.parseInt((e2.getText().toString()));
        res=(w)/(h/100*h/100);
        if(res<18.5)
        {
            e3.setText(""+res+" - Below normal weight");

        }
        else if(res>=18.5 && res<25)
        {
            e3.setText(" "+res+" - Normal weight ");

        }
        else if(res>=25 && res<30)
        {
            e3.setText(" "+res+" - Overweight");

        }
        else
        {
            e3.setText(" "+res+" - Obesity");

        }


    }
}
