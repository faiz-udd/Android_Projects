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

public class QuettaDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quetta_detail);

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

        PlaceDetail quetta = new PlaceDetail();
        quetta.setPlaceName("Quetta");
        quetta.setPlaceNameDetail("A city of contrast and natural beauty.");
        quetta.setPlaceImage(R.drawable.quetta);
        quetta.setPlaceDescription("Quetta, the capital of Balochistan, stands as a unique " +
                "blend of cultural diversity and natural splendor. Nestled amidst mountains, " +
                "the city offers a picturesque landscape that includes the famous Chiltan National Park. " +
                "Quetta's vibrant bazaars showcase local crafts and goods, and the bustling " +
                "streets are a testament to its cultural dynamism. The Hazarganji Chiltan National " +
                "Park preserves the region's flora and fauna, while Hanna Lake offers a serene " +
                "retreat for locals and visitors alike. The Bolan Pass, an ancient route, leads " +
                "to rugged terrains that have witnessed the passage of history. Quetta's " +
                "architectural marvels, like the Hazrat Sultan Bahu Shrine, reflect the city's " +
                "spiritual essence. From the scenic Ziarat Valley to the energetic local markets, " +
                "Quetta beckons with its harmonious contrasts and vibrant charm.");
        quetta.setGalleryImages(Arrays.asList(
                R.drawable.quetta,
                R.drawable.hanna_lake_quetta,
                R.drawable.quetta_cantt
        ));
        quetta.setPlaceLocation(new LatLng(30.1798, 66.9750));
//        quetta.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.ziarat_valley_balochistan
//        ));
//        quetta.setNearbyPlacesNames(Arrays.asList(
//                "Ziarat Valley"
//        ));
        placeDetails.add(quetta);

        return placeDetails;
    }
}
