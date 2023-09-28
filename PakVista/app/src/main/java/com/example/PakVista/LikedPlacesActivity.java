package com.example.PakVista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.Adapters.PlaceAdapter;
import com.example.PakVista.PlaceDetails.DeosaiNationalParkDetailActivity;
import com.example.PakVista.PlaceDetails.FairyMeadowsDetailActivity;
import com.example.PakVista.PlaceDetails.HunzaValleyActivity;
import com.example.PakVista.PlaceDetails.IslamabadDetailActivity;
import com.example.PakVista.PlaceDetails.KaghanValleyActivity;
import com.example.PakVista.PlaceDetails.KarachiDetailActivity;
import com.example.PakVista.PlaceDetails.LahoreDetailActivity;
import com.example.PakVista.PlaceDetails.NeelamValleyActivity;
import com.example.PakVista.PlaceDetails.RawalPindiDetailActivity;

import java.util.ArrayList;
import java.util.List;

public class LikedPlacesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> allPlaces;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liked_places);

        SearchView searchView = findViewById(R.id.searchView);
        recyclerView = findViewById(R.id.placesRecyclerView);

        // Set up the RecyclerView with a GridLayoutManager
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Initialize the list of all places
        allPlaces = generateSamplePlaces();

        // Create an instance of the PlaceAdapter and set it on the RecyclerView
        placeAdapter = new PlaceAdapter(this, allPlaces);
        recyclerView.setAdapter(placeAdapter);


        // Set the click listener for the adapter
        placeAdapter.setOnItemClickListener(new PlaceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Place place) {
                Class<?> destinationActivity;

                switch (place.getName()) {
                    case "Skardu":
                        destinationActivity = SkarduDetailActivity.class;
                        break;
                    case "Hunza Valley":
                        destinationActivity = HunzaValleyActivity.class;
                        break;
                    case "Fairy Meadows":
                        destinationActivity = FairyMeadowsDetailActivity.class;
                        break;
                    case "Islamabad":
                        destinationActivity = IslamabadDetailActivity.class;
                        break;
                    case "Karachi":
                        destinationActivity = KarachiDetailActivity.class;
                        break;
                    case "Rawalpindi":
                        destinationActivity = RawalPindiDetailActivity.class;
                        break;
                    case "Naran Kaghan":
                        destinationActivity = KaghanValleyActivity.class;
                        break;
                    case "Neelam Valley":
                        destinationActivity = NeelamValleyActivity.class;
                        break;
                    case "Deosai National Park":
                        destinationActivity = DeosaiNationalParkDetailActivity.class;
                        break;
                    case "Badshahi Mosque Lahore":
                        destinationActivity = LahoreDetailActivity.class;
                        break;
                    default:
                        destinationActivity = MenuFragment.class; // Fallback activity
                        break;
                }

                Intent intent = new Intent(LikedPlacesActivity.this, destinationActivity);
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
        places.add(new Place("Skardu", R.drawable.skardu));
        places.add(new Place("Hunza Valley", R.drawable.hunza_valley));
        places.add(new Place("Fairy Meadows", R.drawable.fairy_meadows));
        places.add(new Place("Islamabad", R.drawable.islamabad_));
        places.add(new Place("Karachi", R.drawable.karachi));
        places.add(new Place("Rawalpindi", R.drawable.rawalpindi));
        places.add(new Place("Naran Kaghan", R.drawable.kaghan_valley));
        places.add(new Place("Neelam Valley", R.drawable.neelum_valley_kashmir));
        places.add(new Place("Deosai National Park", R.drawable.sheoser_lake_deosai_national_park));
        places.add(new Place("Badshahi Mosque Lahore", R.drawable.mosque_lahore));
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
