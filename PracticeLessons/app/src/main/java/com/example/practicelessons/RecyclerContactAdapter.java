package com.example.practicelessons;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.ViewHolder> {

    //Constructor to get the context of the activity,
    Context context;
    RecyclerContactAdapter(Context context, ArrayList<contact_Model> arrContact){
        this.context = context;
        this.arrContact = arrContact;
    }
    ArrayList<contact_Model> arrContact;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //User inflater to inflate the data in our viewHolder and return the view Holder
       View view= LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contactImage.setImageResource(arrContact.get(position).img);
        holder.textName.setText(arrContact.get(position).name);
        holder.textNumber.setText(arrContact.get(position).number);

    }

    @Override
    public int getItemCount() {
        return arrContact.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textName, textNumber;
        ImageView contactImage;
         public ViewHolder(View itemView){
             super(itemView);

             //Here we are in Another Helping Class so we can't directly find our view, therefore we have
             //define our variable by refercne of the item view.
             textName = itemView.findViewById(R.id.contact_name);
             textNumber = itemView.findViewById(R.id.contact_number);
             contactImage = itemView.findViewById(R.id.contact_img);

             //Now to set data on these layouts, we have to go to databinder method.


         }
    }
}
