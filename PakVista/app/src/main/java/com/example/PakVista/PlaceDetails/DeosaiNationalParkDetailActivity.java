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

public class DeosaiNationalParkDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deosai_national_park_detail);

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

        PlaceDetail deosaiNationalPark = new PlaceDetail();
        deosaiNationalPark.setPlaceName("Deosai National Park");
        deosaiNationalPark.setPlaceNameDetail("The land of giants and wildflowers.");
        deosaiNationalPark.setPlaceImage(R.drawable.sheoser_lake_deosai_national_park);
        deosaiNationalPark.setPlaceDescription("Deosai National Park, often referred to as the 'Land of Giants,' " +
                "is a high-altitude plateau nestled between the western Himalayas and the Karakoram " +
                "Range. Its diverse ecosystem is a haven for unique wildlife, including the Himalayan " +
                "brown bear, ibex, and various bird species. During the summer months, the park " +
                "transforms into a paradise of colorful wildflowers that carpet the landscape in " +
                "vibrant hues. The Sheosar Lake, also known as the 'Blind Lake,' mirrors the " +
                "surrounding mountains and sky, creating a mystical ambiance. The Deosai Plains " +
                "stand in stark contrast to the rugged peaks and valleys that characterize the " +
                "surrounding regions. This high-altitude wilderness is accessible during the summer " +
                "months, offering visitors a chance to witness nature in its raw, untouched beauty. " +
                "Deosai National Park is a must-visit destination for those seeking tranquility, " +
                "breathtaking views, and a close encounter with Pakistan's unique flora and fauna.");
        deosaiNationalPark.setGalleryImages(Arrays.asList(
                R.drawable.deosai_national_park,
                R.drawable.himalayan_brown_bear_deosai_np
        ));
        deosaiNationalPark.setPlaceLocation(new LatLng(33.1578, 76.4599));
//        deosaiNationalPark.setNearbyPlace(Arrays.asList(
//                new Place( "Himalayan Brown Bear Habitat",R.drawable.himalayan_brown_bear_deosai_np)
//        ));

        placeDetails.add(deosaiNationalPark);

        return placeDetails;
    }
}
