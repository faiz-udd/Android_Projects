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

public class RawalPindiDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rawal_pindi_detail);

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

        PlaceDetail rawalpindi = new PlaceDetail();
        rawalpindi.setPlaceName("RawalPindi");
        rawalpindi.setPlaceNameDetail(" Where heritage and modernity coalesce in vibrant harmony");
        rawalpindi.setPlaceImage(R.drawable.christ_church_rawalpindi);
        rawalpindi.setPlaceDescription("Rawalpindi, often referred to as the \"Twin City\" of Islamabad, presents a multifaceted destination from a tourism perspective. While Islamabad holds the role of the capital, Rawalpindi boasts a unique blend of history, culture, and vibrant local life. The city's bustling markets, like Raja Bazaar, draw visitors with their lively atmosphere and a treasure trove of goods. Its historical significance is evident in landmarks such as the Rawalpindi Museum, showcasing artifacts that chronicle the region's rich past. The Golra Sharif Railway Museum adds a touch of nostalgia for railway enthusiasts. Rawalpindi's proximity to the Margalla Hills allows for outdoor adventures, including hiking and trekking. Moreover, the city's Sufi shrines, such as the Pir Mehr Ali Shah Shrine, provide a spiritual haven for seekers. Whether it's relishing local street food, exploring bazaars, or delving into the cultural tapestry, Rawalpindi invites travelers to experience a dynamic side of Pakistan that complements its capital counterpart," +
                " making it a unique stop for those seeking a holistic understanding of the country.");
        rawalpindi.setGalleryImages(Arrays.asList(
                R.drawable.rawal_lake_rawalpindi,
                R.drawable.christ_church_rawalpindi,
                R.drawable.clock_tower_rawalpindi,
                R.drawable.rawat_fort_rawalpindi
        ));
        rawalpindi.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        rawalpindi.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.rawal_lake_rawalpindi
//        ));
//        rawalpindi.setNearbyPlacesNames(Arrays.asList(
//                "Rawal Lake Rawalpindi"
//        ));
        placeDetails.add(rawalpindi);

        return placeDetails;
    }

}
