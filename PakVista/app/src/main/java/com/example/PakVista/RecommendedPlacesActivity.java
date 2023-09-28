package com.example.PakVista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.Adapters.PlaceAdapter;
import com.example.PakVista.PlaceDetails.GalliyatRegionActivity;
import com.example.PakVista.PlaceDetails.GawadarDetailActivity;
import com.example.PakVista.PlaceDetails.HunzaValleyActivity;
import com.example.PakVista.PlaceDetails.IslamabadDetailActivity;
import com.example.PakVista.PlaceDetails.KaghanValleyActivity;
import com.example.PakVista.PlaceDetails.KalashValleyActivity;
import com.example.PakVista.PlaceDetails.KarachiDetailActivity;
import com.example.PakVista.PlaceDetails.LahoreDetailActivity;
import com.example.PakVista.PlaceDetails.MohenjoDaroDetailActivity;
import com.example.PakVista.PlaceDetails.PeshawarActivity;

import java.util.ArrayList;
import java.util.List;

public class RecommendedPlacesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> allPlaces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended_places);

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
                    case "Badshahi Mosque Lahore":
                        destinationActivity = LahoreDetailActivity.class;
                        break;
                    case "Mohenjo Daro":
                        destinationActivity = MohenjoDaroDetailActivity.class;
                        break;
                    case "Kalash Valley":
                        destinationActivity = KalashValleyActivity.class;
                        break;
                    case "Hunza Valley":
                        destinationActivity = HunzaValleyActivity.class;
                        break;
                    case "Karachi":
                        destinationActivity = KarachiDetailActivity.class;
                        break;
                    case "Kaghan Valley":
                        destinationActivity = KaghanValleyActivity.class;
                        break;
                    case "Galiyat Region":
                        destinationActivity = GalliyatRegionActivity.class;
                        break;
                    case "Peshawar":
                        destinationActivity = PeshawarActivity.class;
                        break;
                    case "Islamabad":
                        destinationActivity = IslamabadDetailActivity.class;
                        break;
                    case "Gawadar":
                        destinationActivity = GawadarDetailActivity.class;
                        break;
                    // Add more cases for other places

                    default:
                        destinationActivity = MenuFragment.class; // Fallback activity
                        break;
                }

                Intent intent = new Intent(RecommendedPlacesActivity.this, destinationActivity);
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
        places.add(new Place("Badshahi Mosque Lahore", R.drawable.mosque_lahore));
        places.add(new Place("Mohenjo Daro", R.drawable.mohenjo_daro_sites));
        places.add(new Place("Kalash Valley", R.drawable.kaghan_valley));
        places.add(new Place("Hunza Valley", R.drawable.hunza_valley));
        places.add(new Place("Karachi", R.drawable.karachi));
        places.add(new Place("Kaghan Valley", R.drawable.kaghan_valley));
        places.add(new Place("Galiyat Region", R.drawable.galyat));
        places.add(new Place("Peshawar", R.drawable.peshawar));
        places.add(new Place("Islamabad", R.drawable.islamabad_));
        places.add(new Place("Gawadar", R.drawable.gawadar_port));

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