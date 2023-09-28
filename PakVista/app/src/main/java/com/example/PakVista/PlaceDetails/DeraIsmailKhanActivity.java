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

public class DeraIsmailKhanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dera_ismail_khan);

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

        PlaceDetail deraIslmailKhan = new PlaceDetail();
        deraIslmailKhan.setPlaceName("Dera Ismail Khan");
        deraIslmailKhan.setPlaceNameDetail("Exploring the enchanting mysteries of Kumart Valley, where nature weaves its own tales");
        deraIslmailKhan.setPlaceImage(R.drawable.river_indus_dikhan);
        deraIslmailKhan.setPlaceDescription("Dera Ismail Khan (DI Khan), a city with a rich historical tapestry, offers a unique perspective on tourism in Khyber Pakhtunkhwa. Situated along the mighty Indus River, this region boasts a blend of cultural heritage, natural beauty, and warm hospitality. The city's historical significance is evident in its ancient forts, mosques, and shrines that bear witness to centuries of diverse influences. The sprawling Derajat Range provides a striking backdrop, enticing trekkers and adventurers to explore its rugged trails. The annual Shikarpur Mela, a vibrant cultural festival, showcases the region's traditional music, dance, and crafts. Additionally, the Indus River invites water sports enthusiasts to engage in thrilling activities. DI Khan's charm lies in its authentic and unassuming ambiance, offering travelers a chance to immerse themselves in local traditions and savor the simple pleasures of life by the riverbanks. With its blend of history, culture, and natural splendor, Dera" +
                " Ismail Khan promises an enriching experience for those seeking an off-the-beaten-path adventure in KPK.");
        deraIslmailKhan.setGalleryImages(Arrays.asList(
                R.drawable.kafir_kot_dik,
                R.drawable.river_indus_dikhan
        ));
        deraIslmailKhan.setPlaceLocation(new LatLng(3.456789, 4.567890));
//        deraIslmailKhan.setNearbyPlace(Arrays.asList(
//                new Place( "Indus River",R.drawable.river_indus_dikhan)
//        ));
        placeDetails.add(deraIslmailKhan);

        return placeDetails;
    }

}
