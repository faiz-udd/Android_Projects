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

public class FairyMeadowsDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fairy_meadows_detail);

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

        PlaceDetail fairyMeadows = new PlaceDetail();
        fairyMeadows.setPlaceName("Fairy Meadows");
        fairyMeadows.setPlaceNameDetail("A spellbinding paradise beneath Nanga Parbat.");
        fairyMeadows.setPlaceImage(R.drawable.fairy_meadows);
        fairyMeadows.setPlaceDescription("Fairy Meadows, nestled at the foot of the mighty Nanga Parbat, " +
                "is a captivating alpine meadow that lives up to its enchanting name. The lush green " +
                "valley, framed by snow-capped peaks and surrounded by dense forests, is a haven for " +
                "nature lovers and trekkers. The journey to Fairy Meadows includes a jeep ride and " +
                "a challenging hike, but the breathtaking landscape that unfolds is more than rewarding. " +
                "Nanga Parbat, the ninth-highest mountain in the world, towers over the meadows, casting " +
                "a mystical aura that evokes wonder and awe. The Base Camp for Nanga Parbat expeditions " +
                "is located here, attracting climbers and adventurers from across the globe. The serene " +
                "environment and clear starlit nights at Fairy Meadows offer a sense of tranquility " +
                "unmatched by urban life. Whether you're trekking, camping, or simply absorbing the " +
                "majestic scenery, Fairy Meadows transports you to a world of serenity and natural beauty.");
        fairyMeadows.setGalleryImages(Arrays.asList(
                R.drawable.fairy_meadows,
                R.drawable.nanga_parbat_fairymeadows
        ));
        fairyMeadows.setPlaceLocation(new LatLng(35.3534, 74.5834));
//        fairyMeadows.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.nanga_parbat_fairymeadows
//        ));
//        fairyMeadows.setNearbyPlacesNames(Arrays.asList(
//                "Nanga Parbat Base Camp"
//        ));
        placeDetails.add(fairyMeadows);

        return placeDetails;
    }
}
