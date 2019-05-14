package com.example.myapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myapplication.R;
import com.example.myapplication.enums.SelectionWork;

public class ActivityMath extends AppCompatActivity {

    final public static double PROCENT = 0.13;

    private EditText inputValue;
    private TextView resultText;
    private Button buttonResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        inputValue = (EditText) findViewById(R.id.input_value);
        resultText = (TextView) findViewById(R.id.text_result);

        buttonResult = (Button)findViewById(R.id.button_result);
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int wage = Integer.valueOf(inputValue.getText().toString());
                    Double result = wage * PROCENT;
                    resultText.setText("НДФЛ с вашей заработной платы составит: "+result.intValue() + " рублей.");
                } catch (Exception ex) {
                    resultText.setText("Произошла ошибка при рассчетах. Проверьте правильность ввода.");
                }
            }
        });

    }

}
