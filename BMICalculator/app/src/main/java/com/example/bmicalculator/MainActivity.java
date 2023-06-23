package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variable initialization
        EditText EditTextWeight, EditTextHeight;
        Button calculateBMI;
        TextView BMI_Result;

        //Initialization of variable
        EditTextHeight = findViewById(R.id.editTextHeight);
        EditTextWeight = findViewById(R.id.editTextWeight);
        BMI_Result = findViewById(R.id.textViewResult);
        calculateBMI = findViewById(R.id.buttonCalculate);

        //OnClick Listener for Calculating BMI, it's a interface in Java, which should be defined
        //onclick Listener is an interface, means an abstract method, so we have to define it in the
        //overriden onclick Method.. New view.Onclick is a newly created object passed to the onClick listner inteface.
        calculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Retrieve user input values
                double weight = Double.parseDouble(EditTextWeight.getText().toString());
                double height = Double.parseDouble(EditTextHeight.getText().toString());
                double ht = height/100;


                // Calculate BMI
                double bmi = weight/ (ht * ht);
                if(bmi>25){
                    BMI_Result.setText("Your Over Weight and your Weight is: "+ bmi);
                }
                else if(bmi<18){
                    BMI_Result.setText("you are Under weight & you BMI result is: "+ bmi);
                }
                else{
                    // Display the result
                    BMI_Result.setText("Your BMI is Normal & your BMI is : " + bmi);

                }

            }
        });




    }
}