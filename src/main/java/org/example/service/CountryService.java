package org.example.service;

import org.example.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> getCountries();
    Country getCountryById(int id);
    void insertCountry(String name);
    void updateCountry(int id, String name);
    void deleteCountry(int id);
}
