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

public class DirKumratValleyActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dir_kumrat_valley);

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

        PlaceDetail kumrat = new PlaceDetail();
        kumrat.setPlaceName("Kumrat Valley Dir");
        kumrat.setPlaceNameDetail("Exploring the enchanting mysteries of Kumart Valley, where nature weaves its own tales");
        kumrat.setPlaceImage(R.drawable.kumrat_dir);
        kumrat.setPlaceDescription("Nestled in the picturesque landscapes of North-Western Pakistan, " +
                "Dir Kumrat Valley emerges as a true haven for travelers seeking an untouched natural paradise. " +
                "With its awe-inspiring beauty, this valley offers a unique blend of pristine rivers, lush meadows," +
                " and towering peaks. The allure of Kumrat Valley lies in its hidden gems, from the enchanting Jahaz Banda with its sprawling meadows reminiscent of a fairytale, to the captivating Kala Chashma known for its crystal-clear waters that mirror the surrounding forests. The ancient historical site of Tooshi Malang adds a touch of mystique to the journey, while the pastoral village of Thal awaits with its rustic charm. As you explore the meandering trails, camp under the star-studded sky, and embrace the warmth of the local communities, you'll discover that Kumrat Valley is not just a destination –" +
                " it's an unparalleled adventure that brings you closer to the unspoiled beauty of Pakistan's nature and culture.");
        kumrat.setGalleryImages(Arrays.asList(
                R.drawable.kumrat_dir,
                R.drawable.northpk,
                R.drawable.kaghan_valley
        ));
        kumrat.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        kumrat.setNearbyPlace(Arrays.asList(
//                new Place( "Kaghan Valley",R.drawable.kaghan_valley),
//                new Place("Hunza Valley", R.drawable.hunza_valley)
//        ));
        placeDetails.add(kumrat);

        return placeDetails;
    }

}
