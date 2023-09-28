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

public class FaisalAbadDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faisal_abad_detail);

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

        PlaceDetail faisalabad = new PlaceDetail();
        faisalabad.setPlaceName("Faisalabad");
        faisalabad.setPlaceNameDetail("Where industry and culture intertwine in a vibrant urban tapestry.");
        faisalabad.setPlaceImage(R.drawable.clock_tower_faisalabad);
        faisalabad.setPlaceDescription("Faisalabad, fondly known as the 'Manchester of Pakistan,' " +
                "epitomizes a harmonious blend of industrial prowess and cultural heritage. The city's " +
                "iconic Clock Tower, standing tall at its heart, is a symbol of its historical significance. " +
                "Faisalabad's bustling bazaars and textile markets showcase the city's trade heritage, " +
                "offering a vivid array of fabrics and crafts. Amidst the urban landscape, the grand " +
                "Gatwala Wildlife Park provides a serene retreat for nature enthusiasts. The resplendent " +
                "Lyallpur Museum offers insights into Faisalabad's history, while the Iqbal Stadium resonates " +
                "with the energy of cricket fans. The city's vibrant spirit extends to its local cuisine, " +
                "where 'phajjay ke paye' and 'chole kulchay' tantalize taste buds. As the sun sets, " +
                "Faisalabad's skyline transforms into a captivating panorama of lights, capturing the " +
                "essence of the city's dynamic evolution. Faisalabad embodies the resilience of an industrial " +
                "hub and the warmth of a culturally rich community.");
        faisalabad.setGalleryImages(Arrays.asList(
                R.drawable.faisalabad_art_counsil,
                R.drawable.gurdwara_faisalabad
        ));
        faisalabad.setPlaceLocation(new LatLng(31.549722, 73.081054));
//        faisalabad.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.faisalabad_art_counsil
//
//        ));
//        faisalabad.setNearbyPlacesNames(Arrays.asList(
//                "Faisalabad Art Council"
//        ));
        placeDetails.add(faisalabad);

        return placeDetails;
    }
}
