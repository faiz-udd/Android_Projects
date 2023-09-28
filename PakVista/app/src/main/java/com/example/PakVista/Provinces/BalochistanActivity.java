package com.example.PakVista.Provinces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.PlaceDetails.GadaniBeachDetailActivity;
import com.example.PakVista.PlaceDetails.GawadarDetailActivity;
import com.example.PakVista.PlaceDetails.HingolNationalParkDetailActivity;
import com.example.PakVista.PlaceDetails.MehergarhDetailActivity;
import com.example.PakVista.MenuFragment;
import com.example.PakVista.PlaceDetails.OrmaraDetailActivity;
import com.example.PakVista.PlaceDetails.PirGhaibDetailActivity;
import com.example.PakVista.Place;
import com.example.PakVista.Adapters.PlaceAdapter;
import com.example.PakVista.PlaceDetails.QuettaDetailActivity;
import com.example.PakVista.R;
import com.example.PakVista.PlaceDetails.ZiaratDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class BalochistanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> allPlaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balochistan);

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
                    case "Gawadar Port":
                        destinationActivity = GawadarDetailActivity.class;
                        break;
                    case "Ziarat":
                        destinationActivity = ZiaratDetailActivity.class;
                        break;
                    case "Mehergarh Civilation":
                        destinationActivity = MehergarhDetailActivity.class;
                        break;
                    case "Gadani Beach":
                        destinationActivity = GadaniBeachDetailActivity.class;
                        break;
                    case "Ormara":
                        destinationActivity = OrmaraDetailActivity.class;
                        break;
                    case "Pir Ghaib":
                        destinationActivity = PirGhaibDetailActivity.class;
                        break;
                    case "Quetta":
                        destinationActivity = QuettaDetailActivity.class;
                        break;
                    case "Hingol National Park":
                        destinationActivity = HingolNationalParkDetailActivity.class;
                        break;
                    default:
                        destinationActivity = MenuFragment.class; // Fallback activity
                        break;
                }

                Intent intent = new Intent(BalochistanActivity.this, destinationActivity);
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
        places.add(new Place("Gawadar Port", R.drawable.gawadar_port));
        places.add(new Place("Ziarat", R.drawable.quid_e_azam_house_ziarat));
        places.add(new Place("Mehergarh Civilation", R.drawable.mehrgarh_civilization));
        places.add(new Place("Gadani Beach", R.drawable.gadani_beach));
        places.add(new Place("Ormara", R.drawable.ormara_city));
        places.add(new Place("Pir Ghaib", R.drawable.pir_ghaib));
        places.add(new Place("Quetta", R.drawable.quetta));
        places.add(new Place("Hingol National Park", R.drawable.mud_volcano_hingol));

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