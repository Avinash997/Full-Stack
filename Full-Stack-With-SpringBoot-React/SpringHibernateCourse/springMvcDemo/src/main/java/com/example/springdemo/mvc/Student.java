package com.example.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;

    private String country;

    private LinkedHashMap<String,String> countryOptions;

    private String favouriteLanguage;

    private String[] os;

    public Student() {

        // populate the country options: used ISO country code
        countryOptions = new LinkedHashMap<>();

        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("DE","Germany");
        countryOptions.put("IN","india");
        countryOptions.put("US","United States of America");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String[] getOs() {
        return os;
    }

    public void setOs(String[] os) {
        this.os = os;
    }
}