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

public class IslamabadDetailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PlaceDetailAdapter placeDetailAdapter;
    private List<PlaceDetail> allPlacesDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_islamabad_detail);

                recyclerView = findViewById(R.id.contentRecyclerView3);

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

                PlaceDetail islamabad = new PlaceDetail();
                islamabad.setPlaceName("Islamabad");
                islamabad.setPlaceNameDetail("Where serenity and modernity harmonize in the heart of Pakistan");
                islamabad.setPlaceImage(R.drawable.islamabad_);
                islamabad.setPlaceDescription("Nestled between the picturesque Margalla Hills, Islamabad, the capital city of Pakistan, is a captivating blend of natural beauty and modern urban planning that beckons to tourists from around the world. Renowned for its meticulously designed infrastructure, lush green spaces, and an inviting ambiance, Islamabad offers a unique and enchanting experience for travelers. The city's masterful architecture, characterized by its clean lines and well-organized layout, showcases a harmonious fusion of contemporary and Islamic influences.\n" +
                        "\n" +
                        "One of Islamabad's prime attractions is its stunning Faisal Mosque, an architectural marvel and one of the largest mosques globally, which stands as a symbol of religious tolerance and tranquility. The neighboring Pakistan Monument, resembling a blossoming flower and representing the nation's unity, adds to the city's cultural richness. The Margalla Hills National Park presents nature enthusiasts with abundant hiking trails, lush forests, and diverse wildlife, making it an ideal escape for outdoor adventures.\n" +
                        "\n" +
                        "The city's diplomatic enclave hosts a multitude of embassies and diplomatic missions, contributing to its cosmopolitan vibe and fostering cultural exchange. Alongside modern shopping malls, you'll find bustling local markets, such as F-6 Super Market and Jinnah Super, offering traditional handicrafts, textiles, and flavorsome cuisine that tantalize the senses. The Lok Virsa Museum encapsulates Pakistan's rich cultural heritage through its exhibits, showcasing the nation's art, crafts, and folk traditions.\n" +
                        "\n" +
                        "Islamabad's well-kept parks and gardens, including Shakarparian Park and Rose & Jasmine Garden, offer serene retreats for leisurely strolls and picnics, providing respite from the urban bustle. The Rawal Lake, fringed by rolling hills, allows visitors to enjoy boating and fishing while relishing the breathtaking views. For history aficionados, the Taxila Museum and archaeological sites offer a glimpse into the region's ancient past, adding a layer of historical intrigue to the city's allure.\n" +
                        "\n" +
                        "Incorporating both modernity and cultural heritage, Islamabad seamlessly marries its contemporary infrastructure with a profound respect for tradition. The city's captivating skyline, accentuated by its innovative buildings and green spaces, is a testament to urban planning that prioritizes aesthetics and harmony. Whether you're exploring its bustling markets, immersing yourself in its historical artifacts, or simply relishing the tranquility of its parks, Islamabad is a multifaceted gem that encapsulates Pakistan's dynamic spirit and captivating beauty," +
                        " inviting travelers to embark on an unforgettable journey of discovery.");
                islamabad.setGalleryImages(Arrays.asList(
                        R.drawable.islamabad_, R.drawable.pakistan_monument_islamabad,
                        R.drawable.islamabad, R.drawable.supreme_court_islamabad
                ));
                islamabad.setPlaceLocation(new LatLng(3.456789, 4.567890));
//                islamabad.setNearbyPlacesImages(Arrays.asList(
//                        R.drawable.islamabad, R.drawable.pakistan_monument_islamabad, R.drawable.supreme_court_islamabad
//                ));
//                islamabad.setNearbyPlacesNames(Arrays.asList(
//                        "Faisal Mosque Islamabad", "Pakistan Monument Shakarparian", "Administration Area Islamabad"
//                ));
                placeDetails.add(islamabad);

                return placeDetails;
    }

}
