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

public class ShigarValleyDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shigar_valley_detail);

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

        PlaceDetail shigarValley = new PlaceDetail();
        shigarValley.setPlaceName("Shigar Valley");
        shigarValley.setPlaceNameDetail("A valley steeped in heritage and natural beauty.");
        shigarValley.setPlaceImage(R.drawable.shigar_fort);
        shigarValley.setPlaceDescription("Shigar Valley, a picturesque gem nestled in the heart of Baltistan, " +
                "is a harmonious blend of history and breathtaking landscapes. The enchanting valley " +
                "is home to traditional Balti villages, where you can experience the warmth of local " +
                "hospitality and immerse yourself in the region's rich culture. The historic Shigar " +
                "Fort, a 17th-century palace, has been converted into a heritage guesthouse, offering " +
                "a glimpse into the past while providing modern comforts. The beauty of Shigar Valley " +
                "is enhanced by the mighty Karakoram Range that envelops it, and the mesmerizing views " +
                "of the surrounding peaks, including Masherbrum, captivate the imagination. The serene " +
                "Upper Shigar Valley leads to the Base Camp of some of the world's highest mountains, " +
                "such as Masherbrum and Saltoro Kangri. Shigar Valley invites you to explore its " +
                "unspoiled landscapes, historical treasures, and the hospitality of its people.");
        shigarValley.setGalleryImages(Arrays.asList(
                R.drawable.shigar_fort,
                R.drawable.shigar_valley
        ));
        shigarValley.setPlaceLocation(new LatLng(35.3342, 75.6357));
//        shigarValley.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.skardu
//        ));
//        shigarValley.setNearbyPlacesNames(Arrays.asList(
//                "Skardu"
//        ));
        placeDetails.add(shigarValley);

        return placeDetails;
    }
}
