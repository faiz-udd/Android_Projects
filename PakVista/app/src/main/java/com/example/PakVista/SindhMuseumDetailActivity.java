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

public class SindhMuseumDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sindh_museum_detail);

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

        PlaceDetail sindhMuseum = new PlaceDetail();
        sindhMuseum.setPlaceName("Sindh Museum");
        sindhMuseum.setPlaceNameDetail("Exploring the history and culture of Sindh.");
        sindhMuseum.setPlaceImage(R.drawable.sindh_museum);
        sindhMuseum.setPlaceDescription("The Sindh Museum is a cultural treasure trove that " +
                "offers a captivating journey through the history and heritage of the Sindh region. " +
                "The museum's extensive collection includes artifacts, manuscripts, artworks, and " +
                "relics that depict the diverse cultural and historical aspects of Sindh. Visitors " +
                "can explore exhibits showcasing the region's rich archaeological discoveries, " +
                "traditional crafts, music, and folk art. The museum's galleries provide insights " +
                "into the lives and traditions of the people of Sindh, making it a valuable resource " +
                "for those interested in the history and culture of the region.");
        sindhMuseum.setGalleryImages(Arrays.asList(
                R.drawable.sindh_museum,
                R.drawable.sindh_muesum_exterior
        ));
        sindhMuseum.setPlaceLocation(new LatLng(25.2802, 68.3471));
//        sindhMuseum.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.makli_necropolis
//        ));
//        sindhMuseum.setNearbyPlacesNames(Arrays.asList(
//                "Makli Necropolis"
//        ));
        placeDetails.add(sindhMuseum);

        return placeDetails;
    }
}
