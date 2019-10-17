package com.example.simplejavaapi.domain;

public class Country {
    public Country() {}

    public Country(int id, String name, String capitalCity, String landmark, int population) {
        this.id = id;
        this.name = name;
        this.capitalCity = capitalCity;
        this.landmark = landmark;
        this.population = population;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    private String capitalCity;

    private String landmark;

    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
