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

public class JhelumDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jhelum_detail);

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

        PlaceDetail jhelum = new PlaceDetail();
        jhelum.setPlaceName("Jhelum");
        jhelum.setPlaceNameDetail("Where history flows along the riverbanks.");
        jhelum.setPlaceImage(R.drawable.rohtas_fort_jhelum);
        jhelum.setPlaceDescription("Jhelum, a city that traces its origins back through centuries, " +
                "invites visitors to explore its historical significance and the tranquil charm of the Jhelum River. " +
                "The Rohtas Fort, an architectural marvel and UNESCO World Heritage Site, stands as a testament " +
                "to ancient defenses and engineering brilliance. Jhelum's rich heritage is reflected in the " +
                "Rasul Barrage, which not only manages the river's flow but also offers a picturesque view " +
                "of the surroundings. As you stroll through Jhelum's bazaars, the echoes of the past intertwine " +
                "with modern life, creating a vibrant atmosphere. The city's strategic location has attracted " +
                "settlers and conquerors alike, leaving their mark in the form of landmarks like the Grand " +
                "Trunk Road. With its historical sites, cultural diversity, and the peaceful flow of the Jhelum River, " +
                "Jhelum provides a journey that bridges time and offers a serene escape from the urban rhythm.");
        jhelum.setGalleryImages(Arrays.asList(
                R.drawable.major_akram_memorial_jhelum,
                R.drawable.university_of_punjab_jhelum
        ));
        jhelum.setPlaceLocation(new LatLng(32.934134, 73.729684));
//        jhelum.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.rohtas_fort_jhelum
//        ));
//        jhelum.setNearbyPlacesNames(Arrays.asList(
//                "Rohtas Fort"
//        ));
        placeDetails.add(jhelum);

        return placeDetails;
    }
}
