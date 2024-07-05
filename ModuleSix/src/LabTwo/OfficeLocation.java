/*
Author: Angel Chavez
Assignment: Module Six Lab Two
Date: 4/8/2024
Language: Java
Description: class that is aggregated into MedicalProvider with location name and address attributes.
*/
package LabTwo;

import java.util.Objects;

public class OfficeLocation {
    //instance variables
    private String locationName, city, zip, streetAddress, state;

    //constructors
    public OfficeLocation(String locationName, String city, String zip, String streetAddress, String state) {
        this.locationName = locationName;
        this.city = city;
        this.zip = zip;
        this.streetAddress = streetAddress;
        this.state = state;
    }

    public OfficeLocation() {
        this.locationName = "none";
        this.city = "none";
        this.zip = "none";
        this.streetAddress = "none";
        this.state = "none";
    }

    public OfficeLocation(OfficeLocation pOfficeLocation) {
        this.locationName = pOfficeLocation.locationName;
        this.city = pOfficeLocation.city;
        this.zip = pOfficeLocation.zip;
        this.streetAddress = pOfficeLocation.streetAddress;
        this.state = pOfficeLocation.state;
    }

    //getters and setters
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //functions


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OfficeLocation that)) return false;
        return Objects.equals(getLocationName(), that.getLocationName()) && Objects.equals(getCity(), that.getCity())
                && Objects.equals(getZip(), that.getZip()) && Objects.equals(getStreetAddress(), that.getStreetAddress())
                && Objects.equals(getState(), that.getState());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLocationName(), getCity(), getZip(), getStreetAddress(), getState());
    }

    @Override
    public String toString() {
        return "\t*** OfficeLocation ***" + "\n" +
                "Location Name: " + locationName + "\n" +
                "City: " + city + "\n" +
                "Zip: " + zip + "\n" +
                "Street Address: " + streetAddress + "\n" +
                "State: " + state;
    }
}
