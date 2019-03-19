package com.example.casey.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double savedNum = 0;
    private boolean edit = false;
    private int operation = -1;
    private boolean dot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int num_keys = 10;
        final Button[] keys = new Button[num_keys];
            keys[0] = (Button) findViewById(R.id.button_0);
            keys[1] = (Button) findViewById(R.id.button_1);
            keys[2] = (Button) findViewById(R.id.button_2);
            keys[3] = (Button) findViewById(R.id.button_3);
            keys[4] = (Button) findViewById(R.id.button_4);
            keys[5] = (Button) findViewById(R.id.button_5);
            keys[6] = (Button) findViewById(R.id.button_6);
            keys[7] = (Button) findViewById(R.id.button_7);
            keys[8] = (Button) findViewById(R.id.button_8);
            keys[9] = (Button) findViewById(R.id.button_9);
            //keys[10] = (Button) findViewById(R.id.button_decimal);
            //keys[10] = (Button) findViewById(R.id.button_ENTER);
            //keys[11] = (Button) findViewById(R.id.button_plus);

        final TextView numberBar = (TextView) findViewById(R.id.textView);

        for (int i = 0; i < keys.length; i++)
        //for (Button b : keys)
        {
            Button b = keys[i];
            final String text = b.getText().toString();
            b.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view) {
                    //double numberToDisplay = 0;
                    if (edit) {
                        //numberToDisplay = (Double.parseDouble(numberBar.getText().toString()) * 10) + Double.parseDouble(text);

                        StringBuilder sb = new StringBuilder(numberBar.getText().toString());
                        sb.append(text);
                        numberBar.setText(sb.toString());
                    }
                    else
                    {
                        //numberToDisplay = (Double.parseDouble(text));
                        numberBar.setText(text);
                    }

                    //numberBar.setText(Double.toString(numberToDisplay));
                    edit = true;
                }
            });
        }

        Button e = (Button) findViewById(R.id.button_e);

        numberBar.setOnClickListener(new View.OnClickListener()
        {
            final double euler_number = 2.718281828459045235360287471327;
            @Override
            public void onClick(View view)
            {
                if (!edit) {
                    numberBar.setText(Double.toString(euler_number));
                }
            }
        });

        Button enter = (Button) findViewById(R.id.button_ENTER);
        Button plus = (Button) findViewById(R.id.button_plus);
        Button decimal = (Button) findViewById(R.id.button_decimal);
        Button minus = (Button) findViewById(R.id.button_minus);
        Button mult = (Button) findViewById(R.id.button_mult);
        Button divide = (Button) findViewById(R.id.button_divide);

        final String text = decimal.getText().toString();
        decimal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                if (!dot){
                    if (edit) {
                        //numberToDisplay = (Double.parseDouble(numberBar.getText().toString()) * 10) + Double.parseDouble(text);

                        StringBuilder sb = new StringBuilder(numberBar.getText().toString());
                        sb.append(text);
                        numberBar.setText(sb.toString());
                    }
                    else
                    {
                        //numberToDisplay = (Double.parseDouble(text));
                        numberBar.setText(text);
                    }
                    dot = true;
                }

                //numberBar.setText(Double.toString(numberToDisplay));
                edit = true;
            }
        });

        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double saved = Double.parseDouble(numberBar.getText().toString().trim());
                if (operation == -1)
                {
                    savedNum = saved;
                }
                else if (operation == 0)
                {   //add
                    savedNum += saved;
                }
                else if (operation == 1)
                {   //subtract
                    savedNum -= saved;
                }
                else if (operation == 2)
                {   //multiply
                    savedNum *= saved;
                }
                else
                {   //divide
                    savedNum /= saved;
                }
                operation = 0;
                numberBar.setText(Double.toString(savedNum));
                edit = false;
                dot = false;
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double saved = Double.parseDouble(numberBar.getText().toString().trim());
                //int saved = 1;
                if (operation == -1)
                {
                    savedNum = saved;
                }
                else if (operation == 0)
                {   //add
                    savedNum += saved;
                }
                else if (operation == 1)
                {   //subtract
                    savedNum -= saved;
                }
                else if (operation == 2)
                {   //multiply
                    savedNum *= saved;
                }
                else
                {   //divide
                    savedNum /= saved;
                }
                operation = 1;
                numberBar.setText(Double.toString(savedNum));
                edit = false;
                dot = false;
            }
        });

        mult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double saved = Double.parseDouble(numberBar.getText().toString());
                if (operation == -1)
                {
                    savedNum = saved;
                }
                else if (operation == 0)
                {   //add
                    savedNum += saved;
                }
                else if (operation == 1)
                {   //subtract
                    savedNum -= saved;
                }
                else if (operation == 2)
                {   //multiply
                    savedNum *= saved;
                }
                else
                {   //divide
                    savedNum /= saved;
                }
                operation = 2;
                numberBar.setText(Double.toString(savedNum));
                edit = false;
                dot = false;
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double saved = Double.parseDouble(numberBar.getText().toString().trim());
                if (operation == -1)
                {
                    savedNum = saved;
                }
                else if (operation == 0)
                {   //add
                    savedNum += saved;
                }
                else if (operation == 1)
                {   //subtract
                    savedNum -= saved;
                }
                else if (operation == 2)
                {   //multiply
                    savedNum *= saved;
                }
                else
                {   //divide
                    savedNum /= saved;
                }
                operation = 3;
                numberBar.setText(Double.toString(savedNum));
                edit = false;
                dot = false;
            }
        });

        enter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double saved = Double.parseDouble(numberBar.getText().toString().trim());
                if (operation == -1)
                {
                    savedNum = saved;
                }
                else if (operation == 0)
                {   //add
                    savedNum += saved;
                }
                else if (operation == 1)
                {   //subtract
                    savedNum -= saved;
                }
                else if (operation == 2)
                {   //multiply
                    savedNum *= saved;
                }
                else
                {   //divide
                    savedNum /= saved;
                }
                operation = -1;
                numberBar.setText(Double.toString(savedNum));
                edit = false;
                dot = false;
            }
        });
    }
}
