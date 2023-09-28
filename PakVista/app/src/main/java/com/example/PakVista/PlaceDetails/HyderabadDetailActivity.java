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

public class HyderabadDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad);

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

        PlaceDetail hyderabadCity = new PlaceDetail();
        hyderabadCity.setPlaceName("Hyderabad City");
        hyderabadCity.setPlaceNameDetail("A blend of history, culture, and modernity.");
        hyderabadCity.setPlaceImage(R.drawable.hyderabad_evening);
        hyderabadCity.setPlaceDescription("Hyderabad, a city steeped in history and culture, " +
                "offers a unique blend of traditional heritage and modern lifestyle. The city's " +
                "iconic landmarks, such as the Badshahi Bungalow and the Qadam Gah Maula Ali, " +
                "highlight its rich past. The bustling markets of Resham Gali and Shahi Bazaar " +
                "offer a glimpse into the local way of life. The historic Rani Bagh and the " +
                "charming Sindh Museum are must-visit attractions. The vibrant Hussainabad " +
                "Hussain Tekri complex stands as a testament to the city's spiritual significance. " +
                "Hyderabad's culinary scene is a delight, with flavors that range from spicy " +
                "Biryani to mouthwatering sweets. The city's warmth and hospitality make it a " +
                "welcoming destination for travelers seeking a blend of history, culture, and " +
                "modern experiences.");
        hyderabadCity.setGalleryImages(Arrays.asList(
                R.drawable.montage_hyderabad,
                R.drawable.hyderabad_evening
        ));
        hyderabadCity.setPlaceLocation(new LatLng(25.3792, 68.3666));
//        hyderabadCity.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.sindh_museum
//        ));
//        hyderabadCity.setNearbyPlacesNames(Arrays.asList(
//                "Sindh Museum"
//        ));
        placeDetails.add(hyderabadCity);

        return placeDetails;
    }
}
