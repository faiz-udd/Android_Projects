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

public class AyubiaNationalParkActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayubia_national_park);

        recyclerView = findViewById(R.id.contentRecyclerView);

        // Set up the RecyclerView with a GridLayoutManager
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

        PlaceDetail ayubiaNationalPark = new PlaceDetail();
        ayubiaNationalPark.setPlaceName("Ayubia National Park");
        ayubiaNationalPark.setPlaceNameDetail(" Nature's tranquility embraced in the heart of Pakistan");
        ayubiaNationalPark.setPlaceImage(R.drawable.ayubia_national_park);
        ayubiaNationalPark.setPlaceDescription("Nestled in the breathtaking beauty of the Himalayan foothills, " +
                "Ayubia National Park beckons to travelers seeking an idyllic retreat in Pakistan." +
                " This pristine sanctuary offers a refreshing escape from the hustle and bustle," +
                " inviting visitors to immerse themselves in nature's embrace. As you step into the park, " +
                "you'll be greeted by dense forests teeming with diverse flora and fauna, " +
                "creating an enchanting haven for wildlife enthusiasts and birdwatchers." +
                " The famous Mukshpuri and Miranjani hiking trails offer panoramic views that extend beyond the horizon," +
                " rewarding trekkers with a sense of accomplishment and breathtaking landscapes. " +
                "The chairlift ride to the top of Mukshpuri adds an element of adventure to your journey. " +
                "For those seeking quiet contemplation, " +
                "the Pindi Point viewpoint provides a serene vantage point to soak in the beauty of the surrounding hills and valleys. From the vibrant colors of spring to the snowy landscapes of winter, Ayubia National Park promises an ever-changing " +
                "canvas of natural wonders that captivate the senses and rejuvenate the spirit.");
        ayubiaNationalPark.setGalleryImages(Arrays.asList(
                R.drawable.ayubia_pakistan,
                R.drawable.ayubia_national_park,
                R.drawable.ayubia_national_park_board
        ));
        ayubiaNationalPark.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        ayubiaNationalPark.setNearbyPlace(Arrays.asList(
//                new Place( "Mushkpuri Top",R.drawable.muskpuri_top),
//                new Place("Nathia Galli", R.drawable.nathiya_galli)
//        ));
        placeDetails.add(ayubiaNationalPark);

        return placeDetails;
    }

}
