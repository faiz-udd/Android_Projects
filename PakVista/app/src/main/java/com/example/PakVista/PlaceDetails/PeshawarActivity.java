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

public class PeshawarActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peshawar);

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

        PlaceDetail peshawar = new PlaceDetail();
        peshawar.setPlaceName("Peshawar");
        peshawar.setPlaceNameDetail("Where history whispers through the bustling bazaars");
        peshawar.setPlaceImage(R.drawable.peshawar);
        peshawar.setPlaceDescription("With an unmistakable blend of vibrant culture and ancient heritage," +
                " Peshawar emerges as a captivating destination from a tourism perspective." +
                " Situated in Pakistan's Khyber Pakhtunkhwa province, this city invites travelers to immerse themselves " +
                "in an authentic experience. Its bustling bazaars brim with a kaleidoscope of colorful fabrics, " +
                "intricate handicrafts, and aromatic spices, while architectural wonders like the Bala Hisar Fort and the " +
                "Mahabat Khan Mosque stand as testaments to its historical significance. Peshawar's rich tapestry of history" +
                " is woven seamlessly into its narrow alleyways, recounting tales of conquerors," +
                " traders, and scholars through the ages. The Qissa Khwani Bazaar, " +
                "fondly referred to as the \"Street of Storytellers,\" encapsulates " +
                "the essence of the city's past as stories have been exchanged here for centuries." +
                " Beyond its historical gems, Peshawar also serves as a gateway to the rugged beauty of the Khyber Pass and the surrounding landscapes, offering an enticing blend of history," +
                " culture, and adventure for those who seek an exceptional journey.");
        peshawar.setGalleryImages(Arrays.asList(
                R.drawable.mohabat_khan_mosque,
                R.drawable.clock_tower_peshawar,
                R.drawable.bala_hisar_fort
        ));
        peshawar.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        peshawar.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.khyberpass
//        ));
//        peshawar.setNearbyPlacesNames(Arrays.asList(
//                "khyber Pass"
//        ));
        placeDetails.add(peshawar);

        return placeDetails;
    }

}
