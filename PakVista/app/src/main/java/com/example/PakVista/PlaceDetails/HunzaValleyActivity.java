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

public class HunzaValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hunza_valley);

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

        PlaceDetail hunzaValley = new PlaceDetail();
        hunzaValley.setPlaceName("Hunza Valley");
        hunzaValley.setPlaceNameDetail("Where serenity meets the majesty of the Karakoram Range.");
        hunzaValley.setPlaceImage(R.drawable.hunza_valley);
        hunzaValley.setPlaceDescription("Hunza Valley, an idyllic paradise nestled in the embrace of " +
                "the Karakoram Range, offers a mesmerizing blend of natural beauty and cultural heritage. " +
                "The iconic Rakaposhi, Ladyfinger Peak, and Ultar Sar peaks paint an awe-inspiring backdrop, " +
                "making it a haven for trekkers and nature enthusiasts. The centuries-old Baltit Fort stands " +
                "as a guardian of the valley's history, while the serene waters of Attabad Lake reflect the " +
                "majestic surroundings. The welcoming Hunza people, known for their vibrant traditions, " +
                "festivals, and warm hospitality, offer a glimpse into a way of life that cherishes community " +
                "and harmony. The Balti cuisine, with its diverse flavors and fresh produce, delights the " +
                "palate of visitors. Hunza Valley, with its pristine landscapes and cultural richness, " +
                "invites travelers to experience a symphony of tranquility and grandeur amidst nature's marvels.");
        hunzaValley.setGalleryImages(Arrays.asList(
                R.drawable.hunza_valley_spring,
                R.drawable.atabad_lake_hunza,
                R.drawable.hunza_valley
        ));
        hunzaValley.setPlaceLocation(new LatLng(36.3167, 74.6167)); // Coordinates are approximate
//        hunzaValley.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.atabad_lake_hunza
//        ));
//        hunzaValley.setNearbyPlacesNames(Arrays.asList(
//                "Attabad Lake Hunza"
//        ));
        placeDetails.add(hunzaValley);

        return placeDetails;
    }
}
