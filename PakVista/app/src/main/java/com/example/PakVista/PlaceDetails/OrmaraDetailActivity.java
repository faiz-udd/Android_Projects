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

public class OrmaraDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ormara_detail);

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

        PlaceDetail ormara = new PlaceDetail();
        ormara.setPlaceName("Ormara");
        ormara.setPlaceNameDetail("Coastal tranquility and naval significance.");
        ormara.setPlaceImage(R.drawable.ormara_city);
        ormara.setPlaceDescription("Ormara, a coastal gem in Balochistan, embraces visitors " +
                "with its serene beaches and maritime allure. The town's picturesque coastline " +
                "beckons beach enthusiasts, offering a tranquil escape from the bustle of life. " +
                "Ormara's strategic significance is further accentuated by its naval base, which " +
                "serves as a key outpost for Pakistan's naval forces. The clear azure waters " +
                "are ideal for diving and snorkeling, revealing a vibrant underwater world. The " +
                "area's marine life adds to the charm, with dolphin sightings being a common " +
                "occurrence. Beyond the shores, Ormara boasts a unique landscape of lush hills " +
                "and valleys, perfect for those who wish to explore the natural beauty of the region. " +
                "Whether it's enjoying the seaside tranquility or exploring the naval history, " +
                "Ormara encapsulates the coastal charm and naval pride of Balochistan.");
        ormara.setGalleryImages(Arrays.asList(
                R.drawable.jinah_naval_base_ormara,
                R.drawable.zero_point_ormara
        ));
        ormara.setPlaceLocation(new LatLng(25.210742, 64.635994));
//        ormara.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.jinah_naval_base_ormara
//        ));
//        ormara.setNearbyPlacesNames(Arrays.asList(
//                "Ormara Naval Base"
//        ));
        placeDetails.add(ormara);

        return placeDetails;
    }
}
