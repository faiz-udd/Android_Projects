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

public class MohattaPalaceDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohatta_palace_detail);

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

        PlaceDetail mohattaPalace = new PlaceDetail();
        mohattaPalace.setPlaceName("Mohatta Palace");
        mohattaPalace.setPlaceNameDetail("A historical palace turned museum.");
        mohattaPalace.setPlaceImage(R.drawable.mohatta_palace);
        mohattaPalace.setPlaceDescription("The Mohatta Palace, located in Karachi, is a " +
                "remarkable architectural gem that showcases the blend of Indo-Islamic, " +
                "Rajput, and European architectural styles. Originally built as a residence " +
                "for the affluent Mohatta family, the palace now serves as a museum that " +
                "displays an extensive collection of artifacts, art, and historical relics. " +
                "Visitors can explore the elegant rooms, intricate designs, and beautifully " +
                "crafted ceilings that reflect the cultural and artistic heritage of the region. " +
                "The palace's distinctive pink color and exquisite carvings make it a " +
                "captivating sight. Mohatta Palace stands as a testament to Karachi's " +
                "rich history and the artistry of the past.");
        mohattaPalace.setGalleryImages(Arrays.asList(
                R.drawable.mohatta_palace_karachi,
                R.drawable.mohatta_palace
        ));
        mohattaPalace.setPlaceLocation(new LatLng(24.8133, 67.0395));
//        mohattaPalace.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.jinah_mouselem_karachi
//        ));
//        mohattaPalace.setNearbyPlacesNames(Arrays.asList(
//                "Quaid's Mausoleum"
//        ));
        placeDetails.add(mohattaPalace);

        return placeDetails;
    }
}
