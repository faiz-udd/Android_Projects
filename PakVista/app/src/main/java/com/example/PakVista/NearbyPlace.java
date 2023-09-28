package com.example.PakVista;
public class NearbyPlace {
    private String name;
    private int imageResource;

    public NearbyPlace(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }
}

