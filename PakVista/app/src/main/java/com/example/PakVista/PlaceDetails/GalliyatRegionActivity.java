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

public class GalliyatRegionActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galliyat_region);

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

        PlaceDetail galiyat = new PlaceDetail();
        galiyat.setPlaceName("Galliyat Region");
        galiyat.setPlaceNameDetail("Where the mountains embrace the sky, and time slows to mountainous whispers");
        galiyat.setPlaceImage(R.drawable.kumrat_dir);
        galiyat.setPlaceDescription("Nestled in the picturesque Khyber Pakhtunkhwa province of Pakistan, " +
                "the Galiyat region stands as a jewel in the crown of the country's tourism offerings." +
                " With its breathtaking landscapes, serene mountains, and temperate climate, Galiyat is a haven for travelers seeking respite from the hustle and bustle of everyday life. The region encompasses a string of charming hill stations, including Murree, Nathiagali, Ayubia, and others, each offering a unique blend of natural beauty and cultural richness. Visitors can indulge in a variety of activities, from leisurely strolls through pine forests to adrenaline-pumping trekking adventures up the lush green slopes. Galiyat is not only a retreat for nature enthusiasts but also a gateway to the local culture and hospitality. Traditional crafts, delectable cuisine, and warm-hearted locals make for an enriching cultural experience. Whether it's the blossoming flowers of spring, the pleasant summers, the vibrant fall foliage, or the occasional snowfall in winter, Galiyat wears its seasonal garments with grace, offering a different allure throughout the year. As a responsible tourism destination, Galiyat emphasizes sustainable practices to preserve its pristine environment and safeguard its flora and fauna. For those in search of tranquility, adventure, and an authentic connection with nature and culture, " +
                "the Galiyat region beckons with open arms.");
        galiyat.setGalleryImages(Arrays.asList(
                R.drawable.galyat,
                R.drawable.murree,
                R.drawable.nathiya_galli
        ));
        galiyat.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        galiyat.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.murree
//        ));
//        galiyat.setNearbyPlacesNames(Arrays.asList(
//                "Murree"
//        ));
        placeDetails.add(galiyat);

        return placeDetails;
    }

}
