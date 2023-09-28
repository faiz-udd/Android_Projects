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

public class KalashValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalash_valley);

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

        PlaceDetail kalashValleyChitral = new PlaceDetail();
        kalashValleyChitral.setPlaceName("Kalash Valley, Chitral");
        kalashValleyChitral.setPlaceNameDetail("A vibrant cultural oasis in the mountains.");
        kalashValleyChitral.setPlaceImage(R.drawable.kalash_valley_ppl);
        kalashValleyChitral.setPlaceDescription("Kalash Valley, nestled in the heart of Chitral, " +
                "is a captivating cultural oasis that transports visitors to a world of vibrant traditions " +
                "and awe-inspiring landscapes. The valley is home to the indigenous Kalash people, who " +
                "have preserved their unique way of life, language, and customs for generations. The " +
                "festivals, such as the Chilim Jusht, Uchau, and Choimus, offer a window into the Kalash " +
                "culture. The valley's lush green meadows, terraced fields, and traditional wooden houses " +
                "paint a picturesque scene against the backdrop of towering mountains. As visitors explore " +
                "the valley, they can immerse themselves in the local hospitality and learn about the " +
                "Kalash people's mythology and folklore. Kalash Valley stands as a testament to the " +
                "enduring spirit of cultural diversity and harmonious coexistence with nature.");
        kalashValleyChitral.setGalleryImages(Arrays.asList(
                R.drawable.kalash_valley,
                R.drawable.kalash_valley_ppl,
                R.drawable.typical_home_kalash_valley
        ));
        kalashValleyChitral.setPlaceLocation(new LatLng(35.584159, 71.831702));
//        kalashValleyChitral.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.chitral
//        ));
//        kalashValleyChitral.setNearbyPlacesNames(Arrays.asList(
//                "Chitral"
//        ));
        placeDetails.add(kalashValleyChitral);

        return placeDetails;
    }
}
