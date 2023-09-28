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

public class NagarValleyDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagar_valley_detail);

        recyclerView = findViewById(R.id.contentRecyclerView);

        // Set up the RecyclerView with a LinearLayoutManager
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

        PlaceDetail nagarValley = new PlaceDetail();
        nagarValley.setPlaceName("Nagar Valley");
        nagarValley.setPlaceNameDetail("A tranquil haven in the shadow of giant peaks.");
        nagarValley.setPlaceImage(R.drawable.hopar_nagar_valley);
        nagarValley.setPlaceDescription("Nagar Valley, situated at the foot of towering mountains, " +
                "beckons with its serene landscapes and cultural heritage. The valley is home to " +
                "picturesque villages and orchards that flourish in the shadow of peaks like Rakaposhi " +
                "and Diran. The enchanting Hopar Valley is renowned for its lush green meadows and " +
                "crystalline lakes, creating a perfect setting for relaxation and exploration. The " +
                "ancient Altit Fort stands as a guardian of history, while the nearby Baltit Fort " +
                "offers panoramic views of the surrounding valleys. Nagar Valley's proximity to " +
                "Hunza Valley adds to its appeal, making it an ideal stop for those venturing " +
                "into the heart of Gilgit-Baltistan. Whether you're exploring cultural treasures, " +
                "admiring the majestic peaks, or simply soaking in the tranquility, Nagar Valley " +
                "offers a peaceful escape in the lap of nature.");
        nagarValley.setGalleryImages(Arrays.asList(
                R.drawable.golden_peak_nagar,
                R.drawable.bar_ter_nagar_valley
        ));
        nagarValley.setPlaceLocation(new LatLng(36.5234, 74.5006));
//        nagarValley.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.phandar_lake_ghizer
//        ));
//        nagarValley.setNearbyPlacesNames(Arrays.asList(
//                "Ghizer Valley"
//        ));
        placeDetails.add(nagarValley);

        return placeDetails;
    }
}
