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

public class EmpressMarketDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empress_market_detail);

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

        PlaceDetail empressMarket = new PlaceDetail();
        empressMarket.setPlaceName("Empress Market");
        empressMarket.setPlaceNameDetail("A historic marketplace in Karachi.");
        empressMarket.setPlaceImage(R.drawable.empress_market);
        empressMarket.setPlaceDescription("Empress Market, situated in the heart of Karachi, " +
                "is a historic marketplace that has stood as a symbol of the city's commerce " +
                "and heritage for over a century. The market's iconic red-brick architecture " +
                "and domed entrance capture the essence of British colonial design. Inside, " +
                "visitors can explore a diverse array of stalls offering everything from fresh " +
                "produce and spices to clothing, handicrafts, and antiques. The market's bustling " +
                "atmosphere, intricate details, and unique character make it a favorite " +
                "destination for both locals and tourists. Empress Market provides a glimpse " +
                "into Karachi's vibrant culture and trading history.");
        empressMarket.setGalleryImages(Arrays.asList(
                R.drawable.empress_market,
                R.drawable.empress_market_karachi
        ));
        empressMarket.setPlaceLocation(new LatLng(24.8606, 67.0276));
//        empressMarket.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.jinah_mouselem_karachi,
//                R.drawable.mohatta_palace
//        ));
//        empressMarket.setNearbyPlacesNames(Arrays.asList(
//                "Quaid's Mausoleum",
//                "Mohatta Palace"
//        ));
        placeDetails.add(empressMarket);

        return placeDetails;
    }
}
