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

public class GilgitCityActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gilgit_city);

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

        PlaceDetail gilgitBaltistan = new PlaceDetail();
        gilgitBaltistan.setPlaceName("Gilgit City");
        gilgitBaltistan.setPlaceNameDetail("Where peaks touch the sky and culture thrives.");
        gilgitBaltistan.setPlaceImage(R.drawable.gilgit);
        gilgitBaltistan.setPlaceDescription("Gilgit Baltistan, a land of towering peaks, azure lakes, " +
                "and a rich cultural mosaic, beckons travelers to explore its breathtaking landscapes. " +
                "The Karakoram Highway, often called the 'Eighth Wonder of the World,' provides an " +
                "adventurous route to this region, offering awe-inspiring vistas along the way. The " +
                "Hunza Valley, with its vibrant orchards and the ancient Baltit Fort, is a testament " +
                "to both nature's splendor and human ingenuity. The shimmering waters of Attabad Lake " +
                "add to the region's allure. The region's diverse cultures are showcased in its festivals, " +
                "traditional music, and handwoven textiles. The Khunjerab Pass, the highest border crossing " +
                "between China and Pakistan, stands as a gateway to cross-cultural exploration. Gilgit Baltistan's " +
                "majestic landscapes and cultural richness invite travelers to witness a harmonious blend " +
                "of nature's grandeur and human heritage.");
        gilgitBaltistan.setGalleryImages(Arrays.asList(
                R.drawable.hunza_valley,
                R.drawable.skardu,
                R.drawable.phandar_lake_ghizer
        ));
        gilgitBaltistan.setPlaceLocation(new LatLng(35.314207, 75.584860));
//        gilgitBaltistan.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.skardu
//        ));
//        gilgitBaltistan.setNearbyPlacesNames(Arrays.asList(
//                "Skardu"
//        ));
        placeDetails.add(gilgitBaltistan);

        return placeDetails;
    }
}
