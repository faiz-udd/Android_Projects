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

public class SheikhuPuraDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheikhu_pura_detail);

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

        PlaceDetail sheikhupura = new PlaceDetail();
        sheikhupura.setPlaceName("Sheikhupura");
        sheikhupura.setPlaceNameDetail("Where history, gardens, and cultural gems flourish.");
        sheikhupura.setPlaceImage(R.drawable.fort_sheikhupura);
        sheikhupura.setPlaceDescription("Sheikhupura, a city steeped in history and graced with natural beauty, " +
                "offers a captivating journey through time and culture. The majestic Sheikhupura Fort " +
                "stands as a sentinel of the past, while Hiran Minar showcases the Mughal architectural " +
                "genius amidst lush gardens. The city's vibrant bazaars showcase local crafts and flavors, " +
                "inviting exploration. The spiritual essence of the city resonates in the elegant " +
                "Shahdara Mosque and the revered shrine of Hazrat Baba Fariduddin Ganjshakar. Sheikhupura's " +
                "lively festivals and agricultural fairs, like the famous Sheikhupura Horse and Cattle Show, " +
                "add to its cultural vibrancy. As the sun sets over the historic city, the Sheikhupura Fort " +
                "glows with a warm light, creating an atmosphere of serenity. Sheikhupura is a blend of " +
                "heritage, nature, and local charm that invites visitors to immerse themselves in its " +
                "captivating embrace.");
        sheikhupura.setGalleryImages(Arrays.asList(
                R.drawable.hiran_minar_sheikhupura,
                R.drawable.fort_sheikhupura
        ));
        sheikhupura.setPlaceLocation(new LatLng(31.7131, 73.9783));
//        sheikhupura.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.hiran_minar_sheikhupura,
//                R.drawable.baba_farid_shrine
//        ));
//        sheikhupura.setNearbyPlacesNames(Arrays.asList(
//                "Shahdara Mosque",
//                "Hazrat Baba Fariduddin Ganjshakar Shrine"
//        ));
        placeDetails.add(sheikhupura);

        return placeDetails;
    }
}
