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

public class BunnerValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunner_valley);

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

        PlaceDetail bunnerValley = new PlaceDetail();
        bunnerValley.setPlaceName("Bunner Valley");
        bunnerValley.setPlaceNameDetail(" Where nature's tranquility weaves a tapestry of serenity");
        bunnerValley.setPlaceImage(R.drawable.kumrat_dir);
        bunnerValley.setPlaceDescription("Resting amid undulating hills and lush landscapes," +
                " Bunner Valley emerges as an enticing haven for travelers with a penchant for embracing the natural world. A canvas painted with meandering rivers, ancient woodlands, and cascading water features, the valley presents a captivating tableau of outdoor allure. Adventure enthusiasts can revel in activities like invigorating hikes along well-groomed trails or exhilarating rock climbing escapades that cater to all skill levels. Beyond the realm of nature's splendor, the valley's idyllic villages and affable locals provide a gateway to cultural immersion, with traditional flavors and local festivals beckoning exploration. Bunner Valley distinguishes itself as a bastion of conservation, upholding the ethos of sustainable tourism to safeguard its precious ecosystem and exceptional wildlife. Whether it's the vibrant tapestry of spring wildflowers, the verdant embrace of summer, the fiery spectacle of autumn foliage, or the tranquil winter landscape, Bunner Valley unfurls a timeless escape destined to etch" +
                " lasting memories in the hearts of all who traverse its embrace.");
        bunnerValley.setGalleryImages(Arrays.asList(
                R.drawable.bunir_masjid,
                R.drawable.elum_mountain_bunir,
                R.drawable.torwasak_village_bunir
        ));
        bunnerValley.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        bunnerValley.setNearbyPlace(Arrays.asList(
//                new Place( "peshawar",R.drawable.peshawar)
//        ));
        placeDetails.add(bunnerValley);

        return placeDetails;
    }

}
