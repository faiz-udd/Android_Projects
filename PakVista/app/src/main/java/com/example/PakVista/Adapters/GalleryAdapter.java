package com.example.PakVista.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.PakVista.R;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    private Context context;
    private List<Integer> galleryImages; // Use Integer type for drawable resource IDs

    public GalleryAdapter(Context context, List<Integer> galleryImages) {
        this.context = context;
        this.galleryImages = galleryImages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_gallery, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int imageResourceId = galleryImages.get(position); // Get the resource ID
        holder.galleryImage.setImageResource(imageResourceId); // Set the image resource directly
    }

    @Override
    public int getItemCount() {
        return galleryImages.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView galleryImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            galleryImage = itemView.findViewById(R.id.place_image);
        }
    }
}
