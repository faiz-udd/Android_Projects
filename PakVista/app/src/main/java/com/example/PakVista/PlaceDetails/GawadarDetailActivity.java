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

public class GawadarDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gawadar_detail);

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

        PlaceDetail gwadar = new PlaceDetail();
        gwadar.setPlaceName("Gawadar");
        gwadar.setPlaceNameDetail("Gateway to economic prosperity and maritime connectivity.");
        gwadar.setPlaceImage(R.drawable.gwadar_coastline);
        gwadar.setPlaceDescription("Gwadar Port stands as a testament to Pakistan's strategic " +
                "positioning along the Arabian Sea, heralding immense economic potential. Serving as " +
                "the gateway to the China-Pakistan Economic Corridor (CPEC), the port is a hub of maritime " +
                "activity and trade. The port's deep-water facilities offer a critical route for " +
                "international shipping, fostering connectivity and development. Gwadar's coastline is " +
                "adorned with pristine beaches and azure waters, making it a haven for water sports " +
                "enthusiasts. The port's strategic importance extends to its role in transforming " +
                "Gwadar into a thriving metropolis, brimming with investment opportunities and " +
                "infrastructural advancements. As Gwadar evolves, it captivates visitors with its " +
                "blend of modernity and coastal charm, igniting dreams of economic prosperity and " +
                "maritime innovation.");
        gwadar.setGalleryImages(Arrays.asList(
                R.drawable.gwadar_coastline,
                R.drawable.gawadar_port
        ));
        gwadar.setPlaceLocation(new LatLng(25.121307, 62.320345));
//        gwadar.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.gwadar_coastline
//        ));
//        gwadar.setNearbyPlacesNames(Arrays.asList(
//                "Gwadar Coastline"
//        ));
        placeDetails.add(gwadar);

        return placeDetails;
    }
}
