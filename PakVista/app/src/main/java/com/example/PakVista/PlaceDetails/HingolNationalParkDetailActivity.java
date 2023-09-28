package com.example.PakVista.PlaceDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.PakVista.PlaceDetail;
import com.example.PakVista.Adapters.PlaceDetailAdapter;
import com.example.PakVista.R;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HingolNationalParkDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hingol_national_park_detail);

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

        PlaceDetail hingolNationalPark = new PlaceDetail();
        hingolNationalPark.setPlaceName("Hingol National Park");
        hingolNationalPark.setPlaceNameDetail("A natural sanctuary in the heart of Balochistan.");
        hingolNationalPark.setPlaceImage(R.drawable.hinglaj_matta_temple);
        hingolNationalPark.setPlaceDescription("Hingol National Park, a captivating natural " +
                "sanctuary nestled in the heart of Balochistan, enchants with its diverse landscapes " +
                "and vibrant biodiversity. The park's dramatic terrain is adorned with rugged mountains, " +
                "lush green valleys, and flowing rivers, offering a breathtaking backdrop for " +
                "nature enthusiasts and adventure seekers alike. The haunting beauty of the " +
                "Princess of Hope, a naturally formed rock formation, adds to the park's allure. " +
                "The park's pristine beaches, like Kund Malir, provide a serene escape, while " +
                "migratory birds grace the skies, making it a haven for birdwatchers. The " +
                "ecological diversity of Hingol National Park is complemented by its historical " +
                "and cultural significance, making it a true testament to the region's natural " +
                "and human heritage.");
        hingolNationalPark.setGalleryImages(Arrays.asList(
                R.drawable.princess_of_hope,
                R.drawable.mud_volcano_hingol,
                R.drawable.hinglaj_matta_temple
        ));
        hingolNationalPark.setPlaceLocation(new LatLng(26.523333, 66.399167));
//        hingolNationalPark.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.rock_formation_hingol
//        ));
//        hingolNationalPark.setNearbyPlacesNames(Arrays.asList(
//                "Hingol Beach area"
//        ));
        placeDetails.add(hingolNationalPark);

        return placeDetails;
    }
}
