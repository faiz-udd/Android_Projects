package com.example.PakVista.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.PakVista.NearbyPlace;
import com.example.PakVista.PlaceDetail;
import com.example.PakVista.R;
import com.google.android.gms.maps.MapView;


import java.util.List;

public class PlaceDetailAdapter extends RecyclerView.Adapter<PlaceDetailAdapter.PlaceViewHolder> {

    private Context context;
    private static List<PlaceDetail> placeDetails;
    private OnItemClickListener listener;


    public PlaceDetailAdapter(Context context, List<PlaceDetail> placeDetails) {
        this.context = context;
        this.placeDetails = placeDetails;

    }



    @NonNull
    @Override
    public PlaceDetailAdapter.PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.places_detail_item, parent, false);
        return new PlaceDetailAdapter.PlaceViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PlaceDetailAdapter.PlaceViewHolder holder, int position) {
        PlaceDetail placeDetail = placeDetails.get(position);

        // Set the main place image
        holder.placeImageView.setImageResource(placeDetail.getPlaceImage());

        // Set the place name and details
        holder.placeNameTextView.setText(placeDetail.getPlaceName());
        holder.placeNameDetailTextView.setText(placeDetail.getPlaceNameDetail());

        // Set the place description
        holder.placeDescriptionTextView.setText(placeDetail.getPlaceDescription());

        // Bind the gallery images (if available)
        if (placeDetail.getGalleryImages() != null && !placeDetail.getGalleryImages().isEmpty()) {
            GalleryAdapter galleryAdapter = new GalleryAdapter(context, placeDetail.getGalleryImages());
            holder.galleryRecyclerView.setAdapter(galleryAdapter);
        }

//      //   Bind the map location (if available)
//        if (placeDetail.getPlaceLocation() != null) {
//            MapView mapView = holder.placeLocation;
//            mapView.onCreate(null);
//            mapView.getMapAsync(googleMap -> {
//                googleMap.clear();
//                LatLng location = placeDetail.getPlaceLocation();
//                MarkerOptions markerOptions = new MarkerOptions()
//                        .position(location)
//                        .title("Place Location");
//                googleMap.addMarker(markerOptions);
//                CameraPosition cameraPosition = new CameraPosition.Builder()
//                        .target(location)
//                        .zoom(15)
//                        .build();
//                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
//            });
//        }


        // Bind nearby places (if available)
        // Bind nearby places (if available)
        if (placeDetail.getNearbyPlaces() != null) {
            NearbyPlaceAdapter nearbyPlaceAdapter = new NearbyPlaceAdapter(context, placeDetail.getNearbyPlaces());

            // Set the click listener for the nearby places adapter
            nearbyPlaceAdapter.setOnItemClickListener(new NearbyPlaceAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(NearbyPlace nearbyPlace) {
                    // Handle item click here
                    // You can pass the click event to the activity or fragment that uses the PlaceDetailAdapter
                    if (listener != null) {
                        listener.onItemClick(nearbyPlace);
                    }
                }
            });

            holder.nearbyRecyclerView.setAdapter(nearbyPlaceAdapter);
        }


    }
    public interface OnItemClickListener {
        void onItemClick(NearbyPlace nearbyPlace);
    }

    @Override
    public int getItemCount() {
        return placeDetails.size();
    }

    public void setPlaces(List<PlaceDetail> placeDetails) {
        this.placeDetails = placeDetails;
        notifyDataSetChanged();
    }

    static class PlaceViewHolder extends RecyclerView.ViewHolder {
        ImageView placeImageView;
        TextView placeNameTextView;
        TextView placeNameDetailTextView;
        TextView placeDescriptionTextView;
        RecyclerView galleryRecyclerView;

        MapView placeLocation;
        RecyclerView nearbyRecyclerView;

        PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImageView = itemView.findViewById(R.id.placeImageView);
            placeNameTextView = itemView.findViewById(R.id.placeNameTextView);
            placeNameDetailTextView = itemView.findViewById(R.id.placeNameDetailTextView);
            placeDescriptionTextView = itemView.findViewById(R.id.placeDescriptionTextView);
            placeLocation =itemView.findViewById(R.id.mapView);

            galleryRecyclerView = itemView.findViewById(R.id.galleryRecyclerView);
            galleryRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));

            nearbyRecyclerView = itemView.findViewById(R.id.nearbyRecyclerView);
            int numberOfColumns = 2; // Set the number of columns you want in the grid
            nearbyRecyclerView.setLayoutManager(new GridLayoutManager(itemView.getContext(), numberOfColumns));


        }

    }
}
