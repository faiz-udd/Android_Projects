package com.example.PakVista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.ExpandingCircleView;

public class splashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //after the animation has finished, go to Main activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashActivity.this, MenuFragment.class );
                startActivity(intent);
                finish();
            }
        },2000);

        ExpandingCircleView expandingCircleView = findViewById(R.id.expandingCircleView);
        Animation expandAnimation = AnimationUtils.loadAnimation(splashActivity.this, R.anim.circle_anim);
        expandingCircleView.setVisibility(View.VISIBLE);
        expandingCircleView.startAnimation(expandAnimation);


    }

}