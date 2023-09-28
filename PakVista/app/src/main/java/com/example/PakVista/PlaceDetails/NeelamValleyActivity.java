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

public class NeelamValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neelam_valley);

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

        PlaceDetail neelamValley = new PlaceDetail();
        neelamValley.setPlaceName("Neelam Valley");
        neelamValley.setPlaceNameDetail("A paradise of lush valleys and serene lakes.");
        neelamValley.setPlaceImage(R.drawable.neelum_valley_kashmir);
        neelamValley.setPlaceDescription("Neelam Valley, often referred to as the 'Blue Gem of " +
                "Pakistan,' is a picturesque paradise nestled in Azad Kashmir. The valley's " +
                "breathtaking beauty is marked by lush green valleys, meandering rivers, and " +
                "majestic mountains. From the enchanting Shounter Lake to the stunning Ratti Gali " +
                "Lake, the area boasts serene bodies of water that mirror the surrounding " +
                "landscape. The Dudipatsar Lake, a milky turquoise gem, is a trekker's delight " +
                "nestled amidst snow-capped peaks. The valley's charming towns, like Sharda and " +
                "Kel, offer a glimpse into the local way of life and heritage. Neelam Valley " +
                "comes alive with blossoming flowers in spring and offers a cool escape in " +
                "summer. A visit to this scenic haven promises an immersion into nature's grandeur.");
        neelamValley.setGalleryImages(Arrays.asList(
                R.drawable.neelum_valley_kashmir,
                R.drawable.neelum_river_kashmir,
                R.drawable.hunza_valley_spring
        ));
        neelamValley.setPlaceLocation(new LatLng(34.741869, 74.366392));
//        neelamValley.setNearbyPlacesImages(Arrays.asList(
//               R.drawable.azad_kashmir
//        ));
//        neelamValley.setNearbyPlacesNames(Arrays.asList(
//                "Azad Kashmir"
//        ));
        placeDetails.add(neelamValley);

        return placeDetails;
    }
}
