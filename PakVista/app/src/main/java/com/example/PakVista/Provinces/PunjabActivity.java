package com.example.PakVista.Provinces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.PlaceDetails.GujranwalaDetailActivity;
import com.example.PakVista.PlaceDetails.IslamabadDetailActivity;
import com.example.PakVista.PlaceDetails.JhelumDetailActivity;
import com.example.PakVista.PlaceDetails.LahoreDetailActivity;
import com.example.PakVista.MenuFragment;
import com.example.PakVista.PlaceDetails.MultanDetailActivity;
import com.example.PakVista.Place;
import com.example.PakVista.Adapters.PlaceAdapter;
import com.example.PakVista.PlaceDetails.BahawulpurDetailActivity;
import com.example.PakVista.PlaceDetails.FaisalAbadDetailActivity;
import com.example.PakVista.R;
import com.example.PakVista.PlaceDetails.RawalPindiDetailActivity;
import com.example.PakVista.PlaceDetails.SheikhuPuraDetailActivity;
import com.example.PakVista.PlaceDetails.SialkotDetailActivity;
import com.example.PakVista.PlaceDetails.TaxilaDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class PunjabActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> allPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);


        SearchView searchView = findViewById(R.id.searchView);
        recyclerView = findViewById(R.id.placesRecyclerView);

        // Set up the RecyclerView with a GridLayoutManager
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Initialize the list of all places
        allPlaces = generateSamplePlaces();

        // Create an instance of the PlaceAdapter and set it on the RecyclerView
        placeAdapter = new PlaceAdapter(this, allPlaces);
        recyclerView.setAdapter(placeAdapter);



        placeAdapter.setOnItemClickListener(new PlaceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Place place) {
                Class<?> destinationActivity;

                switch (place.getName()) {
                    case "Lahore":
                        destinationActivity = LahoreDetailActivity.class;
                        break;
                    case "Islamabad":
                        destinationActivity = IslamabadDetailActivity.class;
                        break;
                    case "Rawalpindi":
                        destinationActivity = RawalPindiDetailActivity.class;
                        break;
                    case "Taxila":
                        destinationActivity = TaxilaDetailActivity.class;
                        break;
                    case "Multan":
                        destinationActivity = MultanDetailActivity.class;
                        break;
                    case "Bahawulpur":
                        destinationActivity = BahawulpurDetailActivity.class;
                        break;
                    case "Faisalabad":
                        destinationActivity = FaisalAbadDetailActivity.class;
                        break;
                    case "Sialkot":
                        destinationActivity = SialkotDetailActivity.class;
                        break;
                    case "Sheikhupura":
                        destinationActivity = SheikhuPuraDetailActivity.class;
                        break;
                    case "Gujranwala":
                        destinationActivity = GujranwalaDetailActivity.class;
                        break;
                    case "Jhelum":
                        destinationActivity = JhelumDetailActivity.class;
                        break;
                    default:
                        destinationActivity = MenuFragment.class; // Fallback activity
                        break;
                }

                Intent intent = new Intent(PunjabActivity.this, destinationActivity);
                startActivity(intent);
            }
        });


        // Set a query listener for the SearchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Filter the list of places based on the search query
                List<Place> filteredPlaces = filterPlaces(newText);
                placeAdapter.setPlaces(filteredPlaces);
                return true;
            }
        });
    }

    // Generate sample places for demonstration
    private List<Place> generateSamplePlaces() {
        List<Place> places = new ArrayList<>();
        places.add(new Place("Lahore", R.drawable.mosque_lahore));
        places.add(new Place("Islamabad", R.drawable.islamabad_));
        places.add(new Place("Rawalpindi", R.drawable.rawalpindi));
        places.add(new Place("Taxila", R.drawable.taxila_stupa));
        places.add(new Place("Multan", R.drawable.mosque_multan));
        places.add(new Place("Bahawulpur", R.drawable.noor_mahal_bahawalpur));
        places.add(new Place("Faisalabad", R.drawable.clock_tower_faisalabad));
        places.add(new Place("Sialkot", R.drawable.clock_tower_sialkot));
        places.add(new Place("Sheikhupura", R.drawable.hiran_minar_sheikhupura));
        places.add(new Place("Gujranwala", R.drawable.nisha_e_manzil_gujranwala));
        places.add(new Place("Jhelum", R.drawable.major_akram_memorial_jhelum));
        // Add more places here
        return places;
    }

    // Filter places based on the search query
    private List<Place> filterPlaces(String query) {
        List<Place> filteredPlaces = new ArrayList<>();
        for (Place place : allPlaces) {
            if (place.getName().toLowerCase().contains(query.toLowerCase())) {
                filteredPlaces.add(place);
            }
        }
        return filteredPlaces;

    }
}