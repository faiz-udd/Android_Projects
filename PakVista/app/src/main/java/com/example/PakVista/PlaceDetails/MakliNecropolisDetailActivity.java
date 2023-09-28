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

public class MakliNecropolisDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makli_necropolis_detail);

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

        PlaceDetail makliNecropolis = new PlaceDetail();
        makliNecropolis.setPlaceName("Makli Necropolis");
        makliNecropolis.setPlaceNameDetail("A UNESCO World Heritage Site.");
        makliNecropolis.setPlaceImage(R.drawable.makli_necropolis);
        makliNecropolis.setPlaceDescription("The Makli Necropolis, located in the ancient city of " +
                "Thatta, is one of the largest funerary sites in the world and a UNESCO World Heritage Site. " +
                "This vast cemetery features impressive tombs and monuments spanning several centuries, " +
                "showcasing the diverse architectural styles and artistic influences of the region. The " +
                "intricate carvings, detailed tile work, and grand structures highlight the rich history " +
                "and culture of the Sindh region. Visitors to Makli Necropolis can explore the elaborate " +
                "mausoleums of rulers, scholars, and saints, each with its own unique story to tell. The " +
                "site offers a remarkable journey through time, revealing the artistic and cultural " +
                "achievements of bygone eras.");
        makliNecropolis.setGalleryImages(Arrays.asList(
                R.drawable.makli_necropolis,
                R.drawable.shah_jahan_mosque_thatta
        ));
        makliNecropolis.setPlaceLocation(new LatLng(24.7419, 67.9239));
//        makliNecropolis.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.tombs_malkli_necropolis_thata
//        ));
//        makliNecropolis.setNearbyPlacesNames(Arrays.asList(
//                "Thatta Tombs"
//        ));
        placeDetails.add(makliNecropolis);

        return placeDetails;
    }
}
