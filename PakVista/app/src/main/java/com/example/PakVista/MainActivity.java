package com.example.PakVista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText searchBarEditText;
    Button createButton;
    TextView loginButton, privacyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBarEditText= findViewById(R.id.searchPlaceEditText);
        createButton = findViewById(R.id.createButton);
        loginButton= findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, loginActivity.class);
                startActivity(intent);
            }
        });

        //when create bUtton is clicked
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, signupActivity.class);
                startActivity(intent);
            }
        });

        //to show privacy Terms and Conditions
//       privacyButton.setOnClickListener(new View.OnClickListener() {
//           @Override
//          public void onClick(View view) {
//             Intent intent = new Intent(MainActivity.this, privacyPolicy.class);
//              startActivity(intent);
//           }
//       });
    }
}