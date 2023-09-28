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

public class GhizerDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghizer_detail);

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

        PlaceDetail ghizerValley = new PlaceDetail();
        ghizerValley.setPlaceName("Ghizer Valley");
        ghizerValley.setPlaceNameDetail("Where turquoise rivers and rugged peaks converge.");
        ghizerValley.setPlaceImage(R.drawable.phandar_lake_ghizer);
        ghizerValley.setPlaceDescription("Ghizer Valley, often referred to as the 'Pearl of Gilgit-Baltistan,' " +
                "captures the essence of Northern Pakistan's natural beauty. The valley is blessed with " +
                "turquoise rivers, pristine lakes, and majestic peaks that create a paradise for " +
                "nature enthusiasts and adventure seekers. The enchanting Phandar Lake, with its " +
                "crystal-clear waters, reflects the surrounding landscape like a mirror. The " +
                "Handarap Lake adds to the valley's allure, and the rugged landscapes provide a " +
                "canvas for trekkers and explorers. The cultural diversity of Ghizer Valley, with " +
                "its blend of languages and traditions, adds to its charm. As you explore the " +
                "villages and valleys, you'll discover a land of serenity and grandeur, where " +
                "the echoes of nature resonate and the beauty of the Karakoram Range unfolds.");
        ghizerValley.setGalleryImages(Arrays.asList(
                R.drawable.ishkoman_valley_ghizer,
                R.drawable.phandar_lake_ghizer
        ));
        ghizerValley.setPlaceLocation(new LatLng(36.3889, 73.7892));
//        ghizerValley.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.khaplu_palace
//        ));
//        ghizerValley.setNearbyPlacesNames(Arrays.asList(
//                "Khaplu Valley"
//        ));
        placeDetails.add(ghizerValley);

        return placeDetails;
    }
}
