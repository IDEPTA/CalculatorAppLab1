package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText numOne;
    private EditText numTwo;
    private TextView  result;
    private Button buttonRes;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.Result);
        buttonRes = findViewById(R.id.buttonRes);
        numOne = findViewById(R.id.inputNum1);
        numTwo = findViewById(R.id.inputNum2);
        spinner = findViewById(R.id.spinner);
        buttonRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = numOne.getText().toString();
                String num2 = numTwo.getText().toString();
                String actions = spinner.getSelectedItem().toString();
                float res = 0;
                if(num1.equals("")||num2.equals("")) {
                    result.setText("Пустое значение");
                }
                else{
                    float numOneF = Float.parseFloat(num1);
                    float numTwoF = Float.parseFloat(num2);
                    switch (actions){
                        case "+":
                            res = numOneF+numTwoF;
                            break;
                        case "-":
                            res = numOneF-numTwoF;
                            break;
                        case "*":
                            res = numOneF*numTwoF;
                            break;
                        case "/":
                            res = numOneF/numTwoF;
                            break;
                    }
                    result.setText(String.valueOf(res));
                }
                /**/
            }
        });

    }


}