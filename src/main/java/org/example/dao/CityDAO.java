package org.example.dao;

import org.example.model.City;

import java.util.List;

public interface CityDAO {
    List<City> getCities();
    City getCityById(int id);
    List<City> getCitiesByCountryId(int countryId);
    void insertCity(City city);
    void updateCity(int id, City city);
    void deleteCity(int id);
}
