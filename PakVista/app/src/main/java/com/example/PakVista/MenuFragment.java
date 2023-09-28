package com.example.PakVista;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.PakVista.PlaceDetails.GilgitCityActivity;
import com.example.PakVista.PlaceDetails.IslamabadDetailActivity;
import com.example.PakVista.PlaceDetails.LahoreDetailActivity;
import com.example.PakVista.PlaceDetails.MohenjoDaroDetailActivity;
import com.example.PakVista.PlaceDetails.MurreeActivity;
import com.example.PakVista.PlaceDetails.swatValleyActivity;
import com.example.PakVista.Provinces.BalochistanActivity;
import com.example.PakVista.Provinces.GBActivity;
import com.example.PakVista.Provinces.KpActivity;
import com.example.PakVista.Provinces.PunjabActivity;
import com.example.PakVista.Provinces.SindhActivity;
import com.google.android.material.navigation.NavigationView;

public class MenuFragment extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolBar;
    Button exploreNorthernAreas, exploreLahore;
    ImageView ProfileIcon;

    CardView cardViewLahore, cardViewMohenjoDaro, cardViewQuetta, cardViewSawatValley, cardViewGBaltistan, cardViewMurree;

    FrameLayout frameLayout;

    CardView cardViewKP,cardViewPunjab, cardViewGB, cardViewSindh, cardViewBalochistan;


    private final static  String LOG_TAG = MenuFragment.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_fragment);



        drawerLayout = findViewById(R.id.DrawerLayout);
        navigationView = findViewById(R.id.NavigationView);
        toolBar= findViewById(R.id.toolBar);
        exploreNorthernAreas = findViewById(R.id.ExploreButton);
        //Buttons and Clickable views Declaration
        ProfileIcon = findViewById(R.id.ImageViewProfile);
        exploreLahore = findViewById(R.id.ExploreButton2);
        frameLayout = findViewById(R.id.fragment_container);

        //Card Views of Recommended Places
        cardViewLahore = findViewById(R.id.cardViewLahore);
        cardViewMohenjoDaro = findViewById(R.id.cardViewMohenjoDaro);
        cardViewQuetta = findViewById(R.id.cardViewIslamabad);

        //CardView of Liked Places

        cardViewSawatValley = findViewById(R.id.cardViewSawatValley);
        cardViewGBaltistan = findViewById(R.id.cardViewGBaltistan);
        cardViewMurree = findViewById(R.id.cardViewMurree);

        //CardView of Different Provinces
        cardViewKP = findViewById(R.id.cardViewKp);
        cardViewPunjab = findViewById(R.id.cardViewPunjab);
        cardViewGB = findViewById(R.id.cardViewGB);
        cardViewSindh = findViewById(R.id.cardViewSindh);
        cardViewBalochistan= findViewById(R.id.cardViewBalochistan);



        //ClickListener of Each Places
        cardViewKP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, KpActivity.class);
                startActivity(intent);
            }
        });


        cardViewPunjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, PunjabActivity.class);
                startActivity(intent);
            }
        });

        cardViewGB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, GBActivity.class);
                startActivity(intent);
            }
        });

        cardViewSindh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, SindhActivity.class);
                startActivity(intent);
            }
        });

        cardViewBalochistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, BalochistanActivity.class);
                startActivity(intent);
            }
        });


        //set Click Listener On Each Recommended places
        //CardViewPlace1
        cardViewLahore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, LahoreDetailActivity.class);
                startActivity(intent);
            }
        });

        //CardViewPlace2
        cardViewMohenjoDaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, MohenjoDaroDetailActivity.class);
                startActivity(intent);
            }
        });

        //CardViewPlace3
        cardViewQuetta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, IslamabadDetailActivity.class);
                startActivity(intent);
            }
        });

        //set ClickListener on Each Most Liked places
        //cardViewLikedPlace1
        cardViewSawatValley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, swatValleyActivity.class);
                startActivity(intent);
            }
        });

        //cardViewLikedPlace2
        cardViewGBaltistan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, GilgitCityActivity.class);
                startActivity(intent);
            }
        });

        //cardViewLikedPlace3
        cardViewMurree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, MurreeActivity.class);
                startActivity(intent);
            }
        });


        //set Up
        setSupportActionBar(toolBar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolBar,R.string.openDrawer, R.string.closeDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //Navigation click listener
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                getMenuInflater().inflate(R.menu.navigation_menu, (Menu) item);

                int id= item.getItemId();
                if(id==R.id.nav_home){
                    LoadHomeActivity();
                }else if(id==R.id.nav_share){

                } else if (id==R.id.nav_feature_request) {
                    LoadFragment(new RequestFeatureFragment());

                } else if (id==R.id.nav_privacy_policy) {
                    Toast.makeText(MenuFragment.this, "Privacy Policy", Toast.LENGTH_SHORT).show();

                } else if (id==R.id.nav_terms_conditions) {
                    Toast.makeText(MenuFragment.this, "Terms and Conditions", Toast.LENGTH_SHORT).show();

                } else if (id==R.id.nav_copyright) {
                    Toast.makeText(MenuFragment.this, "Copy Right", Toast.LENGTH_SHORT).show();


                } else if (id==R.id.nav_about_us) {
                    Toast.makeText(MenuFragment.this, "About", Toast.LENGTH_SHORT).show();

                } else{
                    Toast.makeText(MenuFragment.this, "Log Out", Toast.LENGTH_SHORT).show();

                }


                return true;
            }
        });

        exploreNorthernAreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, RecommendedPlacesActivity.class);
                startActivity(intent);
            }
        });
        //Profile icon click Listener

        ProfileIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, profileActivity.class);
                startActivity(intent);
            }
        });


        //Liked Places Explore Button
        exploreLahore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuFragment.this, LikedPlacesActivity.class);
                startActivity(intent);
            }
        });


    }

    private void LoadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_container, fragment);
        ft.commit();

    }

    private void LoadHomeActivity() {
        Intent intent = new Intent(MenuFragment.this, homeActivity.class);
        Toast.makeText(this, "In Home Page", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

}