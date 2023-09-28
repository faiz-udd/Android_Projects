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

public class TaxilaDetailActivity  extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxila_detail);

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

        PlaceDetail taxila = new PlaceDetail();
        taxila.setPlaceName("Taxila");
        taxila.setPlaceNameDetail(" Where heritage and modernity coalesce in vibrant harmony");
        taxila.setPlaceImage(R.drawable.taxila_stupa);
        taxila.setPlaceDescription("Taxila, an archaeological treasure trove, stands as a testament to Pakistan's ancient history and cultural legacy. Nestled just a stone's throw away from Islamabad, this UNESCO World Heritage Site offers an unparalleled glimpse into the Gandhara civilization that flourished over two millennia ago. The ruins of Taxila, including well-preserved stupas, monasteries, and sculptures, reveal the interplay of Buddhist, Greek, and Persian influences, making it a captivating destination for history enthusiasts and scholars. The Taxila Museum further enriches the experience by housing an impressive collection of artifacts excavated from the site. The nearby Sirkap and Jaulian sites add to the allure, each with their own distinct character and stories to tell. Taxila's historical significance is artfully intertwined with its serene landscapes, creating a unique blend of exploration and reflection. As visitors traverse the ancient pathways, they step back in time to an era of intellectual exchange and artistic brilliance. Taxila not only showcases the region's rich heritage but also offers a space for contemplation, " +
                "bridging the gap between the past and the present in a profound and evocative manner");
        taxila.setGalleryImages(Arrays.asList(
                R.drawable.uet_taxila,
                R.drawable.sirkup_stupa_taxila
        ));
        taxila.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        taxila.setNearbyPlacesImages(Arrays.asList(
//                R.drawable.darmaraj_stupa_taxila
//        ));
//        taxila.setNearbyPlacesNames(Arrays.asList(
//                "Archaelogical Sites Taxila"
//        ));
        placeDetails.add(taxila);

        return placeDetails;
    }

}