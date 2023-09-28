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

public class MultanDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multan_detail);

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

        PlaceDetail multan = new PlaceDetail();
        multan.setPlaceName("Multan");
        multan.setPlaceNameDetail("Where history, culture, and bazaars entwine.");
        multan.setPlaceImage(R.drawable.mosque_multan);
        multan.setPlaceDescription("Multan, often referred to as the 'City of Saints' and the 'Mango Capital,' " +
                "holds a unique charm that emanates from its rich historical tapestry and vibrant present. " +
                "With its impressive Multan Fort standing as a sentinel of the city's past, visitors can " +
                "explore the remnants of bygone eras and the intricate details of its architecture. The " +
                "city's intricate blue ceramics, locally known as 'Kashi work,' showcase the region's " +
                "craftsmanship and are a testament to the cultural amalgamation that defines Multan. The " +
                "exquisite Shah Rukn-e-Alam Mausoleum pays homage to Sufi saints, inviting contemplation " +
                "and spiritual reflection. Multan's bustling bazaars overflow with colors, scents, and " +
                "textures, offering a treasure trove of local handicrafts, textiles, and flavors. As the " +
                "sun sets over the city, the vibrant hues of its markets are replaced by the warm glow of " +
                "its lantern-lit streets, creating an ambiance that encapsulates Multan's dynamic character. " +
                "From exploring the Walled City's narrow alleys to indulging in the city's famed 'sohan halwa,' " +
                "Multan weaves together history, culture, and modernity in a symphony of experiences.");
        multan.setGalleryImages(Arrays.asList(
                R.drawable.eidgah_mosque_multan,
                R.drawable.tomp_shah_rukhe_alam_multan,
                R.drawable.ghanta_ghar_multan
        ));
        multan.setPlaceLocation(new LatLng(30.157456, 71.524915));
//        multan.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.tomp_shah_rukhe_alam_multan
//        ));
//        multan.setNearbyPlacesNames(Arrays.asList(
//                "Shrine of Shah Rukhn_e_Alam"
//        ));
        placeDetails.add(multan);

        return placeDetails;
    }
}
