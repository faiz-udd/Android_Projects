package com.example.PakVista.PlaceDetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.PakVista.Adapters.PlaceDetailAdapter;
import com.example.PakVista.PlaceDetail;
import com.example.PakVista.R;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShahiMasjidChitralActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shahi_masjid_chitral);

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

    private View.OnClickListener nearbyItemClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Handle nearby item click here
            int position = recyclerView.getChildAdapterPosition(v);
            Toast.makeText(ShahiMasjidChitralActivity.this, "CLicked", Toast.LENGTH_SHORT).show();
        }
    };

    // Generate sample places for demonstration
    private List<PlaceDetail> generateSamplePlaces() {
        List<PlaceDetail> placeDetails = new ArrayList<>();

        PlaceDetail shahi_masjid = new PlaceDetail();
        shahi_masjid.setPlaceName("Shahi Masjid Chitral");
        shahi_masjid.setPlaceNameDetail("A historic mosque with architectural splendor");
        shahi_masjid.setPlaceImage(R.drawable.shahi_mosque_chitral);
        shahi_masjid.setPlaceDescription("Shahi Masjid Chitral is an architectural masterpiece that stands as a symbol of the region's rich history and cultural heritage. " +
                "Located in the heart of Chitral, this historic mosque boasts intricate designs, stunning arches, and exquisite craftsmanship that reflect the artistic sensibilities of its time.\n" +
                "\n" +
                "The mosque's elegant minarets and domes are a testament to the architectural prowess of the craftsmen who built it. The interior of the mosque is equally captivating, with intricate carvings and geometric patterns adorning its walls and ceilings.\n" +
                "\n" +
                "Visiting the Shahi Masjid allows you to immerse yourself in the historical narrative of Chitral and appreciate the skill and dedication that went into creating this cultural treasure. Whether you're a history enthusiast, an architecture lover, or someone seeking spiritual solace, the Shahi Masjid Chitral offers a serene and captivating experience.");
        shahi_masjid.setGalleryImages(Arrays.asList(
                R.drawable.shahi_fort_chitral,
                R.drawable.shahi_mosque_chitral
        ));
        shahi_masjid.setPlaceLocation(new LatLng(35.851234, 71.778901));
//        shahi_masjid.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.fort_chitral
//        ));
//        shahi_masjid.setNearbyPlacesNames(Arrays.asList(
//                "Chitral"
//        ));
        placeDetails.add(shahi_masjid);

        return placeDetails;
    }
}
