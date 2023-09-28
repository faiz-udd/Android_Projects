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

public class PirGhaibDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pir_ghaib_detail);

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

        PlaceDetail pirGhaibWaterfall = new PlaceDetail();
        pirGhaibWaterfall.setPlaceName("Pir Ghaib Waterfall");
        pirGhaibWaterfall.setPlaceNameDetail("A natural wonder cascading in Balochistan.");
        pirGhaibWaterfall.setPlaceImage(R.drawable.pir_ghaib);
        pirGhaibWaterfall.setPlaceDescription("Pir Ghaib Waterfall, an enchanting natural marvel " +
                "nestled in the rugged landscapes of Balochistan, captivates with its majestic cascade. " +
                "The pristine water flows from a height, forming a breathtaking waterfall that adds to " +
                "the allure of the region. The surroundings offer a haven for adventure enthusiasts, " +
                "with opportunities for trekking and exploration. The lush greenery and tranquil pools " +
                "create a picturesque setting, ideal for relaxation and rejuvenation. The waterfall's " +
                "name is steeped in folklore, adding a sense of mystery to the experience. The journey " +
                "to Pir Ghaib unfolds through scenic beauty, providing a memorable escape from the " +
                "everyday and a chance to connect with the raw beauty of nature.");
        pirGhaibWaterfall.setGalleryImages(Arrays.asList(
                R.drawable.pir_ghaib,
                R.drawable.pir_ghaib_waterfall
        ));
        pirGhaibWaterfall.setPlaceLocation(new LatLng(25.202665, 66.664299));
//        pirGhaibWaterfall.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.pir_ghaib_hunting_lodge
//        ));
//        pirGhaibWaterfall.setNearbyPlacesNames(Arrays.asList(
//                "Pir Ghaib Hunting Lodge"
//        ));
        placeDetails.add(pirGhaibWaterfall);

        return placeDetails;
    }
}
