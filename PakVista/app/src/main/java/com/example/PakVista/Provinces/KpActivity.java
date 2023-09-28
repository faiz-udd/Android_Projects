package com.example.PakVista.Provinces;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.PakVista.PlaceDetails.GalliyatRegionActivity;
import com.example.PakVista.PlaceDetails.KaghanValleyActivity;
import com.example.PakVista.PlaceDetails.KalamActivity;
import com.example.PakVista.PlaceDetails.KhyberPassActivity;
import com.example.PakVista.PlaceDetails.MalamJabbaActivity;
import com.example.PakVista.MenuFragment;
import com.example.PakVista.PlaceDetails.PeshawarActivity;
import com.example.PakVista.Place;
import com.example.PakVista.Adapters.PlaceAdapter;
import com.example.PakVista.PlaceDetails.AyubiaNationalParkActivity;
import com.example.PakVista.PlaceDetails.BunnerValleyActivity;
import com.example.PakVista.PlaceDetails.ChitralValleyActivity;
import com.example.PakVista.PlaceDetails.DeraIsmailKhanActivity;
import com.example.PakVista.PlaceDetails.DirKumratValleyActivity;
import com.example.PakVista.PlaceDetails.PunjkoraValleyActivity;
import com.example.PakVista.R;
import com.example.PakVista.PlaceDetails.ShandurPassActivity;
import com.example.PakVista.PlaceDetails.TakhtiBahiActivity;
import com.example.PakVista.PlaceDetails.swatValleyActivity;

import java.util.ArrayList;
import java.util.List;

public class KpActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceAdapter placeAdapter;
    private List<Place> allPlaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kp);

        SearchView searchView = findViewById(R.id.searchView);
        recyclerView = findViewById(R.id.placesRecyclerView);

        // Set up the RecyclerView with a GridLayoutManager
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        // Initialize the list of all places
        allPlaces = generateSamplePlaces();

        // Create an instance of the PlaceAdapter and set it on the RecyclerView
        placeAdapter = new PlaceAdapter(this, allPlaces);
        recyclerView.setAdapter(placeAdapter);

        //Onclick Listner on Each Place, Go to new Activity when the place is Clicked
        placeAdapter.setOnItemClickListener(new PlaceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Place place) {
                Class<?> destinationActivity;

                switch (place.getName()) {
                    case "Chitral Valley":
                        destinationActivity = ChitralValleyActivity.class;
                        break;
                    case "Sawat Valley":
                        destinationActivity = swatValleyActivity.class;
                        break;
                    case "Dir-Kumrat Valley":
                        destinationActivity = DirKumratValleyActivity.class;
                        break;
                    case "Peshawar":
                        destinationActivity = PeshawarActivity.class;
                        break;
                    case "Ayubia National Park":
                        destinationActivity = AyubiaNationalParkActivity.class;
                        break;
                    case "Khyber Pass":
                        destinationActivity = KhyberPassActivity.class;
                        break;
                    case "Bunner Valley":
                        destinationActivity = BunnerValleyActivity.class;
                        break;
                    case "Galliyat Region":
                        destinationActivity = GalliyatRegionActivity.class;
                        break;
                    case "Kaghan Valley":
                        destinationActivity = KaghanValleyActivity.class;
                        break;
                    case "Punjkora Valley":
                        destinationActivity = PunjkoraValleyActivity.class;
                        break;
                    case "Malam Jabba":
                        destinationActivity = MalamJabbaActivity.class;
                        break;
                    case "Shandur Pass":
                        destinationActivity = ShandurPassActivity.class;
                        break;
                    case "Takht-i-Bahi":
                        destinationActivity = TakhtiBahiActivity.class;
                        break;
                    case "Kalam":
                        destinationActivity = KalamActivity.class;
                        break;
                    case "Dera Ismail Khan":
                        destinationActivity = DeraIsmailKhanActivity.class;
                        break;
                    default:
                        destinationActivity = MenuFragment.class; // Fallback activity
                        break;
                }

                Intent intent = new Intent(KpActivity.this, destinationActivity);
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
        places.add(new Place("Chitral Valley", R.drawable.chitral));
        places.add(new Place("Sawat Valley", R.drawable.sawat_valley));
        places.add(new Place("Dir-Kumrat Valley", R.drawable.kumrat_dir));
        places.add(new Place("Peshawar", R.drawable.peshawar));
        places.add(new Place("Ayubia National Park", R.drawable.ayubia_national_park));
        places.add(new Place("Khyber Pass", R.drawable.khyberpass));
        places.add(new Place("Bunner Valley", R.drawable.bunir_masjid));
        places.add(new Place("Galliyat Region", R.drawable.galyat));
        places.add(new Place("Kaghan Valley", R.drawable.kaghan_valley));
        places.add(new Place("Punjkora Valley", R.drawable.panjkora_valley));
        places.add(new Place("Malam Jabba", R.drawable.malam_jabba));
        places.add(new Place("Shandur Pass", R.drawable.shandur_pass));
        places.add(new Place("Takht-i-Bahi", R.drawable.takht_i_bahi));
        places.add(new Place("Kalam", R.drawable.kalam));
        places.add(new Place("Dera Ismail Khan", R.drawable.di_khan));



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