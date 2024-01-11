package org.example.dao;

import org.example.model.Country;

import java.util.List;

public interface CountryDAO {
    List<Country> getCountries();
    Country getCountryById(int id);
    void insertCountry(Country country);
    void deleteCountry(int id);
    void updateCountry(int id, Country country);
}
