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

public class MohenjoDaroDetailActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mohenjo_daro_detail);

        recyclerView = findViewById(R.id.contentRecyclerView2);

        // Set up the RecyclerView with a Linear Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Initialize the list of all places
        allPlacesDetail = generateSamplePlaces();

        // Create an instance of the PlaceAdapter and set it on the RecyclerView
        placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
        placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
        recyclerView.setAdapter(placeDetailAdapter);


    }
    // Generate sample places for demonstration
    private List<PlaceDetail> generateSamplePlaces() {
        List<PlaceDetail> placeDetails = new ArrayList<>();

        PlaceDetail place2 = new PlaceDetail();
        place2.setPlaceName("Mohenjo Daro");
        place2.setPlaceNameDetail("Echoes of an ancient civilization, Mohenjo Daro whispers stories of a forgotten past");
        place2.setPlaceImage(R.drawable.mohenjo_daro);
        place2.setPlaceDescription("Mohenjo Daro, an ancient archaeological marvel, offers a captivating glimpse into the Indus Valley Civilization and stands as a testimony to its advanced urban planning and sophisticated culture. Nestled along the banks of the Indus River in present-day Pakistan, this UNESCO World Heritage Site has immense tourism potential from historical, cultural, and architectural perspectives.\n" +
                "\n" +
                "Stepping into Mohenjo Daro is like traversing back in time over 4,000 years. The well-laid streets, intricate drainage systems, and multi-story brick houses that have survived the ages demonstrate the city's remarkable urban planning and engineering prowess. The meticulous grid layout and advanced sanitation systems of the ancient city are awe-inspiring, offering insights into the level of organization and innovation achieved by its inhabitants.\n" +
                "\n" +
                "Visitors are treated to a wealth of archaeological artifacts, from pottery and jewelry to tools and sculptures, providing an opportunity to comprehend the craftsmanship and daily life of the ancient residents. The iconic \"Great Bath,\" an elaborate water tank, reflects the significance of ritualistic practices in the culture of Mohenjo Daro's people.\n" +
                "\n" +
                "The destination offers not only historical marvels but also an ambiance rich with cultural heritage. The proximity to the mighty Indus River adds to the charm, creating a serene atmosphere that transports visitors to a different era. The site also serves as a valuable educational hub, allowing tourists to unravel the mysteries of an enigmatic civilization that contributed significantly to human development.\n" +
                "\n" +
                "Efforts to ensure the preservation and promotion of this archaeological treasure have led to the establishment of a museum nearby, where artifacts from Mohenjo Daro are showcased, providing additional context and depth to the visitor experience.");
        place2.setGalleryImages(Arrays.asList(
                R.drawable.mohenjo_daro_sites, R.drawable.mohenjo_daro,
                R.drawable.mohenjodaro_sites
        ));
        place2.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        place2.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.rann_of_kuch, R.drawable.dholavira_sindh
//        ));
//        place2.setNearbyPlacesNames(Arrays.asList(
//                "Rann of Kuchh", "Dholavira"
//        ));
        placeDetails.add(place2);

        return placeDetails;
    }

}