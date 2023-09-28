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

public class MalamJabbaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malam_jabba);

        recyclerView = findViewById(R.id.contentRecyclerView);

        // Set up the RecyclerView with a GridLayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Initialize the list of all places
        allPlacesDetail = generateSamplePlaces();

        // Create an instance of the PlaceAdapter and set it on the RecyclerView
        placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
        recyclerView.setAdapter(placeDetailAdapter);


    }
    // Generate sample places for demonstration
    private List<PlaceDetail> generateSamplePlaces() {
        List<PlaceDetail> placeDetails = new ArrayList<>();

        PlaceDetail malamJabba = new PlaceDetail();
        malamJabba.setPlaceName("Malam Jabba");
        malamJabba.setPlaceNameDetail("Vantage Point of Beauty");
        malamJabba.setPlaceImage(R.drawable.malam_jabba);
        malamJabba.setPlaceDescription("Malam Jabba, situated in the heart of Khyber Pakhtunkhwa," +
                " stands as a mesmerizing jewel in the crown of Pakistani tourism. " +
                "This enchanting hill station, crowned by its majestic snow-capped peaks, offers an unparalleled experience for both adventure seekers and leisure travelers. Renowned for its exceptional skiing opportunities, Malam Jabba transforms into a winter wonderland, attracting enthusiasts from far and wide. Beyond its snowy charm, the summer months reveal a lush landscape carpeted with alpine flowers, making it a haven for nature enthusiasts and trekkers. The Malam Jabba Ski Resort, with its modern facilities and panoramic views, adds a touch of luxury to the rugged surroundings. The region's rich cultural heritage and warm hospitality further enhance the visitor experience, providing an opportunity to connect with local traditions. Whether it's indulging in outdoor activities, embracing the breathtaking scenery, or simply basking in the serenity of the mountains, " +
                "Malam Jabba promises an unforgettable journey that captures the essence of natural beauty and adventure.");
        malamJabba.setGalleryImages(Arrays.asList(
                R.drawable.malam_jabba,
                R.drawable.sawat_valley,
                R.drawable.mingora_sawat
        ));
        malamJabba.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        malamJabba.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.sawat_valley
//        ));
//        malamJabba.setNearbyPlacesNames(Arrays.asList(
//                "Sawat Valley"
//        ));
        placeDetails.add(malamJabba);

        return placeDetails;
    }

}
