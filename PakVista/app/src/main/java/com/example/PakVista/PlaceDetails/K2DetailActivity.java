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

public class K2DetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k2_detail);

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

        PlaceDetail k2 = new PlaceDetail();
        k2.setPlaceName("K2");
        k2.setPlaceNameDetail("The second-highest mountain on Earth.");
        k2.setPlaceImage(R.drawable.k2_mountain);
        k2.setPlaceDescription("K2, also known as Mount Godwin-Austen, is not only the second-highest " +
                "mountain in the world but also an emblem of mountaineering challenge and allure. " +
                "Situated in the Karakoram Range, on the border between Pakistan and China, K2 " +
                "commands a magnetic attraction for climbers and adventurers from around the globe. " +
                "Its towering peak stands as a testament to human determination and exploration. " +
                "Scaling K2 is a feat that demands unparalleled skill and courage, and its summit " +
                "offers breathtaking panoramic views that reward those who conquer its slopes. The " +
                "K2 Base Camp is a hub of activity during climbing expeditions, buzzing with tents " +
                "and vibrant energy. The rugged beauty of the surrounding landscape, including the " +
                "Gilgit-Baltistan region, captures the imagination and lures explorers seeking " +
                "adventure in its purest form. K2 stands as an eternal icon of nature's grandeur and " +
                "human ambition, casting a spell on mountaineers and dreamers alike.");
        k2.setGalleryImages(Arrays.asList(
                R.drawable.campagnoni_k2,
                R.drawable.k2_north_west_face,
                R.drawable.k2_mountain
        ));
        k2.setPlaceLocation(new LatLng(35.8813, 76.5139));
//        k2.setNearbyPlace(Arrays.asList(
//                new Place( "Gilgit City",R.drawable.pir_ghaib),
//                new Place("Hunza Valley", R.drawable.hunza_valley)
//        ));
        placeDetails.add(k2);

        return placeDetails;
    }
}
