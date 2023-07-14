package com.example.practicelessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lottieAnimation extends AppCompatActivity {

    Button NextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_animation);

        NextPage = findViewById(R.id.btnNext);
        NextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inext = new Intent(lottieAnimation.this, ListViewActivity.class);
                startActivity(inext);
            }
        });

    }
}