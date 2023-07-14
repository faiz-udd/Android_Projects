package com.example.practicelessons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView recycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recycleView.findViewById(R.id.RecylerView);

        //Setting Layout manager on View
        recycleView.setLayoutManager(new LinearLayoutManager(this));


        //so we have a structure for contact in java class, now we will make an arraylist of it,
        //and add different contact number details.
        ArrayList<contact_Model> arrContact = new ArrayList<>();


        //Add Contacts;
        arrContact.add(new contact_Model(R.drawable.img_1, "Ahmad", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_2, "Irfan", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_3, "Ali", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_4, "Khan", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_5, "Sajid", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_6, "Faiza", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_7, "Ana", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_8, "ELa", "034471250"));
        arrContact.add(new contact_Model(R.drawable.img_9, "Anaya", "034471250"));
       


        //We have creater Custom Adapter now let's call to view our data in our Adapter.

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContact);
        recycleView.setAdapter(adapter);


    }
}