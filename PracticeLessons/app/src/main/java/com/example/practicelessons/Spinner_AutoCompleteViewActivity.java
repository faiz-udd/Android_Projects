package com.example.practicelessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class Spinner_AutoCompleteViewActivity extends AppCompatActivity {
    Button NextActivity;

    Spinner spinner;
    int[] arrNo = new int[]{1, 2, 3, 4,5, 6};
    AutoCompleteTextView autoCompleteTextView;

    ArrayList<String> arrIDs = new ArrayList<>();
    ArrayList<String> arrLanguages = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_auto_complete_view);

        spinner = findViewById(R.id.spinner);
        autoCompleteTextView= findViewById(R.id.AutoCompletView);



        //add Items to arrIDs spinner

        arrIDs.add("Credit Card");
        arrIDs.add("Debit Card");
        arrIDs.add("CNICard");
        arrIDs.add("Health Insurance Card");
        arrIDs.add("Student ID Card");
        arrIDs.add("Library Card");


        //Add Items to ArrLanguages AutoCompleteTextView
        arrLanguages.add("C++");
        arrLanguages.add("Python");
        arrLanguages.add("Java");
        arrLanguages.add("HTML");
        arrLanguages.add("Kotlin");
        arrLanguages.add("C");
        arrLanguages.add("JavaScript");

//for Spinner
        ArrayAdapter<String> SpinnerAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, arrIDs);
        spinner.setAdapter(SpinnerAdapter);

        //for AutoCOmpleteTextView

        ArrayAdapter<String> AutoComplteTextviewAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrLanguages);
        autoCompleteTextView.setAdapter(AutoComplteTextviewAdapter);
        autoCompleteTextView.setThreshold(1); //list should start auto complete after two letters entered

        // TODO FINISH ME


        //Next Activity
        NextActivity = findViewById(R.id.btnNextpage);
        NextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext = new Intent(Spinner_AutoCompleteViewActivity.this, RecyclerViewActivity.class);
                startActivity(inext);
            }
        });

    }
}