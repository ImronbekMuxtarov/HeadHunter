package org.example.dao;

import org.example.mapper.CityMapper;
import org.example.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CityDAOImpl implements CityDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<City> getCities() {
        return jdbcTemplate.query(
                "select ct.id, ct.name, ct.country_id, cn.name " +
                        "from cities ct " +
                        "join countries cn on ct.country_id = cn.id " +
                        "order by ct.id",
                new CityMapper()
        );
    }

    @Override
    public City getCityById(int id) {
        return jdbcTemplate.queryForObject(
                "select ct.id, ct.name, ct.country_id, cn.name " +
                        "from cities ct " +
                        "join countries cn on ct.country_id = cn.id " +
                        "where ct.id = ? " +
                        "order by ct.id",
                new Object[]{id},
                new CityMapper()
        );
    }

    @Override
    public List<City> getCitiesByCountryId(int countryId) {
        return jdbcTemplate.query(
                "select ct.id, ct.name, ct.country_id, cn.name " +
                        "from cities ct " +
                        "join countries cn on ct.country_id = cn.id " +
                        "where ct.country_id = ?",
                new Object[]{countryId},
                new CityMapper()
        );
    }

    @Override
    public void insertCity(City city) {
        jdbcTemplate.update(
                "insert into cities(country_id, name) values (?, ?)",
                city.getCountry().getId(),
                city.getName()
        );
    }

    @Override
    public void updateCity(int id, City city) {
        jdbcTemplate.update(
                "update cities set country_id = ?, name = ? where id = ?",
                city.getCountry().getId(),
                city.getName(),
                id
        );
    }

    @Override
    public void deleteCity(int id) {
        jdbcTemplate.update(
                "delete from cities where id = ?",
                id
        );
    }
}
