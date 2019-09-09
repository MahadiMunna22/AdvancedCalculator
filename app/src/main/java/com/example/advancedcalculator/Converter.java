package com.example.advancedcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Converter extends AppCompatActivity {

    private EditText Taka,Dollar;
    private Button Convert;
    private String taka,dollar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        Taka = findViewById(R.id.TakaEditText);
        Dollar = findViewById(R.id.DollerEditText);
        Convert = findViewById(R.id.Converter);



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
    }
}
