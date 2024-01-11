package org.example.service;

import org.example.model.City;

import java.util.List;

public interface CityService {
    City getCityById(int id);
    List<City> getCities();
    List<City> getCitiesByCountryId(int countryId);
    void insertCity(int countryId, String name);
    void deleteCity(int id);
    void updateCity(int id, int countryId, String name);
}
