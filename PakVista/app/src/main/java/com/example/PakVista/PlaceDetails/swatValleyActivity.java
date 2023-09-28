package com.example.PakVista.PlaceDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.PakVista.Adapters.PlaceDetailAdapter;
import com.example.PakVista.PlaceDetail;
import com.example.PakVista.R;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class swatValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swat_valley);


        recyclerView = findViewById(R.id.contentRecyclerViewLiked1);

        // Set up the RecyclerView with a GridLayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Initialize the list of all places
        allPlacesDetail = generateSamplePlaces();

        // Create an instance of the PlaceAdapter and set it on the RecyclerView
        placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
        placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
        recyclerView.setAdapter(placeDetailAdapter);

    }

    // Generate sample places for demonstration
    private List<PlaceDetail> generateSamplePlaces() {
        List<PlaceDetail> placeDetails = new ArrayList<>();

        PlaceDetail sawat = new PlaceDetail();
        sawat.setPlaceName("Swat Valley");
        sawat.setPlaceNameDetail("Nature's masterpiece painted with lush green hues and tranquil serenity");
        sawat.setPlaceImage(R.drawable.sawat_valley);
        sawat.setPlaceDescription("Swat Valley, positioned in the northwestern region of Pakistan, beckons travelers with its spellbinding beauty and diverse attractions," +
                " making it a treasure trove from a tourism perspective. The valley's verdant meadows, majestic mountains, and crystalline rivers create an idyllic backdrop for outdoor enthusiasts and nature lovers. The allure of Swat lies not only in its awe-inspiring landscapes but also in its rich cultural heritage. The valley has been a historical crossroads, witnessing the footprints of ancient civilizations and leaving behind remnants that intrigue archaeologists and historians.\n" +
                "\n" +
                "Visitors to Swat have the chance to partake in a myriad of activities, " +
                "from adventurous hikes amidst the captivating scenery to moments of tranquility by the serene lakes. Swat is also known for its vibrant bazaars, where artisans showcase intricate handicrafts, and the local cuisine delights the taste buds with its unique flavors. The valley's legendary hospitality adds warmth to the experience, inviting travelers to immerse themselves in the local way of life.\n" +
                "\n" +
                "Swat's journey to reclaim its reputation as a tourism haven has been one of" +
                " resilience and renewal. Efforts have been made to preserve the natural beauty " +
                "while providing sustainable tourism opportunities for both locals and visitors." +
                " As Swat opens its arms to travelers, it offers not just a journey through breathtaking landscapes " +
                "but also a passage through time, allowing us to connect with nature, history, and the spirit of a community that welcomes us with open hearts.");
        sawat.setGalleryImages(Arrays.asList(
                R.drawable.sawat_valley, R.drawable.kaghan_valley,
                R.drawable.mingora_sawat, R.drawable.amlukdara_stupa
        ));
        sawat.setPlaceLocation(new LatLng(1.234567, 2.345678));
//        sawat.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.sawat_valley, R.drawable.mingora_sawat, R.drawable.amlukdara_stupa
//        ));
//        sawat.setNearbyPlacesNames(Arrays.asList(
//                "Sawat", "Mingora Swat", "Amlukdara Stupa Sawat"
//        ));
        placeDetails.add(sawat);


        // Add more places here

        return placeDetails;
    }
}