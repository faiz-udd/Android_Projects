package com.example.PakVista;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class PlaceDetail {
    private int placeImage;
    private String placeName;
    private String placeNameDetail;
    private String placeDescription;
    private List<Integer> galleryImages;
    private LatLng placeLocation;
    private List<NearbyPlace> nearbyPlace;


    public PlaceDetail(int placeImage, String placeName, String placeNameDetail, String placeDescription,
                       List<Integer> galleryImages, LatLng placeLocation,
                       List<NearbyPlace> nearbyPlace) {
        this.placeImage = placeImage;
        this.placeName = placeName;
        this.placeNameDetail = placeNameDetail;
        this.placeDescription = placeDescription;
        this.galleryImages = galleryImages;
        this.placeLocation = placeLocation;
        this.nearbyPlace = nearbyPlace;

    }

    public PlaceDetail() {

    }

    // Getters
    public String getPlaceName() {
        return placeName;
    }

    public String getPlaceNameDetail() {
        return placeNameDetail;
    }

    public int getPlaceImage() {
        return placeImage;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public List<Integer> getGalleryImages() {
        return galleryImages;
    }

    public LatLng getPlaceLocation() {
        return placeLocation;
    }


    public List<NearbyPlace> getNearbyPlaces() {
        return nearbyPlace;
    }

    // Setters
    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setPlaceNameDetail(String placeNameDetail) {
        this.placeNameDetail = placeNameDetail;
    }

    public void setPlaceImage(int placeImage) {
        this.placeImage = placeImage;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public void setGalleryImages(List<Integer> galleryImages) {
        this.galleryImages = galleryImages;
    }

    public void setPlaceLocation(LatLng placeLocation) {

        this.placeLocation = placeLocation;
    }

    public void setNearbyPlace(List<NearbyPlace> nearbyPlace) {
        this.nearbyPlace = nearbyPlace;
    }

}
