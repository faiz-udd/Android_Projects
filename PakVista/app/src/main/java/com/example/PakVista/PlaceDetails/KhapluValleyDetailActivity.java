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

public class KhapluValleyDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaplu_valley_detail);

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

        PlaceDetail khapluValley = new PlaceDetail();
        khapluValley.setPlaceName("Khaplu Valley");
        khapluValley.setPlaceNameDetail("An oasis of tranquility amidst the Karakoram Range.");
        khapluValley.setPlaceImage(R.drawable.khaplu_palace);
        khapluValley.setPlaceDescription("Khaplu Valley, cradled within the embrace of the Karakoram " +
                "Range, is a hidden gem waiting to be discovered. The valley's lush orchards, " +
                "towering peaks, and picturesque villages create an idyllic escape for those " +
                "seeking peace and natural beauty. The historic Khaplu Palace, once a royal residence, " +
                "stands as a testament to the region's rich history. The remote beauty of Khaplu " +
                "Valley offers a chance to unwind in the lap of nature and explore trails that " +
                "lead to panoramic viewpoints. The Shyok River flows through the heart of the valley, " +
                "adding to its charm. As you wander through apricot groves and interact with the " +
                "friendly locals, you'll experience the warmth of Balti culture and the untouched " +
                "grandeur of this hidden oasis.");
        khapluValley.setGalleryImages(Arrays.asList(
                R.drawable.khaplu,
                R.drawable.khaplu_palace
        ));
        khapluValley.setPlaceLocation(new LatLng(35.2551, 76.6965));
//        khapluValley.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.hopar_nagar_valley
//        ));
//        khapluValley.setNearbyPlacesNames(Arrays.asList(
//                "Nagar Valley"
//        ));
        placeDetails.add(khapluValley);

        return placeDetails;
    }
}
