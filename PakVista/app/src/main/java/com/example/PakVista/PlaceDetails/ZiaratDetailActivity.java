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

public class ZiaratDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ziarat_detail);

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

        PlaceDetail ziaratBalochistan = new PlaceDetail();
        ziaratBalochistan.setPlaceName("Ziarat, Balochistan");
        ziaratBalochistan.setPlaceNameDetail("Nature's retreat in the heart of Balochistan.");
        ziaratBalochistan.setPlaceImage(R.drawable.ziarat_valley_balochistan);
        ziaratBalochistan.setPlaceDescription("Ziarat, a jewel nestled in the mountainous landscapes " +
                "of Balochistan, offers a tranquil escape from the mundane. The iconic Quaid's Residency, " +
                "where Quaid-e-Azam Muhammad Ali Jinnah spent his last days, exudes historical significance. " +
                "The lush Juniper forests and the serene Valley of Siah Chasm captivate with their " +
                "breathtaking beauty. The prospect of snowfall in winter makes Ziarat a coveted destination " +
                "for those seeking a white wonderland. The energetic 'Prosperity Point' overlooks the " +
                "majestic beauty of the valley, while the majestic Juniper trees hold stories of centuries. " +
                "Ziarat resonates with Balochi culture, as visitors can indulge in local crafts and " +
                "delight in traditional Balochi cuisine. A visit to Ziarat's market offers a glimpse " +
                "into local life, and the stunning views from the 'Pir Ghaib' waterfall add to the " +
                "charming allure of this serene hill station.");
        ziaratBalochistan.setGalleryImages(Arrays.asList(
                R.drawable.quid_e_azam_house_ziarat,
                R.drawable.ziarat_valley_balochistan
        ));
        ziaratBalochistan.setPlaceLocation(new LatLng(30.382833, 67.725595));
       // ziaratBalochistan.setNearbyPlace(Arrays.asList(new Place( "Pir Ghaib Waterfall",R.drawable.pir_ghaib)));
        placeDetails.add(ziaratBalochistan);

        return placeDetails;
    }
}
