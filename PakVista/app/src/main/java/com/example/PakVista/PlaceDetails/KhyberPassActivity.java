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

public class KhyberPassActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khyber_pass);

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

        PlaceDetail khyberPass = new PlaceDetail();
        khyberPass.setPlaceName("Khyber Pass");
        khyberPass.setPlaceNameDetail("Where history and geography converge in timeless grandeur");
        khyberPass.setPlaceImage(R.drawable.khyberpass);
        khyberPass.setPlaceDescription("The Khyber Pass, a legendary mountain corridor nestled between Pakistan" +
                " and Afghanistan, beckons to adventurers and history enthusiasts alike with its captivating" +
                " blend of natural beauty and historical significance. As one of the world's most iconic and" +
                " ancient trade routes, the pass has witnessed the footsteps of conquerors," +
                " traders, and travelers for centuries. Its rugged terrain and breathtaking vistas provide" +
                " a thrilling backdrop for those seeking an off-the-beaten-path experience." +
                " Exploring the Khyber Pass offers a unique opportunity to immerse oneself in the tales of empires," +
                " the exchange of cultures, and the passage of time etched into its rocky landscapes." +
                " The pass not only showcases the resilience of human endeavor but also connects travelers to the heart of the region's rich cultural tapestry. Whether it's marveling at the imposing Torkham Gate, visiting local markets, or tracing the footsteps of historical figures, the Khyber Pass promises an unforgettable journey through history and geography," +
                " where every step is a testament to the enduring spirit of exploration.");
        khyberPass.setGalleryImages(Arrays.asList(
                R.drawable.khyberpass,
                R.drawable.babe_khyber_peshawar,
                R.drawable.khyberpass_peshawar
        ));
        khyberPass.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        khyberPass.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.peshawar
//
//        ));
//        khyberPass.setNearbyPlacesNames(Arrays.asList(
//                "Peshawar"
//        ));
        placeDetails.add(khyberPass);

        return placeDetails;
    }

}
