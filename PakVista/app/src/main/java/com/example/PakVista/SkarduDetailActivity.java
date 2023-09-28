package com.example.PakVista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.PakVista.Adapters.PlaceDetailAdapter;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkarduDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skardu_detail);

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

        PlaceDetail skardu = new PlaceDetail();
        skardu.setPlaceName("Skardu");
        skardu.setPlaceNameDetail("Gateway to the mesmerizing landscapes of Baltistan.");
        skardu.setPlaceImage(R.drawable.skardu);
        skardu.setPlaceDescription("Skardu, situated at the confluence of the Shigar and Indus Rivers, " +
                "is a gateway to the captivating landscapes of Baltistan. Nestled amidst the towering " +
                "Himalayas, Skardu is a haven for adventure seekers, nature lovers, and explorers. The " +
                "majestic Shangrila Resort, known as the 'Heaven on Earth,' offers a serene retreat " +
                "with its turquoise lake and enchanting gardens. The surreal beauty of Shigar Valley, " +
                "with its lush orchards and historic forts, provides a glimpse into the region's rich " +
                "heritage. Skardu is also a launching point for treks to some of the world's highest " +
                "peaks, including K2 and Broad Peak. The breathtaking landscapes of the Skardu region " +
                "are best explored by taking a jeep safari to the surreal Deosai National Park, " +
                "where rolling plains and wildflowers stretch as far as the eye can see. Skardu's " +
                "charm is an invitation to discover the hidden treasures of Northern Pakistan.");
        skardu.setGalleryImages(Arrays.asList(
                R.drawable.jamia_mosque_skardu,
                R.drawable.katpana_lake_skardu,
                R.drawable.balturu_glacier_skardu
        ));
        skardu.setPlaceLocation(new LatLng(35.3031, 75.6316));
//        skardu.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.sheoser_lake_deosai_national_park
//        ));
//        skardu.setNearbyPlacesNames(Arrays.asList(
//                "Deosai National Park"
//        ));
        placeDetails.add(skardu);

        return placeDetails;
    }
}
