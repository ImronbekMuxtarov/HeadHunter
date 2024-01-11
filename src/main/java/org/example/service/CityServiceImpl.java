package org.example.service;

import org.example.dao.CityDAO;
import org.example.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{
    @Autowired
    CityDAO cityDAO;

    @Override
    public City getCityById(int id) {
        return cityDAO.getCityById(id);
    }

    @Override
    public List<City> getCities() {
        return cityDAO.getCities();
    }

    @Override
    public List<City> getCitiesByCountryId(int countryId) {
        return cityDAO.getCitiesByCountryId(countryId);
    }

    @Override
    public void insertCity(int countryId, String name) {
        cityDAO.insertCity(new City(countryId, name));
    }

    @Override
    public void deleteCity(int id) {
        cityDAO.deleteCity(id);
    }

    @Override
    public void updateCity(int id, int countryId, String name) {
        cityDAO.updateCity(id, new City(countryId, name));
    }
}
