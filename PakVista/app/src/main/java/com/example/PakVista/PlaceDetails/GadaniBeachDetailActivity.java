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

public class GadaniBeachDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gadani_beach_detail);

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

        PlaceDetail gadaniBeach = new PlaceDetail();
        gadaniBeach.setPlaceName("Gadani Beach");
        gadaniBeach.setPlaceNameDetail("A picturesque coastline and shipbreaking industry.");
        gadaniBeach.setPlaceImage(R.drawable.gadani_beach);
        gadaniBeach.setPlaceDescription("Gadani Beach, nestled along the Arabian Sea, " +
                "beckons with its captivating blend of natural beauty and maritime industry. The " +
                "azure waters and sandy shores provide a serene backdrop for relaxation and leisure, " +
                "making it a favorite destination for beachgoers. The beach also holds a unique " +
                "connection to Pakistan's shipbreaking industry, with its shipbreaking yards " +
                "where massive vessels are dismantled. This industrial landscape offers an " +
                "insight into the fascinating process of ship recycling, highlighting the " +
                "resourcefulness and ingenuity of local workers. Gadani Beach's vibrant coastal " +
                "culture, with its bustling seafood markets and beachside activities, paints a " +
                "portrait of a community intertwined with the sea. Whether it's enjoying a " +
                "picturesque sunset or witnessing the shipbreaking spectacle, Gadani Beach " +
                "presents an experience that blends natural wonder with maritime heritage.");
        gadaniBeach.setGalleryImages(Arrays.asList(
                R.drawable.ship_yard_gadani_beach,
                R.drawable.gadani_beach_view
        ));
        gadaniBeach.setPlaceLocation(new LatLng(25.173526, 66.697689));
//        gadaniBeach.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.gadani_beach_view
//        ));
//        gadaniBeach.setNearbyPlacesNames(Arrays.asList(
//                "Gadani Viewpoint"
//        ));
        placeDetails.add(gadaniBeach);

        return placeDetails;
    }
}
