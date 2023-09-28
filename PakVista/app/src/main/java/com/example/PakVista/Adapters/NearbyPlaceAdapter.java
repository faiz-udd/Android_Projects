package com.example.PakVista.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.PakVista.NearbyPlace;
import com.example.PakVista.R;

import java.util.List;

public class NearbyPlaceAdapter extends RecyclerView.Adapter<NearbyPlaceAdapter.PlaceViewHolder> {

    private Context context;
    private List<NearbyPlace> nearbyPlaces;
    private OnItemClickListener itemClickListener; // Instance variable

    public interface OnItemClickListener {
        void onItemClick(NearbyPlace nearbyPlace);
    }


    public NearbyPlaceAdapter(Context context, List<NearbyPlace> nearbyPlaces) {
        this.context = context;
        this.nearbyPlaces = nearbyPlaces;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_nearby, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        NearbyPlace nearbyPlace = nearbyPlaces.get(position);
        holder.placeImageView.setImageResource(nearbyPlace.getImageResource());
        holder.placeNameTextView.setText(nearbyPlace.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (itemClickListener != null) {
                    itemClickListener.onItemClick(nearbyPlace);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return nearbyPlaces.size();
    }

    public void setPlaces(List<NearbyPlace> nearbyPlaces) {
        this.nearbyPlaces= nearbyPlaces;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;

    }

    class PlaceViewHolder extends RecyclerView.ViewHolder {
        ImageView placeImageView;
        TextView placeNameTextView;

        PlaceViewHolder(@NonNull View itemView) {
            super(itemView);
            placeImageView = itemView.findViewById(R.id.placeImage);
            placeNameTextView = itemView.findViewById(R.id.placeName);
        }
    }

}

