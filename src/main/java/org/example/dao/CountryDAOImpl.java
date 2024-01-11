package org.example.dao;

import org.example.mapper.CountryMapper;
import org.example.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CountryDAOImpl implements CountryDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Country> getCountries() {
        return jdbcTemplate.query(
                "select * from countries order by id",
                new CountryMapper()
        );
    }

    @Override
    public Country getCountryById(int id) {
        return jdbcTemplate.queryForObject(
                "select * from countries where id = ?",
                new Object[]{id},
                new CountryMapper()
        );
    }

    @Override
    public void insertCountry(Country country) {
        jdbcTemplate.update(
                "insert into countries(name) values (?)",
                country.getName()
        );
    }

    @Override
    public void deleteCountry(int id) {
        jdbcTemplate.update(
                "delete from countries where id = ?",
                id
        );
    }

    @Override
    public void updateCountry(int id, Country country) {
        jdbcTemplate.update(
                "update countries set name = ? where id = ?",
                country.getName(),
                id
        );
    }
}
