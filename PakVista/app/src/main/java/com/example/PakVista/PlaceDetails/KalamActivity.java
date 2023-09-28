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

public class KalamActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalam);

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

        PlaceDetail kalamValley = new PlaceDetail();
        kalamValley.setPlaceName("Kalam Valley");
        kalamValley.setPlaceNameDetail("Where nature's symphony resonates in every rustling leaf and cascading waterfall");
        kalamValley.setPlaceImage(R.drawable.kalam);
        kalamValley.setPlaceDescription("Nestled amidst the picturesque landscapes of Khyber Pakhtunkhwa, Kalam Valley stands as a veritable jewel in Pakistan's tourism crown. With its enchanting beauty, pristine alpine meadows, and snow-capped peaks, Kalam Valley beckons travelers from all corners of the world. Offering a retreat from the hustle and bustle of modern life, this idyllic destination is a haven for nature enthusiasts and adventure seekers alike. The glistening Swat River winds its way through the valley, providing opportunities for trout fishing and serene boat rides. The surrounding hills are adorned with lush forests, housing an incredible variety of flora and fauna, making it a paradise for trekkers and wildlife enthusiasts. The valley also offers a glimpse into the vibrant local culture, with traditional Pashtun hospitality and handicrafts on display. Whether one seeks thrilling outdoor activities, moments of serenity, or a deep dive into the region's rich cultural tapestry, Kalam Valley stands ready to offer" +
                " an unforgettable journey that leaves an indelible mark on the hearts of all who venture here.");
        kalamValley.setGalleryImages(Arrays.asList(
                R.drawable.kalam,
                R.drawable.kalam_valley
        ));
        kalamValley.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        kalamValley.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.sawat_valley
//        ));
//        kalamValley.setNearbyPlacesNames(Arrays.asList(
//                "Sawat Valley"
//        ));
        placeDetails.add(kalamValley);

        return placeDetails;
    }

}
