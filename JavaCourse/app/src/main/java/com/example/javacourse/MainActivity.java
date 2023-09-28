package com.example.javacourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.ExpandingCircleView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExpandingCircleView expandingCircleView = findViewById(R.id.expandingCircleView);
        Animation expandAnimation = AnimationUtils.loadAnimation(this, R.anim.circle_anim);
        expandingCircleView.setVisibility(View.VISIBLE);
        expandingCircleView.startAnimation(expandAnimation);

    }
}