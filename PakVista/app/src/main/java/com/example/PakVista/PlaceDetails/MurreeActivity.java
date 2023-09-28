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

public class MurreeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murree);

        recyclerView = findViewById(R.id.contentRecyclerViewLiked3);

        // Set up the RecyclerView with a GridLayoutManager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Initialize the list of all places
        allPlacesDetail = generateSamplePlaces();

        // Create an instance of the PlaceAdapter and set it on the RecyclerView
        placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
        placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
        recyclerView.setAdapter(placeDetailAdapter);

    }

    // Generate sample places for demonstration
    private List<PlaceDetail> generateSamplePlaces() {
        List<PlaceDetail> placeDetails = new ArrayList<>();

        PlaceDetail murree = new PlaceDetail();
        murree.setPlaceName("Murree");
        murree.setPlaceNameDetail("Where the mountains whisper tranquility and the air carries the promise of serenity.");
        murree.setPlaceImage(R.drawable.murree);
        murree.setPlaceDescription("\n" +
                "Murree, a cherished retreat nestled in the embrace of the Pir Panjal Range, stands as a beacon of tranquility and beauty in Pakistan's tourism landscape. With its lush forests, rolling hills, and panoramic vistas, this hill station offers an enchanting escape from the urban rush. The town's colonial-era architecture and bustling Mall Road add a touch of nostalgia to the experience, while the Murree Hills' cool climate provides respite from the summer heat. From Pindi Point's breathtaking overlooks to Kashmir Point's romantic charm, Murree invites visitors to explore its diverse landscapes. The city also serves as a gateway to nearby gems like Nathiagali and Ayubia, each offering their own unique allure. Whether it's the thrill of hiking through pine-scented trails, the joy of horseback rides, or simply reveling in the magic of snowfall during winters, Murree is a destination that promises" +
                " to rejuvenate the spirit and create cherished memories amidst nature's splendor.");
        murree.setGalleryImages(Arrays.asList(
                R.drawable.murree, R.drawable.trinity_church_murree,
                R.drawable.murree_expressway
        ));
        murree.setPlaceLocation(new LatLng(1.234567, 2.345678));
//        murree.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.pindi_point_muree
//        ));
//        murree.setNearbyPlacesNames(Arrays.asList(
//                "Pindi Point"
//        ));
        placeDetails.add(murree);


        // Add more places here

        return placeDetails;
    }
}