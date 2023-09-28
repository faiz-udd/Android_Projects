package com.example.PakVista.Provinces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.PlaceDetails.GorakhHillStationDetailActivity;
import com.example.PakVista.PlaceDetails.HyderabadDetailActivity;
import com.example.PakVista.PlaceDetails.KarachiDetailActivity;
import com.example.PakVista.PlaceDetails.MakliNecropolisDetailActivity;
import com.example.PakVista.MenuFragment;
import com.example.PakVista.PlaceDetails.MohattaPalaceDetailActivity;
import com.example.PakVista.PlaceDetails.MohenjoDaroDetailActivity;
import com.example.PakVista.Place;
import com.example.PakVista.Adapters.PlaceAdapter;
import com.example.PakVista.PlaceDetails.EmpressMarketDetailActivity;
import com.example.PakVista.R;
import com.example.PakVista.SindhMuseumDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class SindhActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
        private PlaceAdapter placeAdapter;
        private List<Place> allPlaces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sindh);


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
                    case "Karachi":
                        destinationActivity = KarachiDetailActivity.class;
                        break;
                    case "Mohenjo_Daro":
                        destinationActivity = MohenjoDaroDetailActivity.class;
                        break;
                    case "Hyderabad":
                        destinationActivity = HyderabadDetailActivity.class;
                        break;
                    case "Makli Necropolis":
                        destinationActivity = MakliNecropolisDetailActivity.class;
                        break;
                    case "Sindh Museum":
                        destinationActivity = SindhMuseumDetailActivity.class;
                        break;
                    case "Gorakh Hill Station":
                        destinationActivity = GorakhHillStationDetailActivity.class;
                        break;
                    case "Mohatta Palace Museum":
                        destinationActivity = MohattaPalaceDetailActivity.class;
                        break;
                    case "Empress Market":
                        destinationActivity = EmpressMarketDetailActivity.class;
                        break;
                    default:
                        destinationActivity = MenuFragment.class; // Fallback activity
                        break;
                }

                Intent intent = new Intent(SindhActivity.this, destinationActivity);
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
            places.add(new Place("Karachi", R.drawable.karachi));
            places.add(new Place("Mohenjo_Daro", R.drawable.mohenjo_daro_sites));
            places.add(new Place("Hyderabad", R.drawable.hyderabad_evening));
            places.add(new Place("Makli Necropolis", R.drawable.makli_necropolis));
            places.add(new Place("Sindh Museum", R.drawable.sindh_museum));
            places.add(new Place("Gorakh Hill Station", R.drawable.gorakh_hilltop));
            places.add(new Place("Mohatta Palace Museum", R.drawable.mohatta_palace_karachi));
            places.add(new Place("Empress Market", R.drawable.empress_market));
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