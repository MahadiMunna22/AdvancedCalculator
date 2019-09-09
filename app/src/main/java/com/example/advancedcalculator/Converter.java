package com.example.advancedcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Converter extends AppCompatActivity {

    private EditText Taka,Dollar,Cm,M,Feet,Inch,Kg,Pound,Celcius,Fahrenhiet;
    private String taka,dollar,cm,m,feet,inch,kg,pound,cel,fah;
    private double celcius;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        Taka = findViewById(R.id.TakaEditText);
        Dollar = findViewById(R.id.DollerEditText);
        Cm = findViewById(R.id.CmEditText);
        M = findViewById(R.id.MetreEditText);
        Feet = findViewById(R.id.FeetEditText);
        Inch = findViewById(R.id.InchEditText);
        Kg = findViewById(R.id.KgEditText);
        Pound = findViewById(R.id.PoundEditText);
        Celcius = findViewById(R.id.CelsiusEditText);
        Fahrenhiet = findViewById(R.id.FahrenheitEditText);

        //  Taka - Dollar
        Taka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                taka = Taka.getText().toString().trim();
                try {
                    Dollar.setText((Double.parseDouble(taka)/80)+"");
                } catch (NumberFormatException e) {

                }

            }
        });
        Dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dollar = Dollar.getText().toString().trim();
                try {
                    Taka.setText((Double.parseDouble(dollar)*80)+"");
                }
                catch (NumberFormatException e) {

                }
            }
        });

        //  Cm - M
        Cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm = Cm.getText().toString().trim();
                try {
                    M.setText((Double.parseDouble(cm)/100)+"");
                } catch (NumberFormatException e) {

                }

            }
        });
        M.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = M.getText().toString().trim();
                try {
                    Cm.setText((Double.parseDouble(m)*100)+"");
                }
                catch (NumberFormatException e) {

                }
            }
        });

        //  Kg - Pound
        Kg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kg = Kg.getText().toString().trim();
                try {
                    Pound.setText((Double.parseDouble(kg)*2.20462)+"");
                } catch (NumberFormatException e) {

                }

            }
        });
        Pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pound = Pound.getText().toString().trim();
                try {
                    Kg.setText(String.format("%.2f",(Double.parseDouble(pound)/2.20462)));
                }
                catch (NumberFormatException e) {

                }
            }
        });

        //  Feet - Inch
        Feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feet = Feet.getText().toString().trim();
                try {
                    Inch.setText((Double.parseDouble(feet)*12)+"");
                } catch (NumberFormatException e) {

                }

            }
        });
        Inch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inch = Inch.getText().toString().trim();
                try {
                    Feet.setText(String.format("%.2f",(Double.parseDouble(inch)/12)));
                }
                catch (NumberFormatException e) {

                }
            }
        });

        //  Celcius - Fahrenhiet
        Celcius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cel = Celcius.getText().toString().trim();
                try {
                    double faren = Double.parseDouble(cel)*(1.8)+32;
                    Fahrenhiet.setText(String.format("%.2f",faren)+"");
                } catch (NumberFormatException e) {

                }

            }
        });
        Fahrenhiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fah = Fahrenhiet.getText().toString().trim();
                try {
                    celcius = (Double.parseDouble(fah) - 32) * (5.0/9.0);
                    Celcius.setText(String.format("%.2f",celcius)+"");
                }
                catch (Exception e) {
                    Toast.makeText(getApplicationContext(),"got it",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
