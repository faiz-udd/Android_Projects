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

public class GujranwalaDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujranwala_detail);

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

        PlaceDetail gujranwala = new PlaceDetail();
        gujranwala.setPlaceName("Gujranwala");
        gujranwala.setPlaceNameDetail("Where tradition and industry thrive side by side.");
        gujranwala.setPlaceImage(R.drawable.clock_tower_gujranwala);
        gujranwala.setPlaceDescription("Gujranwala, known as the 'City of Wrestlers,' is a city that " +
                "blends cultural heritage with the vigor of modern life. The iconic Clock Tower stands as " +
                "a symbol of the city's historic core, surrounded by bustling bazaars and a vibrant " +
                "commercial spirit. The city's legacy in wrestling is celebrated through the monumental " +
                "statue of 'Pehlwans' (wrestlers), commemorating its sports tradition. Gujranwala's position " +
                "as an industrial hub adds an energetic pulse to the city, with textile and manufacturing " +
                "sectors shaping its economic landscape. Despite its urban pace, Gujranwala offers moments " +
                "of reprieve in the form of verdant parks and serene lakes, like the Jinnah Park. The city's " +
                "cuisine, notably 'Gujranwala Sweets,' offers a delectable taste of its cultural diversity. " +
                "Gujranwala's fusion of heritage, commerce, and community spirit creates an engaging tapestry " +
                "that invites visitors to witness the harmony of tradition and progress.");
        gujranwala.setGalleryImages(Arrays.asList(
                R.drawable.nisha_e_manzil_gujranwala,
                R.drawable.clock_tower_gujranwala,
                R.drawable.tomp_of_maha_singh_gujranawala
        ));
        gujranwala.setPlaceLocation(new LatLng(32.161673, 74.188658));
//        gujranwala.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.ranjeet_singh_birthplace_gujranwala
//        ));
//        gujranwala.setNearbyPlacesNames(Arrays.asList(
//                "Tomb of Maha Singh"
//        ));
        placeDetails.add(gujranwala);

        return placeDetails;
    }
}
