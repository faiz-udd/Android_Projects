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

public class GorakhHillStationDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gorakh_hill_station_detail);

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

        PlaceDetail gorakhHillStation = new PlaceDetail();
        gorakhHillStation.setPlaceName("Gorakh Hill Station");
        gorakhHillStation.setPlaceNameDetail("A scenic getaway in the Kirthar Mountains.");
        gorakhHillStation.setPlaceImage(R.drawable.gorakh_hilltop);
        gorakhHillStation.setPlaceDescription("Gorakh Hill Station, situated in the picturesque " +
                "Kirthar Mountains, is a serene escape from the hustle and bustle of city life. With " +
                "its cool climate and breathtaking landscapes, it offers a perfect retreat for " +
                "nature enthusiasts and adventure seekers. The hill station is known for its " +
                "uniquely pleasant weather even during the scorching summer months. Visitors can " +
                "explore hiking trails, enjoy the panoramic views from the hilltop, and experience " +
                "camping under the starry sky. The beauty of Gorakh Hill Station lies in its " +
                "untouched natural surroundings and the sense of tranquility it offers.");
        gorakhHillStation.setGalleryImages(Arrays.asList(
                R.drawable.gorakh_hilltop,
                R.drawable.gorakh_hill_station
        ));
        gorakhHillStation.setPlaceLocation(new LatLng(26.9814, 67.4758));
//        gorakhHillStation.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.kirthur_natinal_park
//        ));
//        gorakhHillStation.setNearbyPlacesNames(Arrays.asList(
//                "Kirthar National Park"
//        ));
        placeDetails.add(gorakhHillStation);

        return placeDetails;
    }
}
