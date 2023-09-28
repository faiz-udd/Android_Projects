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

public class PunjkoraValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjkora_valley);

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

        PlaceDetail panjkora = new PlaceDetail();
        panjkora.setPlaceName("Panjkora valley");
        panjkora.setPlaceNameDetail("Where the river's melody narrates tales of timeless beauty");
        panjkora.setPlaceImage(R.drawable.panjkora_valley);
        panjkora.setPlaceDescription("Nestled amidst the picturesque landscapes of Khyber Pakhtunkhwa, " +
                "the Panjkora Valley stands as a hidden gem awaiting discovery from a tourism perspective. Its serene beauty and tranquil ambiance offer a respite for travelers seeking an escape from the hustle and bustle of city life. The valley is cradled by rolling hills, adorned with lush meadows, and graced by the gentle flow of the Panjkora River, which winds its way through the heart of the region. This idyllic setting creates a perfect backdrop for outdoor enthusiasts, trekkers, and nature lovers. The valley's unspoiled charm and warm hospitality of its people add to its allure, making it an ideal destination for those yearning for an authentic and off-the-beaten-path experience. Whether it's hiking along the riverbanks, exploring the surrounding woodlands, or simply immersing oneself in the simplicity of rural life, the Panjkora Valley promises a " +
                "journey that rejuvenates the soul and connects visitors to the raw beauty of nature.");
        panjkora.setGalleryImages(Arrays.asList(
                R.drawable.panjkora_valley,
                R.drawable.river_panjkora
        ));
        panjkora.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        panjkora.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.kumrat_dir
//        ));
//        panjkora.setNearbyPlacesNames(Arrays.asList(
//                "Kumrat Dir"
//        ));
        placeDetails.add(panjkora);

        return placeDetails;
    }

}
