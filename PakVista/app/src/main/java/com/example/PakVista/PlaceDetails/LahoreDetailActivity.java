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

public class LahoreDetailActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lahore_detail);

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

        PlaceDetail lahore = new PlaceDetail();
        lahore.setPlaceName("Lahore");
        lahore.setPlaceNameDetail("Lahore, a city where history gracefully dances with modernity, weaving a tapestry of vibrant culture and timeless elegance");
        lahore.setPlaceImage(R.drawable.lahore);
        lahore.setPlaceDescription("Lahore, often referred to as the heart of Pakistan, is a city that beckons with its intricate tapestry of history, culture, and architectural grandeur. This metropolis is home to a plethora of mesmerizing historical and tourist sites that narrate the tale of its rich past and vibrant present.\n" +
                "\n" +
                "At the heart of Lahore lies the magnificent Lahore Fort, a UNESCO World Heritage Site that boasts a captivating blend of Mughal, Sikh, and British architectural influences. Just a stone's throw away, the Badshahi Mosque stands as a testament to Mughal opulence, with its imposing structure and intricate detailing.\n" +
                "\n" +
                "Wandering through the Shalimar Gardens, a UNESCO gem itself, visitors are transported to a world of Mughal splendor with terraced gardens, flowing fountains, and serene water features. Nearby, the Lahore Museum showcases an extensive collection of artifacts, offering a glimpse into the region's history from ancient times to colonial rule.\n" +
                "\n" +
                "Exploring the Walled City of Lahore is a journey into the past, where narrow lanes wind through historic Havelis, bustling bazaars, and ornate gates like the Delhi Gate and Mochi Gate. The Data Darbar, a Sufi shrine, exudes an air of spiritual devotion and cultural vitality, especially during the lively Urs festival.\n" +
                "\n" +
                "Beyond these treasures, Lahore offers modern attractions like the Lahore Zoo, a family-friendly destination, and the elegant Lahore High Court building, showcasing British colonial influence. The vibrant Anarkali Bazaar entices visitors with its array of textiles, crafts, and delectable local treats, while the Raiwind Palace on the outskirts of the city offers a glimpse into the region's royal history.\n" +
                "\n" +
                "The city's architectural prowess continues with Jahangir's Tomb, a striking mausoleum set amidst lush Persian-style gardens, and the charming Chauburji, an ancient Mughal monument that harmoniously blends Persian and Indian design elements.\n" +
                "\n" +
                "Lahore is a city where time-honored traditions meet modern aspirations, making it a captivating destination that leaves an indelible mark on every traveler fortunate enough to explore its historical and cultural riches.");
        lahore.setGalleryImages(Arrays.asList(
                R.drawable.mosque_lahore, R.drawable.lahoree,
                R.drawable.shah_jahan_mosque_thatta, R.drawable.lahore
        ));
        lahore.setPlaceLocation(new LatLng(1.234567, 2.345678));
//        lahore.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.lahore, R.drawable.lahore_fort, R.drawable.minar_e_pakistan
//        ));
//        lahore.setNearbyPlacesNames(Arrays.asList(
//                "Badshahi Mosque Lahore", "Shahi Palace Lahore", "Minar e Pakistan "
//        ));
        placeDetails.add(lahore);
        // Add more places here
        return placeDetails;
    }

}