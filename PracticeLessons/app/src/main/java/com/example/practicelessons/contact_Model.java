package com.example.practicelessons;
//Here let's make a java class to set the data required for our recyclerview
//In our case we have basically threee vairables, One for imageview, other for contact Number view
//and Contact Name view.

public class contact_Model {
    int img;
    String name, number;

    //constructor
    public contact_Model(int img, String name, String number){
        this.img = img;
        this.name= name;
        this.number = number;
    }

}
