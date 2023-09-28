package com.example.PakVista;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.PakVista.R;

public class homeActivity extends AppCompatActivity {

    ImageView ProfileIcon, MenuIcon ;
    Button exploreButtonRecommended, exploreButtonLiked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        //Buttons and Clickable views Declaration
       //  ProfileIcon = findViewById(R.id.ImageViewProfile);
        exploreButtonRecommended = findViewById(R.id.ExploreButton);
        exploreButtonLiked = findViewById(R.id.ExploreButton2);
       // MenuIcon = findViewById(R.id.menuIcon);

        //menuIcon Click Listener
//        MenuIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(homeActivity.this, MenuFragement.class);
//                startActivity(intent);
//            }
//        });
        //Profile icon click Listener

//        ProfileIcon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(homeActivity.this, profileActivity.class);
//                startActivity(intent);
//            }
//        });

        //Recommended Explore Button
        exploreButtonRecommended.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeActivity.this, RecommendedPlacesActivity.class);
                startActivity(intent);
            }
        });

        //Liked Places Explore Button
        exploreButtonLiked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homeActivity.this, LikedPlacesActivity.class);
                startActivity(intent);
            }
        });
    }

}