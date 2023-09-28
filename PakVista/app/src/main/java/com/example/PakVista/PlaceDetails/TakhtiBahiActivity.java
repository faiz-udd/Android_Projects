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

public class TakhtiBahiActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takhti_bahi);

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

        PlaceDetail takht_e_bahi = new PlaceDetail();
        takht_e_bahi.setPlaceName("Takht-e-Bahi");
        takht_e_bahi.setPlaceNameDetail("Unveiling the rich tapestry of KPK's heritage through its timeless stone narratives.");
        takht_e_bahi.setPlaceImage(R.drawable.takht_i_bahi);
        takht_e_bahi.setPlaceDescription("Takht-e-Bahi, a UNESCO World Heritage Site, " +
                "stands as a testament to the rich historical and cultural heritage of Pakistan. " +
                "Nestled atop a hill in the picturesque Mardan district," +
                " this ancient Buddhist monastery complex offers a mesmerizing journey back in time. " +
                "As you wander through its well-preserved ruins and intricate architecture," +
                " you'll be transported to the heyday of the Gandhara civilization. The intricately carved stupas, " +
                "monastic cells, and courtyard layouts reflect the profound influence of Buddhism in the region." +
                " The panoramic views from the site allow you to appreciate the surrounding landscape that once played host to this thriving center of learning and spirituality. Takht-e-Bahi, meaning \"Throne of Origins,\" offers a unique blend of architectural grandeur and historical significance, making it a must-visit destination for history enthusiasts," +
                " photographers, and anyone seeking to explore the ancient roots of the region.");
        takht_e_bahi.setGalleryImages(Arrays.asList(
                R.drawable.aeral_view_of_takhbahi,
                R.drawable.takht_i_bahi,
                R.drawable.morti_takht_e_bahi
        ));
        takht_e_bahi.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        takht_e_bahi.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.ranigat_budhist_ruins_takh_e_bahi
//        ));
//        takht_e_bahi.setNearbyPlacesNames(Arrays.asList(
//                "Archaelogical Sites of Ranigat"
//        ));
        placeDetails.add(takht_e_bahi);

        return placeDetails;
    }

}
