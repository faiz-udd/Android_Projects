package com.example.practicelessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class AnimationActivity extends AppCompatActivity {
TextView textViewAnim;
Button Translation, Alpha, Scaling, Rotation, nextPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        textViewAnim= findViewById(R.id.textview1);
        Translation = findViewById(R.id.BtnTranslation);
        Alpha = findViewById(R.id.BtnAlpha);
        Scaling = findViewById(R.id.BtnScaling);
        Rotation = findViewById(R.id.BtnRotation);
        nextPage = findViewById(R.id.BtnNxt);

        //Animation
        Animation move = AnimationUtils.loadAnimation(this, R.anim.move);

        //Start Animation when Button is Clicked
        Translation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                textViewAnim.startAnimation(move);
            }
        });

        Alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                textViewAnim.startAnimation(alpha);
            }
        });

        Rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                textViewAnim.startAnimation(rotation);
            }
        });
        Scaling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation Scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                textViewAnim.startAnimation(Scale);
            }
        });
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AnimationActivity.this, lottieAnimation.class);
                startActivity(intent);
            }
        });
    }
}