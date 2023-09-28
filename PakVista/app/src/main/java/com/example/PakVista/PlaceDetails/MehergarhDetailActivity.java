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

public class MehergarhDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehergarh_civilization_detail);

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

        PlaceDetail mehrgarhCivilization = new PlaceDetail();
        mehrgarhCivilization.setPlaceName("Mehrgarh Civilization");
        mehrgarhCivilization.setPlaceNameDetail("Unveiling the ancient roots of South Asia.");
        mehrgarhCivilization.setPlaceImage(R.drawable.mehrgarh_civilization);
        mehrgarhCivilization.setPlaceDescription("Mehrgarh, an archaeological marvel, unravels " +
                "the intriguing story of an ancient civilization that flourished over 8,000 years ago. " +
                "Located in Balochistan, it predates the Indus Valley Civilization and offers vital " +
                "insights into the evolution of early societies. The site's artifacts reveal the " +
                "agricultural advancements, intricate pottery, and skilled craftsmanship of its people. " +
                "Mehrgarh's significance lies in its role as a cradle of cultural practices that " +
                "laid the foundation for future civilizations. The site's unique burials and " +
                "architectural remnants reflect the complex rituals and social structures of its time. " +
                "Mehrgarh's legacy echoes through history, connecting modern Pakistan to its ancient " +
                "past and providing an invaluable glimpse into the origins of South Asian civilizations.");
        mehrgarhCivilization.setGalleryImages(Arrays.asList(
                R.drawable.mehrgarh_civilization,
                R.drawable.mehrgarh_painted_pottery
        ));
        mehrgarhCivilization.setPlaceLocation(new LatLng(29.405778, 68.151567));
//        mehrgarhCivilization.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.mehrgarh_location
//        ));
//        mehrgarhCivilization.setNearbyPlacesNames(Arrays.asList(
//                "Mehrgarh Site"
//        ));
        placeDetails.add(mehrgarhCivilization);

        return placeDetails;
    }
}
