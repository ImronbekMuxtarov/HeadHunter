package org.example.service;

import org.example.dao.CountryDAO;
import org.example.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    CountryDAO countryDAO;

    @Override
    public List<Country> getCountries() {
        return countryDAO.getCountries();
    }

    @Override
    public Country getCountryById(int id) {
        return countryDAO.getCountryById(id);
    }

    @Override
    public void insertCountry(String name) {
        Country country = new Country(name);
        countryDAO.insertCountry(country);
    }

    @Override
    public void updateCountry(int id, String name) {
        Country country = new Country(name);
        countryDAO.updateCountry(id, country);
    }

    @Override
    public void deleteCountry(int id) {
        countryDAO.deleteCountry(id);
    }
}
