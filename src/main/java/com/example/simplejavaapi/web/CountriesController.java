package com.example.simplejavaapi.web;

import com.example.simplejavaapi.domain.Country;
import com.example.simplejavaapi.web.service.CountriesService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "api/countries")
public class CountriesController {

    private CountriesService countriesService;

    public CountriesController() {
        countriesService = new CountriesService();
    }

    @GetMapping(produces = "application/json")
    public Map<Integer, Country> getCountries() {
        return countriesService.getCountries();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Country getCountryById(@PathVariable int id) {
        return countriesService.getCountry(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCountry(@RequestBody Country country) {
        countriesService.create(country);
    }


}
