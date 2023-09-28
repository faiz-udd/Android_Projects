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

public class SialkotDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sialkot_detail);

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

        PlaceDetail sialkot = new PlaceDetail();
        sialkot.setPlaceName("Sialkot");
        sialkot.setPlaceNameDetail("Where sports, craftsmanship, and heritage converge.");
        sialkot.setPlaceImage(R.drawable.sialkot_gate);
        sialkot.setPlaceDescription("Sialkot, a city renowned for its sports goods industry and historical significance, " +
                "weaves together a tapestry of talents and heritage. The Sialkot Cricket Stadium echoes " +
                "with the cheers of cricket enthusiasts, reflecting the city's passion for sports. " +
                "Sialkot's entrepreneurial spirit is evident in its bustling markets, where local artisans " +
                "create exquisite handcrafted goods, from sports equipment to musical instruments. The " +
                "iconic clock tower stands as a sentinel of Sialkot's history, while the Iqbal Manzil " +
                "pays homage to the great philosopher-poet Allama Iqbal. The serene Head Marala " +
                "scenic spot offers tranquil moments by the Chenab River. Sialkot's rich culinary scene " +
                "offers delights like 'chicken karahi' and 'biryani.' As dusk descends, the city's " +
                "lights illuminate its vibrancy, casting a glow on its energetic streets. Sialkot is a " +
                "harmonious blend of tradition and innovation, where craftsmanship, sportsmanship, and " +
                "culture come together.");
        sialkot.setGalleryImages(Arrays.asList(
                R.drawable.clock_tower_sialkot,
                R.drawable.sialkot_gate,
                R.drawable.iqbal_manzil_sialkot
        ));
        sialkot.setPlaceLocation(new LatLng(32.500713, 74.536087));
//        sialkot.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.iqbal_manzil_sialkot
//        ));
//        sialkot.setNearbyPlacesNames(Arrays.asList(
//                "Iqbal Manzil"
//        ));
        placeDetails.add(sialkot);

        return placeDetails;
    }
}
