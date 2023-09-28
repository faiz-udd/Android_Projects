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

public class KaghanValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaghan_valley);

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

        PlaceDetail kaghanValley = new PlaceDetail();
        kaghanValley.setPlaceName("Kaghan Valley");
        kaghanValley.setPlaceNameDetail(" Where nature's palette paints dreams with every hue");
        kaghanValley.setPlaceImage(R.drawable.galyat);
        kaghanValley.setPlaceDescription("Nestled within the embrace of the majestic Himalayan mountains in the Khyber Pakhtunkhwa province of Pakistan, Kaghan Valley is a veritable paradise for those seeking an enchanting escape into nature's embrace. Renowned for its awe-inspiring landscapes, crystal-clear rivers, and lush meadows, Kaghan Valley captivates the hearts of travelers with its unparalleled beauty. This pristine destination offers a range of activities for every adventurer, from trekking along scenic trails that lead to hidden alpine lakes, to experiencing the thrill of white-water rafting in the gushing Kunhar River. The valley's charming towns and villages provide a glimpse into the rich culture and warm hospitality of the locals. Traditional handicrafts, mouthwatering local cuisine, and vibrant festivals add a colorful layer to the experience. Whether it's the vibrant hues of wildflowers in spring, the cool breezes of summer, the golden hues of autumn, or the ethereal snow blanket of winter, Kaghan Valley transforms with the changing seasons, each unveiling its own enchanting charm. With a commitment to responsible tourism, the valley endeavors to preserve its pristine environment and protect its diverse wildlife. For those seeking a harmonious blend of adventure, tranquility, and cultural immersion, Kaghan Valley beckons with open arms, promising an " +
                "unforgettable journey into the heart of nature's masterpiece.");
        kaghanValley.setGalleryImages(Arrays.asList(
                R.drawable.kaghan_valley,
                R.drawable.galyat
        ));
        kaghanValley.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        kaghanValley.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.galyat
//        ));
//        kaghanValley.setNearbyPlacesNames(Arrays.asList(
//                "Galliyat"
//        ));
        placeDetails.add(kaghanValley);

        return placeDetails;
    }

}
