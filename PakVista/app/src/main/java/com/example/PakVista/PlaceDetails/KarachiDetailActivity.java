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

public class KarachiDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karachi_detail);

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

        PlaceDetail karachiCity = new PlaceDetail();
        karachiCity.setPlaceName("Karachi City");
        karachiCity.setPlaceNameDetail("Where vibrant cultures and city life converge.");
        karachiCity.setPlaceImage(R.drawable.karachi);
        karachiCity.setPlaceDescription("Karachi, Pakistan's largest city, pulses with the energy " +
                "of a cosmopolitan metropolis. Its vibrant streets, bustling markets, and diverse " +
                "neighborhoods offer a kaleidoscope of cultures, traditions, and flavors. The city " +
                "is home to historic landmarks such as the Quaid's Mausoleum and the iconic Karachi " +
                "Port. The Clifton Beach and its bustling seaside promenade provide a breath of " +
                "fresh air in the midst of urban life. Karachi's dining scene is a culinary journey, " +
                "offering a taste of local street food and international cuisine. The city's " +
                "entertainment options, from theaters to art galleries, cater to various interests. " +
                "Karachi's charm lies in its ability to captivate with its contrasts, where the " +
                "historical intertwines with the contemporary, and the vibrant cityscape meets the " +
                "tranquil Arabian Sea.");
        karachiCity.setGalleryImages(Arrays.asList(
                R.drawable.frere_hall,
                R.drawable.mohatta_palace_karachi,
                R.drawable.swami_narayn_temple_karachi
        ));
        karachiCity.setPlaceLocation(new LatLng(24.8607, 67.0011));
//        karachiCity.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.mohatta_palace_karachi
//        ));
//        karachiCity.setNearbyPlacesNames(Arrays.asList(
//                "Mohatta Palace"
//        ));
        placeDetails.add(karachiCity);

        return placeDetails;
    }
}
