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

public class ShandurPassActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shandur_pass);

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

        PlaceDetail shandur_pass = new PlaceDetail();
        shandur_pass.setPlaceName("Shandur Pass");
        shandur_pass.setPlaceNameDetail("Where the sky meets the earth, and legends of rugged beauty unfold");
        shandur_pass.setPlaceImage(R.drawable.shandur_pass);
        shandur_pass.setPlaceDescription("Nestled in the heart of the Gilgit-Baltistan region of Pakistan," +
                " Shandur Pass stands as an awe-inspiring testament to nature's grandeur. " +
                "Dubbed the \"Roof of the World,\" this high-altitude wonder offers intrepid travelers a unique and unforgettable adventure. At an elevation of around 3,700 meters, Shandur Pass showcases a mesmerizing landscape where rolling meadows meet the heavens.\n" +
                "\n" +
                "Renowned for hosting the annual Shandur Polo Festival, this pass not only offers a breathtaking panorama of the surrounding mountains but also provides a platform for cultural exchange through the age-old sport of polo." +
                " A visit to Shandur Pass is an opportunity to immerse oneself in the traditional lifestyle of the indigenous people, savor the crisp mountain air, and witness the splendid interplay of light and shadow on the vast expanse of the Shandur Lake.\n" +
                "\n" +
                "Whether you're an avid adventurer seeking trekking trails that traverse the challenging terrain or a cultural enthusiast eager to engage with local communities, Shandur Pass beckons with its blend of natural beauty and cultural vibrancy, promising an experience that resonates long after you've left its lofty embrace.");
        shandur_pass.setGalleryImages(Arrays.asList(
                R.drawable.shandur_pass,
                R.drawable.shandur_lake
        ));
        shandur_pass.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        shandur_pass.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.gilgit
//        ));
//        shandur_pass.setNearbyPlacesNames(Arrays.asList(
//                "Gilgit_Baltistan"
//        ));
        placeDetails.add(shandur_pass);

        return placeDetails;
    }

}
