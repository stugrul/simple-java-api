package com.example.simplejavaapi.service;

import com.example.simplejavaapi.domain.Country;

import java.util.HashMap;
import java.util.Map;

public class CountriesService {

    private static Map<Integer, Country> countryMap;

    static {
        countryMap = new HashMap<>();
        countryMap.put(1, new Country(1, "UK", "London", "Big Ben", 70000000));
        countryMap.put(2, new Country(2, "Turkey", "Ankara", "Hagia Sophia", 80000000));
    }
    public CountriesService() {
    }

    public Map<Integer, Country> getCountries() {

        return countryMap;
    }

    public Country getCountry(int id) {
        return countryMap.get(id);
    }

    public void create(Country country) {
        countryMap.put(country.getId(), country);
    }
}
