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

public class BahawulpurDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahawulpur_detail);

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

        PlaceDetail bahawalpur = new PlaceDetail();
        bahawalpur.setPlaceName("Bahawalpur");
        bahawalpur.setPlaceNameDetail("Where history and desert elegance converge.");
        bahawalpur.setPlaceImage(R.drawable.noor_mahal_bahawalpur);
        bahawalpur.setPlaceDescription("Bahawalpur, a city that carries the regal echoes of its past, " +
                "welcomes visitors to explore its historical charm and enchanting desert landscapes. " +
                "The grandeur of the Noor Mahal, with its exquisite architecture and ornate interiors, " +
                "captures the opulence of Bahawalpur's former rulers. The Derawar Fort, standing as a " +
                "sentinel in the Cholistan Desert, narrates tales of ancient defenses and traditions. " +
                "The Uch Sharif complex, adorned with intricate tile work, pays homage to a rich spiritual " +
                "heritage. As the sun sets, the vibrant bazaars come alive with the allure of local " +
                "craftsmanship and traditional textiles, offering a blend of past and present. The city's " +
                "lush gardens and tranquil lakes, like the Lal Suhanra National Park and the Gulzar Mahal " +
                "Park, offer a serene escape amidst the arid surroundings. Bahawalpur invites explorers to " +
                "wander through its history and embrace the grace of desert elegance, providing a glimpse " +
                "into a realm of palaces, forts, and timeless traditions.");
        bahawalpur.setGalleryImages(Arrays.asList(
                R.drawable.darbar_palace_bahawulpur,
                R.drawable.noor_mahal_bahawalpur,
                R.drawable.central_library_bahawulpur
        ));
        bahawalpur.setPlaceLocation(new LatLng(29.392671, 71.672794));

//        bahawalpur.setNearbyPlace(Arrays.asList(
//                new Place( "Noor Mahal",R.drawable.noor_mahal_bahawalpur)
//        ));
        placeDetails.add(bahawalpur);

        return placeDetails;
    }
}
