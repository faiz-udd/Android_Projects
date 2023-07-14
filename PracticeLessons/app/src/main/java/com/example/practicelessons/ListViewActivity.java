package com.example.practicelessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    ListView ListView;
    ArrayList<String> arrNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView = findViewById(R.id.ListView1);

        //add Items to arrName
        arrNames.add("Anara");
        arrNames.add("Anusha");
        arrNames.add("Anita");
        arrNames.add("Anabiya");
        arrNames.add("Aira");
        arrNames.add("Alia");
        arrNames.add("Sana");
        arrNames.add("Sara");
        arrNames.add("Saima");
        arrNames.add("Faiza");
        arrNames.add("Nana");
        arrNames.add("Mahpara");
        arrNames.add("Mehroosh");
        arrNames.add("Mehwish");
        arrNames.add("Meral");
        arrNames.add("Saira");
        arrNames.add("Sadia");
        arrNames.add("Yumna");
        arrNames.add("Parveen");
        arrNames.add("Shaista");
        arrNames.add("Fatima");
        arrNames.add("Samreen");
        arrNames.add("Naila");
        arrNames.add("Nimra");
        arrNames.add("Eman");
        arrNames.add("Sara");
        arrNames.add("Saima");
        arrNames.add("Faiza");
        arrNames.add("Nana");
        arrNames.add("Mahpara");
        arrNames.add("Mehroosh");
        arrNames.add("Mehwish");
        arrNames.add("Meral");
        arrNames.add("NextPage");






        //Now to use the array list in our listview and set up the data in the list view we
        //need to used array adapter! array adapter is a library which set up the data in given arraylist
        //in the list view.

        //for ListView

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);
        ListView.setAdapter(adapter);



        //now what if we want to do some activity when each item is click in our listview.we have to
        //put setOnItemClickListerner () method and define function of each item up clicking.

        ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {

                //Here we will define the Activiy which we want to perform on each object or our arraylist
                //one by one by thier indexing.
               for(int i=0; i<=index; i++){
                   Toast.makeText(ListViewActivity.this, "Hello This is: "+arrNames.get(index) , Toast.LENGTH_SHORT).show();
                   if(index ==33){
                       Intent inext = new Intent(ListViewActivity.this, Spinner_AutoCompleteViewActivity.class);
                       startActivity(inext);
                   }

                   break;
               }
            }
        });

    }
}