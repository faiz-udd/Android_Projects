package com.example.PakVista.PlaceDetails;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.NearbyPlace;
import com.example.PakVista.Adapters.NearbyPlaceAdapter;
import com.example.PakVista.PlaceDetail;
import com.example.PakVista.Adapters.PlaceDetailAdapter;
import com.example.PakVista.R;
import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChitralValleyActivity extends AppCompatActivity {
            private Context context;
            private RecyclerView recyclerView, nearbyRecyclerview;
            private PlaceDetailAdapter placeDetailAdapter;
            private List<PlaceDetail> allPlacesDetail;
            private NearbyPlaceAdapter nearbyAdapter;
            private List<NearbyPlace> allNearByPlaces;
            private NearbyPlaceAdapter.OnItemClickListener listener;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_chitral_valley);

                recyclerView = findViewById(R.id.contentRecyclerView);


                // Set up the RecyclerView with a GridLayoutManager
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                recyclerView.setLayoutManager(layoutManager);


                // Initialize the list of all places
                allPlacesDetail = generateSamplePlaces();
                allNearByPlaces = generateNearbySamplePlaces();

                // Create an instance of the PlaceAdapter and set it on the RecyclerView
                placeDetailAdapter = new PlaceDetailAdapter(this, allPlacesDetail);
                recyclerView.setAdapter(placeDetailAdapter);

                // Create an instance of the PlaceAdapter and set it on the RecyclerView
                nearbyAdapter = new NearbyPlaceAdapter(this, allNearByPlaces); // Pass an empty list initially
                nearbyAdapter.setPlaces(generateNearbySamplePlaces());
                nearbyAdapter.setOnItemClickListener(new NearbyPlaceAdapter.OnItemClickListener() {
                    @Override
                    public void onItemClick(NearbyPlace nearbyPlaces) {

                        Class<?> destinationActivity;
                        switch (nearbyPlaces.getName()) {
                            case "Shandur Pass":
                                destinationActivity = ShandurPassActivity.class;
                                break;
                            case "Shahi Masjid Chitral":
                                destinationActivity = ShahiMasjidChitralActivity.class;
                                break;
                            case "Kalash Valley":
                                destinationActivity = KalashValleyActivity.class;
                                break;
                            default:
                                destinationActivity = ChitralValleyActivity.class; // Fallback activity
                                break;
                        }

                        Intent intent = new Intent(ChitralValleyActivity.this, destinationActivity);
                        startActivity(intent);
                    }
                });

     }
    private List<NearbyPlace> generateNearbySamplePlaces() {
        List<NearbyPlace> nearbyPlaces = new ArrayList<>();

        NearbyPlace ShandurPass = new NearbyPlace("Shandur Pass", R.drawable.shandur_pass);
        nearbyPlaces.add(new NearbyPlace("Shandur Pass", R.drawable.shandur_pass));
        nearbyPlaces.add(new NearbyPlace("Shahi Masjid Chitral", R.drawable.shahi_fort_chitral));
        nearbyPlaces.add(new NearbyPlace("Kalash Valley", R.drawable.kalash_valley));


        return nearbyPlaces;
    }



    // Generate sample places for demonstration
            private List<PlaceDetail> generateSamplePlaces() {
                List<PlaceDetail> placeDetails = new ArrayList<>();

                PlaceDetail chitral = new PlaceDetail();
                chitral.setPlaceName("Chitral");
                chitral.setPlaceNameDetail("Where nature's beauty meets rich culture");
                chitral.setPlaceImage(R.drawable.chitral);
                chitral.setPlaceDescription("Nestled in the heart of the captivating North-Western region of Pakistan," +
                        " Chitral stands as a hidden gem for travelers seeking an authentic and enchanting experience. " +
                        "Renowned for its breathtaking landscapes, from the iconic Tirich Mir, " +
                        "the highest peak of the Hindu Kush range, to the lush valleys of Garam Chashma and Kalash," +
                        " Chitral offers a mesmerizing playground for nature enthusiasts and adventure seekers alike." +
                        " The region's pristine beauty is matched only by the warmth of its hospitable inhabitants, " +
                        "who offer visitors a glimpse into their rich and diverse culture. Chitral's vibrant bazaars," +
                        " adorned with traditional handicrafts and local delicacies, add to the allure of this off-the-beaten-path destination. Whether trekking through the rugged mountains, exploring the ancient Chitral Fort, immersing oneself in the unique Kalash festivals, or simply relishing the serenity of the surroundings," +
                        " Chitral promises a unique and unforgettable journey for those willing to explore its wonders.");
                chitral.setGalleryImages(Arrays.asList(
                        R.drawable.chitral,
                        R.drawable.shandur_pass,
                        R.drawable.kalash_valley
                ));
                chitral.setPlaceLocation(new LatLng(3.456789, 4.567890));
               chitral.setNearbyPlace(generateNearbySamplePlaces());
                //TODO: sE


                // Add chitral to the list of placeDetails
                placeDetails.add(chitral);

                //return Place Detail
                return placeDetails;


            }

}
