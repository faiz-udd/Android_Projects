package com.example.PakVista.Provinces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.PlaceDetails.GhizerDetailActivity;
import com.example.PakVista.PlaceDetails.GilgitCityActivity;
import com.example.PakVista.PlaceDetails.HunzaValleyActivity;
import com.example.PakVista.PlaceDetails.K2DetailActivity;
import com.example.PakVista.PlaceDetails.KhapluValleyDetailActivity;
import com.example.PakVista.MenuFragment;
import com.example.PakVista.PlaceDetails.NagarValleyDetailActivity;
import com.example.PakVista.Place;
import com.example.PakVista.Adapters.PlaceAdapter;
import com.example.PakVista.PlaceDetails.DeosaiNationalParkDetailActivity;
import com.example.PakVista.PlaceDetails.FairyMeadowsDetailActivity;
import com.example.PakVista.R;
import com.example.PakVista.PlaceDetails.ShigarValleyDetailActivity;
import com.example.PakVista.SkarduDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class GBActivity extends AppCompatActivity{
    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> allPlaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gbactivity);


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
                    case "Hunza Valley":
                        destinationActivity = HunzaValleyActivity.class;
                        break;
                    case "K2":
                        destinationActivity = K2DetailActivity.class;
                        break;
                    case "Fairy Meadows":
                        destinationActivity = FairyMeadowsDetailActivity.class;
                        break;
                    case "Skardu":
                        destinationActivity = SkarduDetailActivity.class;
                        break;
                    case "Shigar Valley":
                        destinationActivity = ShigarValleyDetailActivity.class;
                        break;
                    case "Deosai National Park":
                        destinationActivity = DeosaiNationalParkDetailActivity.class;
                        break;
                    case "Gilgit City":
                        destinationActivity = GilgitCityActivity.class;
                        break;
                    case "Nagar Valley":
                        destinationActivity = NagarValleyDetailActivity.class;
                        break;
                    case "Ghizer":
                        destinationActivity = GhizerDetailActivity.class;
                        break;
                    case "Khaplu Valley":
                        destinationActivity = KhapluValleyDetailActivity.class;
                        break;
                    default:
                        destinationActivity = MenuFragment.class; // Fallback activity
                        break;
                }

                Intent intent = new Intent(GBActivity.this, destinationActivity);
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
        places.add(new Place("Hunza Valley", R.drawable.hunza_valley));
        places.add(new Place("K2", R.drawable.k2_mountain));
        places.add(new Place("Fairy Meadows", R.drawable.fairy_meadows));
        places.add(new Place("Skardu", R.drawable.skardu));
        places.add(new Place("Shigar Valley", R.drawable.shigar_fort));
        places.add(new Place("Deosai National Park", R.drawable.sheoser_lake_deosai_national_park));
        places.add(new Place("Gilgit City", R.drawable.gilgit));
        places.add(new Place("Nagar Valley", R.drawable.hopar_nagar_valley));
        places.add(new Place("Ghizer", R.drawable.phandar_lake_ghizer));
        places.add(new Place("Khaplu Valley", R.drawable.khaplu_palace));



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